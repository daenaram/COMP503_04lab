import java.lang.reflect.*;
public class Grade {
	private int percentage;
	
	

	public Grade(int percentage) {
		// TODO Auto-generated constructor stub
		if (percentage >= 0 && percentage <= 100) {
			this.percentage = percentage;
		}
		
		else {
			this.percentage = 0;
		}
	}
	
	public int getPercentage() {
		return percentage;
	}


	public static void main(String[] args) {
		Grade grade = new Grade(75);
		System.out.println(grade.getPercentage());
		
	}
	
	

}
