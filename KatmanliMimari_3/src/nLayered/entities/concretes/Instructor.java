package nLayered.entities.concretes;

import nLayered.entities.abstracts.Entitiy;

public class Instructor implements Entitiy {
private String instructorFirstName;
private String instructorLastName;
public Instructor() {
	
}
public Instructor(String instructorFirstName, String instructorLastName) {
	super();
	this.instructorFirstName = instructorFirstName;
	this.instructorLastName = instructorLastName;
}
public String getInstructorFirstName() {
	return instructorFirstName;
}
public void setInstructorFirstName(String instructorFirstName) {
	this.instructorFirstName = instructorFirstName;
}
public String getInstructorLastName() {
	return instructorLastName;
}
public void setInstructorLastName(String instructorLastName) {
	this.instructorLastName = instructorLastName;
}

}
