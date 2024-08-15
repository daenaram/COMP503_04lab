import java.lang.reflect.*;

public class CreditCard {
	
	private int owing;
	private String name;
	
	public CreditCard(String name) {
		this.name = name;
		this.owing = -1;
	}
	
	public int getOwing() {
		return owing;
	}
	
	public void spend(int amount) {
        if (amount >= 0) {
            owing -= amount; 
        }
    }
    
    public void payback(int amount) {
        if (amount >= 0) {
        	owing += amount;
            if (owing > 0) {
            	owing = 0;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard myCard = new CreditCard("Robin Banks");
		
		 myCard.spend(50);
	        
	     System.out.println("owing = " + myCard.getOwing());
	        
	      myCard.payback(100);
	        
	      System.out.println("owing = " + myCard.getOwing());

	}

}
