package day44_constructors;

import java.util.*;

public class Dice {
	public static void main(String[] args) {

		Job job1 = new Job();

		Job job2 = new Job("Java Developer");

		Job job3 = new Job("SDET", "Amazon", 130_000.0);

		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());

		// create list of jobs and add 5 differ jobs with company and title

		ArrayList<Job> jobsList = new ArrayList<>();
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master", "Google", 12300));
		jobsList.add(new Job("SDET", "FreddieMac", 100000));
		jobsList.add(new Job("BA", "Leidos", 98000));
		jobsList.add(new Job("Senior QA Tester", "Delta", 15000));
		System.out.println(jobsList.toString());
		// find the highest paying job and print toString for that
		double maxSalary = 0;
		int highestIndex = -1;
		
		for(int i = 0; i < jobsList.size(); i++) {
			if(jobsList.get(i).getAnnualSalary() > maxSalary) {
				maxSalary = jobsList.get(i).getAnnualSalary();
				highestIndex = i;
			}
		}
		Job bestJob = jobsList.get(highestIndex);
		System.out.println("Highest Salary: " + bestJob.toString());
	}
}