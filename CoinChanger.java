import java.lang.reflect.Field;
public class CoinChanger {
	private int ten;
	private int twenty;
	private int fifty;
	private int oneDollar;
	private int twoDollar;
	
	public CoinChanger(int ten, int twenty, int fifty, int oneDollar, int twoDollar) {
		this.ten = ten;
		this.twenty = twenty;
		this.fifty = fifty;
		this.oneDollar = oneDollar;
		this.twoDollar = twoDollar;
	}
	
	public int getTen() {
		return ten;
	}
	public int getTwenty() {
		return twenty;
	}
	public int getFifty() {
		return fifty;
	}
	public int getOneDollar() {
		return oneDollar;
	}
	public int getTwoDollar() {
		return twoDollar;
	}
	public int coinAsCents() {
		return ten*10 + twenty*20 + fifty*50 + oneDollar*100 + twoDollar*200;
	}
	public int dollars() {
		return this.coinAsCents()/100;
	}
	public int cents() {
		return coinAsCents() % 100;
	}
	public static void main(String[] args) {
		CoinChanger cc = new CoinChanger(3,4,5,6,10);
		System.out.println("dollars = " + cc.dollars());
		System.out.println("cents = " + cc.cents());

		CoinChanger coinChanger = new CoinChanger(12,54,1,2,40);
		System.out.println("dollars = " + coinChanger.dollars());
		System.out.println("cents = " + coinChanger.cents());
	}

}
