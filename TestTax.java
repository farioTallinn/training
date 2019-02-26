
public class TestTax {

	public static void main(String[] args) {
		//Tax t = new Tax();
		NJTax t = new NJTax(50000, 2, "New Jersey");
		//t.grossIncome = 50000;
		//t.numberOfDependents = 2;
		//t.state = "New Jersey";
		
		double yourTax = t.calcTax();
		
		yourTax = t.adjustForStudents(yourTax);
		
		
		System.out.print("Your tax is ");
		System.out.printf("%.2f", yourTax);

	}

}
