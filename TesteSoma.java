import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TesteSoma {

	int operando1, operando2, resultado;
	Calculator c1; 
	
	@Parameters
	public static Collection<Integer[]> getParameters() {
		return Arrays.asList(new Integer[][]{
				{2,3,5},
				{2,0,2},
				{-2,-3,5},
				{-3,4,1},
				{-3,2,-1},
				{-3,3,0}
		});
	}
	
	public TesteSoma(int operando1, int operando2, int resultado){
		this.operando1 = operando1; 
		this.operando2 = operando2; 
		this.resultado = resultado;
	}
	
	
	@Before
	public void inicializar() {
		c1 = new Calculator(operando1, operando2);		
	}
	
	@Test
	public void test() {
		Assert.assertEquals(resultado, c1.sum());
		System.out.println(this);
	}

}
