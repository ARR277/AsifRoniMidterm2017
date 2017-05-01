package design;

public class EmployeeInfo implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private static String companyName = "N/A";
	private static String department = "N/A";
	private static String benefit = "N/A";
	private int hoursPerWeek = 40;
	private String period = "Hourly";
	private String employeeName = "N/A";

	private int employeeId;
	private double workPerHour = 0.00;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*	EmployeeInfo Constructor
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
    public EmployeeInfo(String employeeName, int employeeId){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
    public EmployeeInfo(String employeeName, int employeeId, double workPerHour){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.workPerHour = workPerHour;
	}
    public EmployeeInfo(String employeeName, int employeeId, double workPerHour, int hoursPerWeek){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.workPerHour = workPerHour;
		this.hoursPerWeek = hoursPerWeek;
    }
    public EmployeeInfo(String employeeName, int employeeId, double workPerHour, int hoursPerWeek, String period){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.workPerHour = workPerHour;
		this.hoursPerWeek = hoursPerWeek;
		this.period = period;
    }
	
	public String getPeriod(){
		return period+" wage: $";
	}

	/*	EmployeeInfo method
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(double salary, int perform){
		int total=0;
		if(perform==5) total = (int)(salary*(0.10));
		else if(perform==4) total = (int)(salary*(0.08));
		else if(perform==3) total = (int)(salary*(0.06));
		else if(perform==2) total = (int)(salary*(0.04));
		else total = (int)(salary);
		return total;
	}
	
	/*	EmployeeInfo method
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeePension(double salary, int numOfYear){
		int total=0;
		double percent = 0.00;
		percent = numOfYear*0.05;
		total = (int)(52*salary*numOfYear*(1+percent))*3;
		return total;
	}
	
	public void setWorkPerHour(double workPerHour){
		this.workPerHour = workPerHour;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}
	public static void setDepartment(String department) {
		EmployeeInfo.department = department;
	}
	public static void setBenefit(String benefit) {
		EmployeeInfo.benefit = benefit;
	}
	
	//---------------------------------------------------------

	@Override
	public int employeeId() {
		// TODO Auto-generated method stub
		return employeeId;
	}
	
	@Override
	public String employeeName() {
		// TODO Auto-generated method stub
		return employeeName;
	}
	
	@Override
	public void assignDepartment() {
		// TODO Auto-generated method stub
		System.out.println(" "+department+" ");
	}
	
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		double salary;
		if(period.equalsIgnoreCase("weekly")) salary = workPerHour * hoursPerWeek;
		else if(period.equalsIgnoreCase("bi-weekly")) salary = 2*workPerHour * hoursPerWeek;
		else if(period.equalsIgnoreCase("semi-monthly")) salary = (13*workPerHour * hoursPerWeek)/6;
		else if(period.equalsIgnoreCase("monthly")) salary = (13*workPerHour * hoursPerWeek)/3;
		else if(period.equalsIgnoreCase("quarterly")) salary = 13*workPerHour * hoursPerWeek;
		else if(period.equalsIgnoreCase("annually")) salary = 52*workPerHour * hoursPerWeek;
		else salary = workPerHour;
		return (int) salary;
	}
	
	@Override
	public void benefitLayout() {
		// TODO Auto-generated method stub
		System.out.println(" "+benefit+" ");
	}
	
}
