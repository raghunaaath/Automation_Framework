package com.rmajhi.constants;

public final class FrameworkConstants {

	private static final String CHROMEDRIVER_PATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

	
	private FrameworkConstants() {
		
	}
	
	public static String getChromedriverPath() {
		return CHROMEDRIVER_PATH;
	}
	
}
