package com.yogisen.javainteremdiaire;

public class Tasktest {

	public static void main(String[] args) {
		
		Task task1 = new Task("Titre1" , "task 1 ", 60);
		Task task2 = new Task(" titre 2", "task 2 ", 80);
		Task task3 = new Task(" callme", "avant 8 heures ", 40);
		task2.completed();
		
		System.out.println(task1.title);
		System.out.println(task1.time);
		if (task1.time>40) {
			System.out.println("so long ");
			
		}
		System.out.println(task1.description);
		System.out.println(task1.completed);
		/*
		System.out.println(task2.title);
		System.out.println(task2.description);
		System.out.println(task2.completed);

		System.out.println(task3.title);
		System.out.println(task3.description);
		System.out.println(task3.completed);

		*/
		
	}

}
