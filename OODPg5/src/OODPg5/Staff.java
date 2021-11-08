package OODPg5;

public class Staff {
	private String name;
	private String gender;
	private int employeeID;
	private String jobTitle;
	
	//Constructors
	public Staff() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name of Staff");
		name = s.nextLine();
		System.out.println("Enter gender");
		gender = s.nextLine().charAt(0);
		employeeID = ID++;
		System.out.println("Enter Job Title");
		jobTitle = s.nextLine();
		System.out.printf("Employee %s (%c),%s, will be on duty today!");
	}
	public Staff(String name, String gender, int employeeID, String jobTitle) {
		this.name  = name;
		this.gender = gender;
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

}
