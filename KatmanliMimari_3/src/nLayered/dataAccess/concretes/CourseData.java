package nLayered.dataAccess.concretes;

import nLayered.dataAccess.abstracts.CourseDao;
import nLayered.entities.concretes.Course;


public class CourseData implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course information has been added to the system.");
	}

	@Override
	public void delete(Course course) {
		System.out.println("course information has been deleted");

	}

	@Override
	public void update(Course course) {
		System.out.println("Course information has been updated.");
	}

}
