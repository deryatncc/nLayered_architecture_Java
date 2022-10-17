package nLayered.business.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayered.business.abstracts.CourseService;
import nLayered.core.Logger;
import nLayered.dataAccess.abstracts.CourseDao;
import nLayered.entities.concretes.Course;

public class CourseManager implements CourseService {
	private CourseDao coursedao;
	private Logger[] loggers;

	public CourseManager(CourseDao coursedao,Logger[] loggers) {
		super();
		this.coursedao = coursedao;
		this.loggers = loggers;
	}

	List<Course> courses = new ArrayList<>();

	@Override
	public void add(Course course) throws Exception {
		for (Course course_ : courses) {
			if (course_.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course name can not be same");
			}

		}

		if (course.getCoursePrice() < 0) {
			throw new  Exception("The course price cannot be less than 0.");

			
		} else {
			System.out.println("The course has been added to the system.");
			this.coursedao.add(course);
			courses.add(course);
			for(Logger logger: loggers) {
				logger.logToSystem(course.getCourseName());
			}
		}
	}

	@Override
	public void delete(Course course) {
		System.out.println("The course has been deleted from the system.");
		this.coursedao.delete(course);
		for(Logger logger: loggers) {
			logger.logToSystem(course.getCourseName());
		}
	}

	@Override
	public void update(Course course) {
		if (course.getCoursePrice() < 0) {
			System.out.println("The update was not made because the course price cannot be less than 0.");
		} else {
			this.coursedao.update(course);
			for(Logger logger : loggers) {
				logger.logToSystem(course.getCourseName());
			}
		}

	}

}
