package se.erikalexandersson.adventofcode;

import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.erikalexandersson.adventofcode.days.Day22Part1;

public class Day22Part1Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() throws URISyntaxException {
		Map<String, String> grid = new HashMap<>();

		grid.put("0,0", ".");
		grid.put("1,0", ".");
		grid.put("2,0", "#");
		grid.put("0,1", "#");
		grid.put("1,1", ".");
		grid.put("2,1", ".");
		grid.put("0,2", ".");
		grid.put("1,2", ".");
		grid.put("2,2", ".");

		String currentPos = "1,1";

		Day22Part1.burst(grid, currentPos, 1);

		assertEquals("#", grid.get("1,1"));
	}

	@Test
	public void test2() throws URISyntaxException {
		Map<String, String> grid = new HashMap<>();

		grid.put("0,0", ".");
		grid.put("1,0", ".");
		grid.put("2,0", "#");
		grid.put("0,1", "#");
		grid.put("1,1", ".");
		grid.put("2,1", ".");
		grid.put("0,2", ".");
		grid.put("1,2", ".");
		grid.put("2,2", ".");

		String currentPos = "1,1";

		int expected = 41;

		int actual = Day22Part1.burst(grid, currentPos, 70);

		assertEquals(expected, actual);
	}

	@Test
	public void test3() throws URISyntaxException {
		Map<String, String> grid = new HashMap<>();

		grid.put("0,0", ".");
		grid.put("1,0", ".");
		grid.put("2,0", "#");
		grid.put("0,1", "#");
		grid.put("1,1", ".");
		grid.put("2,1", ".");
		grid.put("0,2", ".");
		grid.put("1,2", ".");
		grid.put("2,2", ".");

		String currentPos = "1,1";

		int expected = 5587;

		int actual = Day22Part1.burst(grid, currentPos, 10000);

		assertEquals(expected, actual);
	}

}
