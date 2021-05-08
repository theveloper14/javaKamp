package oopOdev;

public class CoursesManager {
	
	public CoursesManager() {
		System.out.println("Kursa katýlým yapýldý yapýcý metodu çaðýrýldý.");
	}

	public void enrolled(AllCourses allCourses) {
		System.out.println("Kursa katýldýn metodu : "+ allCourses.name);
	}
}
