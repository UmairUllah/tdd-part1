
public class Money implements Expression {
 	protected int amount;
 	protected String currency;
 	
 	public Money( int amount, String currency ) {
 		this.amount = amount;
 		this.currency = currency;
 	}
 
	public boolean equals( Object object ){
		Money money = (Money) object;
		return amount == money.amount
			&& currency().equals(money.currency());
	}

	public static Dollar dollar(int amount) {
		return new Dollar(amount,"USD");
	}
	
	public static Franc franc(int amount) {
		return new Franc(amount,"CHF");
	}
	
	String currency() {
		return currency;
	}
	
	public Money times( int multiplier ) {
		return new Money(amount * multiplier, currency);
	}
	
	
	@Override
	public String toString() {
		return amount + " " + currency;
	}
	
	public Expression plus(Money addend) {
		return new Sum( this, addend );
	}
	
	public Money reduce( String to ) {
		return this;
	}
	
}
