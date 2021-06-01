
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.instructorName = "Merve TAÐCI";
		instructor.add(new LectureLoad());
		instructor.add(new AssigmentLoad());
		instructor.delete("silinecek ders ismi");
		
		InstructorManager instrctMngr = new InstructorManager();
		
		Instructor[] instrctr = {instructor};
		
		instrctMngr.addMultiple(instrctr);
		
		Student student = new Student();
		student.id = 1;
		student.name = "Herhangi BIRI";
		student.add(new AssigmentReplyLoad());
		
		
		
		/*InstructorManager instructorManager = new InstructorManager(instructor.instructorName);
		instructorManager.add(new LectureLoad());*/
		
	}

}
