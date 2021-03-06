package se.erikalexandersson.adventofcode.days;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day4Part2 {

	public static boolean checkValidity(String passphrase) {
		Map<String, Long> frequencies = Arrays.asList(passphrase.split("\\s+")).stream().map(str -> {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return frequencies.values().stream().filter(n -> n > 1).count() == 0;
	}

	public static void main(String args[]) {
		int valid = 0;

		try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource("Day4Input.txt").toURI()))) {
			valid += stream.filter(line -> checkValidity(line)).count();
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

		System.out.println(valid);
	}

}
