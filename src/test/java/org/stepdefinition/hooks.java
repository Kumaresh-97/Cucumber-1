package org.stepdefinition;
import io.cucumber.java.*;

import java.io.IOException;

import org.helper.BaseClass;

public class hooks extends BaseClass {
	
	@Before
	public void beforescenario() {
		OpenEdge();
		launchurl("https://crooze.com.au/");
		maximize();
	}
	@After
	 public void afterScenario(Scenario s) throws IOException {
	String name = s.getName();
	String fileName = name.replace(" ", "-");
	screenshot(fileName);
	quit();
	}
}