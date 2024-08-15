import java.lang.reflect.*;

public class Student {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "name = " + getName() + "\nscore = " + getScore();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Holly Day", 88);
		System.out.println(student.toString());
	}

}
