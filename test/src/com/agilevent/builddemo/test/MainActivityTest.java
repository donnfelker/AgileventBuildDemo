package com.agilevent.builddemo.test;

import com.agilevent.builddemo.MainActivity;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super("com.agilevent.builddemo", MainActivity.class);
	}

	public void testSanity() {
		assertEquals(2, 1 + 1);
	}

}
