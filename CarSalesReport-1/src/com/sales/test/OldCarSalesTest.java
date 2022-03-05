package com.sales.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sales.command.OldCarSales;

public class OldCarSalesTest {

	@Test
	public void testExecute_California_BMW() {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("California","BMW  ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("6-2320380", s);
	}
	
	@Test
	public void testExecute_California_Benz() {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("California","Benz ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("5-2533250", s);
	}
	
	@Test
	public void testExecute_California_Honda() {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("California","Honda");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("8-4139160", s);
	}
	
	@Test
	public void testExecute_Texas_BMW() {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("Texas","BMW  ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("3-1160190", s);
	}
	
	@Test
	public void testExecute_Texas_Honda() {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("Texas","Honda");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("6-3524370", s);
	}
	
	@Test
	public void testExecute_Texas_Benz () {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("Texas","Benz ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("4-2826600", s);
	}
	
	@Test
	public void testExecute_NewYork_BMW() {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("NewYork","BMW  ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("7-2707110", s);
	}
	
	@Test
	public void testExecute_NewYork_Honda() {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("NewYork","Honda");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("3-1762185", s);
	}
	
	@Test
	public void testExecute_NewYork_Benz () {
		OldCarSales ocs = new OldCarSales();
		String s = ocs.execute("NewYork","Benz ");
		System.out.println(s);
		assertNotNull(s);
		assertEquals("10-3066500", s);
	}
}
