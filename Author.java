package day3;

public class Author {
	String name,email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String toString() {
		return name+" , "+email+" , "+gender;
	}

}
