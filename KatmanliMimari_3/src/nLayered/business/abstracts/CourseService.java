package nLayered.business.abstracts;

import nLayered.entities.concretes.Course;

public interface CourseService {
void add(Course course) throws Exception;
void delete(Course course);
void update(Course course);
}
