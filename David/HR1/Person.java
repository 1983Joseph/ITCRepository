public class Person {	
	private String mPassportSerialNumber;
	private String mName;
	private String mSurname;
	private final Date mBirthDate;		

	public Person(String passportSerialNumber, String name, String surname, Date bithDate) {
		mPassportSerialNumber = passportSerialNumber;
		mName = name;
		mSurname = surname;
		mBirthDate = bithDate;		
	}
	
	public String GetPassportSerialNumber() {
		return mPassportSerialNumber;
	}
	public String GetName() {
		return mName;
	}
	public String GetSurname() {
		return mSurname;
	}
	public Date GetBirthDate() {
		return mBirthDate;
	}
	
	public void SetPasportSerialNumber(String passportSerialNumber) {
		mPassportSerialNumber = passportSerialNumber;
	}
	public void SetName(String name) {
		mName = name;
	}
	public void SetSurname(String surname) {
		mSurname = surname;
	}
	@Override
	public boolean equals(Object person) {
		if(person instanceof Person) { 
			return mPassportSerialNumber.equals(((Person)person).mPassportSerialNumber);
		}
		return false;
	}
}