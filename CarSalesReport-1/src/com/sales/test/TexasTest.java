package com.sales.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sales.composite.Texas;

public class TexasTest {

	@Test
	public void testGenerateReport() {
		Texas csReport = new Texas("BMW", 6, 763374);
		csReport.generateReport();
		assertNotNull(csReport);

	}
}
