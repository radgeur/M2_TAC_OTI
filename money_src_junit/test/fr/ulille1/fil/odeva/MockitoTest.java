package fr.ulille1.fil.odeva;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InOrder;

public class MockitoTest {
	
	@BeforeClass
	public static void init(){
		Money money_stub=mock(Money.class);
		
		Money real_money=new Money(10,"EUR");
		Money money_spy=spy(real_money);
		
		when(money_spy.getValue()).thenReturn(1); //lors d'un appel sur getValue, la méthode réeele s'exécute sur l'objet, mais la valeur 1 est renvoyée
		when(money_stub.getValue()).thenReturn(1); //lors d'un appel sur getValue, la valeur 1 est retournée tout de suite
	
		//ou
	
		doReturn(1).when(money_spy).getValue(); //lors d'un appel sur getValue, la valeur 1 est retournée tout de suite
		doReturn(1).when(money_stub).getValue(); //lors d'un appel sur getValue, la valeur 1 est retournée tout de suite
	}
	
	@Test
	public void verifyCall(){
		Money m1EURs=spy(new Money(1,"EUR"));
		m1EURs._equals(m1EURs);
		verify(m1EURs,times(2)).getValue(); //deux fois car le même objet comparé à lui même
	}
	
	@Test
	public void verifyInOrder() {
		Money m1EUR=spy(new Money(1,"EUR"));
		Money m1EURs=spy(new Money(1,"EUR"));
		m1EURs._equals(m1EUR);

		InOrder inOrder=inOrder(m1EURs,m1EUR);
		inOrder.verify(m1EURs).getValue();
		inOrder.verify(m1EUR).getValue();
		inOrder.verify(m1EURs).getCurrency();
		inOrder.verify(m1EUR).getCurrency();
	}
}
