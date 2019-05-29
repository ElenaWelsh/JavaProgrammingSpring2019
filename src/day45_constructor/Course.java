package day45_constructor;
import java.util.*;
public class Course {
private String name;
private String duration;
private List<String> teachers= new ArrayList<>();
private List<String> students= new ArrayList<>();


public void addStudents(String stName) {
	students.add(stName);
	
}
public void addTeachers(String thName) {
	teachers.add(thName);
	
}
public void removeStudent(String stName) {
	students.remove(stName);
	
}
public void removeTeachers(String thName) {
	teachers.remove(thName);
	
}
@Override
public String toString() {
	return "Course [name=" + name + ", duration=" + duration + ", teachers=" + teachers + ", students=" + students
			+ "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public List<String> getTeachers() {
	return teachers;
}
public void setTeachers(List<String> teachers) {
	this.teachers = teachers;
}
public List<String> getStudents() {
	return students;
}
public void setStudents(List<String> students) {
	this.students = students;
}




}
