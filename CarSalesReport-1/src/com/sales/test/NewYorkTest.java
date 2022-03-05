package com.sales.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sales.composite.NewYork;

public class NewYorkTest {

	@Test
	public void testGenerateReport() {
		NewYork csReport = new NewYork("BMW", 6, 763374);
		csReport.generateReport();
		assertNotNull(csReport);

	}
}
