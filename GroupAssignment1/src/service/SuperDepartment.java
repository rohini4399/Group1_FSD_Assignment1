package service;
import interfaces.Departments;

public class SuperDepartment implements Departments{

	@Override
	public String departmentName() {
		
		return "Super department";
	}

	@Override
	public String getTodaysWork() {
		
		return "No work as of now";
	}

	@Override
	public String getWorkDeadline() {
		
		return "Nil";
	}

	@Override
	public String isTodayAHoliday() {
		
		return "Today is not a holiday";
	}
}