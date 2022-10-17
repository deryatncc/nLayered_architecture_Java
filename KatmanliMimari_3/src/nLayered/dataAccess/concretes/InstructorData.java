package nLayered.dataAccess.concretes;

import nLayered.dataAccess.abstracts.InstructorDao;
import nLayered.entities.concretes.Instructor;

public class InstructorData implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor information has been added to the system.");

	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Instructor information has been deleted.");

	}

}
