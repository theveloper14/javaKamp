package oopOdev;

public class CoursesManager {
	
	public CoursesManager() {
		System.out.println("Kursa kat?l?m yap?ld? yap?c? metodu ?a??r?ld?.");
	}

	public void enrolled(AllCourses allCourses) {
		System.out.println("Kursa kat?ld?n metodu : "+ allCourses.name);
	}
}
