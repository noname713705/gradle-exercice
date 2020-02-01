package org.jhe.minimal.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class MiniTest {
	private Mini mini = new Mini();
	@Test
	public void testMethod() {
		assertTrue(mini.method());
	}
}
