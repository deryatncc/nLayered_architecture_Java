package nLayered.dataAccess.abstracts;

import nLayered.entities.concretes.Instructor;

public interface InstructorDao {
 void add(Instructor instructor);
 void delete(Instructor instructor);
}
