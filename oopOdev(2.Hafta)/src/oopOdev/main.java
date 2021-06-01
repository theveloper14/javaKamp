package oopOdev;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String egitmenAdi = "Engin DEMÝROG";
		String[] egitmenler = {"Engin DEMÝROG"};
		
		
		AllCourses angular = new AllCourses("Angular ve C# ",1,egitmenler[0]);
		AllCourses java = new AllCourses("Java ve React ",2,egitmenAdi);
		AllCourses temel = new AllCourses("Temeller ",3,egitmenAdi);
		String[] courses = {"angular","java","temel"};
		
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.enrolled(angular);
		coursesManager.enrolled(java);
		coursesManager.enrolled(temel);
		
		

	}

}
