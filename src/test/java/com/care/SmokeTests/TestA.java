package com.care.SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {

	@Test()
	public void PassTest() {

		System.out.println('Test for success');
		Assert.assertEquals("qa@test.com", "qa@test.com");

	}
	
	@Test()
	public void FailTest() {

		System.out.println('Test for failure');
		Assert.assertEquals("qa@test.com", "qa@test.com");

	}

}

