import java.util.*;

class Manager extends Worker {
	private int mRoomNumber = 1;
	private int mPhoneNumber = 0;
	
	protected List<Worker> mWorkers = null;
	protected WorkersRepository<Worker> mRepository = new WorkersRepository<Worker>();

	public Manager(String passportSerialNumber, String name, String surname, Date dateOfBirth, String email, double salary,
			int roomNumber, int phoneNumber) {
		super(passportSerialNumber, name, surname, dateOfBirth, email, salary);
		mRoomNumber = roomNumber;
		mPhoneNumber = phoneNumber;
	}
	public Manager(Worker worker, int roomNumber, int phoneNumber) {
		super(worker.GetPassportSerialNumber(), worker.GetName(), worker.GetSurname(), worker.GetBirthDate(), worker.GetEmail(),
			worker.GetSalary());
		mRoomNumber = roomNumber;
		mPhoneNumber = phoneNumber;
	}
	
	public void SetPhoneNumber(int phoneNumber) {
		mPhoneNumber = phoneNumber;
	}
	public void SetRoomNumber(int roomNumber) {
		mRoomNumber = roomNumber;
	}

	public int GetPhoneNumber() {
		return mPhoneNumber;
	}
	public int GetRoomNumber() {
		return mRoomNumber;
	}

	public void AddWorker(Worker worker) {
		if(mWorkers == null) {
			mWorkers = new ArrayList<Worker>();
		}
		mRepository.AddToRepository(worker, mWorkers);

	}
	public boolean RemoveWorker(Worker worker) {
		if(mWorkers != null) {
			mRepository.RemoveFromRepository(worker, mWorkers);
			return true;
		}
		return false;
	}
	
	public void PrintWorkers() {
		if(mWorkers != null) {
			mRepository.PrintRepository(mWorkers);
		}
	}
	@Override
	public void Job() {
		System.out.println("Responsible for good job");
	}
}