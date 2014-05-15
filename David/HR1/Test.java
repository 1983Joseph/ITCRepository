import java.io.Console;

public class Test{
	public static void main(String []argv) {
		Date date;
		String passportSerialNumber = new String();
		String name = new String();
		String surname = new String();
		String email = new String();

		int yearOfBirth = 0;
		int monthOfBirth = 0;
		int dayOfBirth = 0;
		double salary = 0.0;
		try {
			
			Console input = System.console();

			passportSerialNumber = input.readLine("Enter passport serial number: ");
			name = input.readLine("Enter name: ");
			surname = input.readLine("Enter surname: ");
			email = input.readLine("Enter email: ");
			yearOfBirth = Integer.parseInt(input.readLine("Enter bith of year: "));
			monthOfBirth = Integer.parseInt(input.readLine("Enter month of birth: "));
			dayOfBirth = Integer.parseInt(input.readLine("Enter day of birth: "));
			salary = Double.parseDouble(input.readLine("Enter salary: "));

			Worker worker = new Worker(passportSerialNumber, name, surname, new Date(yearOfBirth, monthOfBirth, dayOfBirth),
						email, salary);


			Worker worker1 = new Worker(passportSerialNumber, name, surname, new Date(yearOfBirth, monthOfBirth, dayOfBirth),
						email, salary);

			
			Manager manager = new Manager(worker,5,5);

			manager.RemoveWorker(worker);
			manager.Job();
			manager.AddWorker(worker);
			manager.AddWorker(worker1);
			manager.PrintWorkers();
			manager.RemoveWorker(worker);
			manager.PrintWorkers();

			Director director = new Director(manager);

			//director.RemoveManager(manager);
			director.Job();
			director.AddManager(manager);
			director.AddManager(manager);
			director.PrintManagers();
			director.RemoveManager(manager);
			director.PrintManagers();
			

		} catch(ExceptionDay exceptionDay) {
			System.out.println("Day is: " + exceptionDay.GetDay() + " " + "Month is :" + exceptionDay.GetMonth() 
				+ " but day must be betweem 1..." + exceptionDay.GetMaxDay());
		} catch(ExceptionMonth exceptionMonth) {
			System.out.println("Month is: " + exceptionMonth.GetMonth() + " but month must be between 1 ... 12");
		} catch(ExceptionDate exceptionDate) {
			System.out.println("Year is: " + exceptionDate.GetYear() + " but it must be between 1913 ... 2006");
		}
	}
}