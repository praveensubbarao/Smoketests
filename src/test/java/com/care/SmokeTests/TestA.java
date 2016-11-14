package com.care.SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {

	@Test()
	public void PassTest() {

		Assert.assertEquals("qa@test.com", "qa@test.com");

	}
	
	@Test()
	public void FailTest() {

		Assert.assertEquals("qa@test.com", "qa@test.com");

	}

}

