package Methodref;


public class Test {
	public static void main(String[] args) {
		school sch=new school();
		Noteable nt=sch::noteLecture;
		nt.note("Lecture");
	
		
		Noteable nt1=sch::noteObservation;
		nt1.note("note");
		Noteable nt2=sch::noteOnlineClass;
		nt2.note("online");
		
		school mySchool=new school();
		mySchool.noteLecture("lecture");
		mySchool.noteObservation("lecture");
		mySchool.noteOnlineClass("lecture");		
	}		
				
}
	


