package com.sales.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sales.command.NewCarSales;

public class NewCarSalesTest {

	@Test
	public void testExecute_California_BMW() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("California", "BMW  ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("6-4331400.0", s);
	}

	@Test
	public void testExecute_California_Benz() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("California", "Benz ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("5-4225200.0", s);
	}

	@Test
	public void testExecute_California_Honda() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("California", "Honda");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("3-1393140.0", s);
	}

	@Test
	public void testExecute_Texas_BMW() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("Texas", "BMW  ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("2-1463810.0", s);
	}

	@Test
	public void testExecute_Texas_Honda() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("Texas", "Honda");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("2-1128740.0", s);
	}

	@Test
	public void testExecute_Texas_Benz() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("Texas", "Benz ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("7-4725630.0", s);
	}

	@Test
	public void testExecute_NewYork_BMW() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("NewYork", "BMW  ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("4-3687600.0", s);
	}

	@Test
	public void testExecute_NewYork_Honda() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("NewYork", "Honda");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("5-3821900.0", s);
	}

	@Test
	public void testExecute_NewYork_Benz() {
		NewCarSales ncs = new NewCarSales();
		String s = ncs.execute("NewYork", "Benz ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("3-2235120.0", s);
	}
}
