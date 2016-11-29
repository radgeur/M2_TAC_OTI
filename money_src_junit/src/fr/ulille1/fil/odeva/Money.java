package  fr.ulille1.fil.odeva;


public class Money {
	private int value;
	private String currency;
	

	Money(int value, String currency)
	{
		this.value=value;
		this.currency=currency;
	}

	public int getValue()
	{
		return this.value;
	}

	public String getCurrency()
	{
		return this.currency;
	}
	
	public boolean _equals(Object m){
		if(m instanceof Money) {
			Money money = (Money)m;
			return this.getValue() == money.getValue() && this.getCurrency() == money.getCurrency();
		}
		else
			return false;
	}
	
	public boolean equals(Object m) {
		return _equals(m);
	}

    public String toString() {
     	return this.getValue()+" ("+this.getCurrency()+")";
    }

}
