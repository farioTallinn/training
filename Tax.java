
public class Tax {
	double grossIncome;
	int numberOfDependents;
	String state;
	
	Tax (double gi, int depen, String st){
		grossIncome = gi;
        numberOfDependents = depen;
		st = state;
	}
	
	public double calcTax() {
		if (grossIncome < 50000){
		return grossIncome*0.06;
		}
		else return grossIncome*0.08;

	}

}
