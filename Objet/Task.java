package com.yogisen.javainteremdiaire;

public class Task {
	
	public String title;
	public String description;
	public boolean completed = false;
	
	public Task(String titre, String desc) {
		title = titre; 
		description = desc;
		
	}
	public void completed() {
		completed = true;
	}

}
