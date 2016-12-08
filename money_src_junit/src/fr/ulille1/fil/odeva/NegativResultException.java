package fr.ulille1.fil.odeva;

public class NegativResultException extends Exception {
	NegativResultException(Money n1, Money n2)
	  {
	    super(n1.getValue() + " is smaller than " + n2.getValue() + "so the substraction result will be negativ");
	  }
}
