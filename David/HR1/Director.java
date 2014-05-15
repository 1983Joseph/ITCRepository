import java.util.*;
class Director extends Manager{
	protected List<Manager> mConsultants = null;
	WorkersRepository<Manager> mRepository = new WorkersRepository<Manager>();

	public Director(String passportSerialNumber, String name, String surname, Date dateOfBirth, String email, double salary,
			int roomNumber, int phoneNumber) {
		super(passportSerialNumber, name, surname, dateOfBirth, email, salary, roomNumber, phoneNumber);
	}
	public Director(Worker worker, int roomNumber, int phoneNumber) {
		super(worker, roomNumber, phoneNumber);
	}
	public Director(Manager manager) {
		super((Worker)manager,manager.GetRoomNumber(),manager.GetPhoneNumber());
	}
	public void AddManager(Manager manager) {
		if(mConsultants == null) {
			mConsultants = new ArrayList<Manager>();
		}
		mRepository.AddToRepository(manager, mConsultants);
	}
	public void RemoveManager(Manager manager) {
		if(mConsultants != null) {
			mRepository.RemoveFromRepository(manager, mConsultants);
		}
	}
	
	public void PrintManagers() {
		if(mConsultants != null) {
			mRepository.PrintRepository(mConsultants);
		}
	}
	
	@Override
	public void Job() {
		System.out.println("Responsible for company");
	}
	
}