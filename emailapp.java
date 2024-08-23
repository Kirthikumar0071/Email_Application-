package training;

public class emailapp {

	public static void main(String[] args) {
		email em1=new email("kirti","kumar");
		em1.changepassword("hi123445");
		em1.setAlternateEmail("js@gmail.com");
		System.out.println(em1.showInfo());

	}

}
