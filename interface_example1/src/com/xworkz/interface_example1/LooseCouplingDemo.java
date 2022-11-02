package com.xworkz.interface_example1;

public class LooseCouplingDemo {

	public static void main(String[] args) {
		
		Sony sony = new Sony();
		Epson epson = new Epson();
	    Computer computer = new Computer();
	 
	   // computer.slot(sony);
	    
	    computer.slot(epson);
	    
	}

}
