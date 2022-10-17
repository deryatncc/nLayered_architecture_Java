package nLayered.business.concretes;

import nLayered.core.HibernateLogger;
import nLayered.core.Logger;
import nLayered.dataAccess.abstracts.InstructorDao;
import nLayered.entities.concretes.Instructor;

public class InstructorManager implements InstructorDao{
private InstructorDao instructorDao;
private Logger[] loggers;


	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
	super();
	this.instructorDao = instructorDao;
	this.loggers = loggers;
}

	@Override
	public void add(Instructor instructor) {
        System.out.println("Instructor added to the system");	
        this.instructorDao.add(instructor);
        for(Logger logger : loggers) {
        	logger.logToSystem(instructor.getInstructorFirstName() + instructor.getInstructorLastName());
        }
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("The instructor has been deleted from the system.");
		this.instructorDao.delete(instructor);
		for(Logger logger : loggers) {
			logger.logToSystem(instructor.getInstructorFirstName() + instructor.getInstructorLastName());
		}
	}

}
