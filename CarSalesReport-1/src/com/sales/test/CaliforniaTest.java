package com.sales.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sales.composite.California;

public class CaliforniaTest {

	@Test
	public void testGenerateReport() {
		California csReport = new California("BMW", 6, 763374);
		csReport.generateReport();
		assertNotNull(csReport);

	}
}
