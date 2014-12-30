
public class Franc extends Money{

	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	String currency() {
		return currency;
	}
}
