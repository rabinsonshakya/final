package com.cubic.ehr.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class ValidationTest {
	private Validation validation = new Validation();

	@Test
	public void lengthTest() {
		assertTrue("test pass", validation.validateLength("Basanta", 20, 2));
		assertFalse("test pass", validation.validateLength("B", 20, 2));
		assertFalse("test pass", validation.validateLength("asdfqwertrewqasdfvcxzd", 20, 2));
		assertFalse("test pass", validation.validateLength(null, 20, 2));
		// fail("Not yet implemented");
	}

	@Test
	public void emailTest() {
		assertTrue("test pass", validation.validateEmailId("rabinso2_@hackerrank.com"));
		assertFalse("test pass", validation.validateEmailId(null));
		assertFalse("test pass", validation.validateEmailId("adf"));

		// fail("Not yet implemented");
	}

	@Test
	public void deaTest() {
		assertTrue("test pass", validation.validateDeaNumber("qw1234567"));
		assertFalse("test pass", validation.validateDeaNumber("qw1234"));
		assertFalse("test pass", validation.validateDeaNumber(null));
		// fail("Not yet implemented");
	}

	@Test
	public void ageRangeTest() {
		assertTrue("test pass", validation.validateAgeRange(new Date(90, 1, 01), 80, 20));
		assertFalse("test pass", validation.validateAgeRange(new Date(99, 1, 01), 80, 20));
		assertFalse("test pass", validation.validateAgeRange(new Date(28, 1, 01), 80, 20));
		// assertFalse("test pass", validation.validateDeaNumber(null));
		// fail("Not yet implemented");
	}

	@Test
	public void phoneNumberTest() {
		assertTrue("test pass", validation.validatePhoneNumber("111-222-3333"));
		assertTrue("test pass", validation.validatePhoneNumber("1112223333"));
		assertTrue("test pass", validation.validatePhoneNumber("(111)-222-3333"));
		assertFalse("test pass", validation.validatePhoneNumber(null));
		assertFalse("test pass", validation.validatePhoneNumber("111-222-333"));
	}

	@Test
	public void faxNumberTest() {
		assertTrue("test pass", validation.validateFaxNumber("111-222-3333"));
		assertTrue("test pass", validation.validateFaxNumber("1112223333"));
		assertTrue("test pass", validation.validateFaxNumber("(111)-222-3333"));
		assertTrue("test pass", validation.validateFaxNumber(null));
		assertFalse("test pass", validation.validateFaxNumber("111-222-333"));
	}

	// @Test
	// public void gender() {
	// Gender M;
	// Gender G;
	// assertEquals(M, G);
	// }

}
