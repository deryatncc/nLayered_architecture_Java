package nLayered.entities.concretes;

import nLayered.entities.abstracts.Entitiy;

public class Course implements Entitiy{
private String courseName;
private int coursePrice;
private String courseInstructorName;
private int courseDurationHour;
public Course() {
	
}
public Course(String courseName, int coursePrice, String course_InstructorName, int courseDurationHour) {
	super();
	this.courseName = courseName;
	this.coursePrice = coursePrice;
	this.courseInstructorName = course_InstructorName;
	this.courseDurationHour = courseDurationHour;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getCoursePrice() {
	return coursePrice;
}
public void setCoursePrice(int coursePrice) {
	this.coursePrice = coursePrice;
}
public String getCourse_InstructorName() {
	return courseInstructorName;
}
public void setCourse_InstructorName(String course_InstructorName) {
	this.courseInstructorName = course_InstructorName;
}
public int getCourseDurationHour() {
	return courseDurationHour;
}
public void setCourseDurationHour(int courseDurationHour) {
	this.courseDurationHour = courseDurationHour;
}
}
