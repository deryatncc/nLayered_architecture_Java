package nLayered;

import nLayered.business.concretes.CategoryManager;
import nLayered.business.concretes.CourseManager;
import nLayered.business.concretes.InstructorManager;
import nLayered.core.HibernateLogger;
import nLayered.core.JdbcLogger;
import nLayered.core.Logger;
import nLayered.dataAccess.concretes.CategoryData;
import nLayered.dataAccess.concretes.CourseData;
import nLayered.dataAccess.concretes.InstructorData;
import nLayered.entities.concretes.Category;
import nLayered.entities.concretes.Course;
import nLayered.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new HibernateLogger(), new JdbcLogger() };
		Instructor instructor = new Instructor("Deniz ", "Derya");
		InstructorManager instructorManager = new InstructorManager(new InstructorData(), loggers);
		instructorManager.add(instructor);
		
		

		Category category = new Category("Programming Language");
        CategoryManager categoryManager = new CategoryManager(new CategoryData(), loggers);
        categoryManager.add(category);
        
        Course course = new Course("Java", 0, "Deniz Derya ", 30);
        CourseManager courseManager = new CourseManager(new CourseData(), loggers);
        courseManager.add(course);
       
 
       
       
     
        
        
	}
}