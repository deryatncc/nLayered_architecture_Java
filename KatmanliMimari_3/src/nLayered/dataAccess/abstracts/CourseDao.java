package nLayered.dataAccess.abstracts;

import nLayered.entities.concretes.Course;

public interface CourseDao {
void add(Course course);
void delete(Course course);
void update(Course course);
}
