

package com.xworkz.prajectexception;

public class AtmMachine {
 void draw(int amount) throws AtmException
 {
	 if(amount%100!=0 || amount>50000)
	 {
		
	 AtmException atmException = new AtmException();
		 throw atmException;
      }
	 else 
	 {

       System.out.println("collect cash");
	 }
 }
 

}
