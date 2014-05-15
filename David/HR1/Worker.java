class Worker extends Person {
	private double mSalary = 0.0;
	private String mEmail;
	public Worker(String passportSerialNumber,String name, String surname, Date birthDate, String email, double salary) {
		super(passportSerialNumber, name, surname, birthDate);
		mEmail = email;
		mSalary = salary;
	}
	public Worker(Person person, String email, double salary) {
		super(person.GetPassportSerialNumber(), person.GetName(), person.GetSurname(), person.GetBirthDate());
		mSalary = salary;
		mEmail = email;
	}
	
	public void Job() {
		System.out.println("Do everything what can.");
	}
	public void SetEmail(String email){
		mEmail = email;
	}
	public void SetSalary(double salary){
		mSalary = salary;
	}

	public double GetSalary() {
		return mSalary;
	}
	public String GetEmail() {
		return mEmail;
	}
}