package inheritance_assignment_1;

public class AtmCardInterfaceExample {

	public static void main(String[] args) {
     
   Hdfc hdfc = new Hdfc();
   Axis axis = new Axis();
   UnionBank unionbank = new UnionBank();
   Atm atm = new Atm();
   atm.amountport(hdfc);
   atm.amountport(axis);
   atm.amountport(unionbank);
	}
	}

