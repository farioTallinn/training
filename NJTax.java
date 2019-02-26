
public class NJTax extends Tax {
	

	NJTax(double gi, int depen, String st) {
		super(gi, depen, st);
		// TODO Auto-generated constructor stub
	}

	public double adjustForStudents(double grossIncome){
		return grossIncome - 500;
	}

}
