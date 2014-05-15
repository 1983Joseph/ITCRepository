import java.util.*;

class WorkersRepository<T extends Worker> {
	public boolean AddToRepository(T person, List<T> persons) {
		if(persons.contains(person)) {
			return false;
		}
		if(persons != null) {
			persons.add(person);
			return true;
		}
		return false;
	}
	public boolean RemoveFromRepository(T person, List<T> persons) {
		if(persons != null) {
			for(Iterator<T> iterator = persons.listIterator(); iterator.hasNext();) {
				T w = iterator.next();
				if(person.equals(w)) {
					iterator.remove();
					return true;
				}
			}
		}
		return false;
	}
	public void PrintRepository(List<T> persons) {
		if(persons != null) {
			for(Iterator<T> iterator = persons.listIterator(); iterator.hasNext();) {
				T person = iterator.next();
				System.out.println(person.GetPassportSerialNumber() + " : " + person.GetName() + " "
					 + person.GetSurname() + " " + person.GetEmail());
			}
		}	
	}
}