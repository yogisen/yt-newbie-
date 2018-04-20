package com.yogisen.javainteremdiaire;

public class Task {
	
	public String title;
	public String description;
	public int time;
	public boolean completed = false;
	public int recupere_tps;
	
	public Task(String titre, String desc, int time) {
		this.title = title;
		description = desc;
		this.time = time;
		/*		
		title = titre; 
		description = desc;
		time = temps;
		*/
	}
	public void completed()
	{
		completed = true;
	}

}
