package com.yogisen.javainteremdiaire;

public class Task {
	
	public String titre, description = "description";
	public boolean completed = false;
	
	public Task(String desc) {
		description = desc;
	}
	
	public void completed() {
		completed = true;
	}

}
