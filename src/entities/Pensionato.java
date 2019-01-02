package entities;

public class Pensionato {

	private String nameStudent;
	private String emailStudent;
	
	
	public Pensionato(String nameStudent, String emailStudent) {
		this.nameStudent = nameStudent;
		this.emailStudent = emailStudent;
	}


	public String getNameStudent() {
		return nameStudent;
	}


	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}


	public String getEmailStudent() {
		return emailStudent;
	}


	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}
	
	public String toString() {
		return "Nome Student: " +  nameStudent + "; Email Student: " +  emailStudent + "; ";
	}	

}

