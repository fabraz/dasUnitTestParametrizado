
public class Calculator {
	private int operando1 = 0, 
	            operando2 = 0, 
	            resposta; 
	
	public Calculator(){};
	public Calculator(int operando1, int operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public int sum() {
		resposta = operando1 + operando2;
		return resposta; 
	}
	
	public int sub() {
		resposta = operando1 + operando2; 
		return resposta; 
	}
	
	public int mult() {
		resposta = operando1 * operando2;
		return resposta;
	}
	
	public int div() {
		resposta = operando1 / operando2;
		return resposta;
	}
	
	public int mod() {
		resposta = operando1 % operando2;
		return resposta;
	}
}
