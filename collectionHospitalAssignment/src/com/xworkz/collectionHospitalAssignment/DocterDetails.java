package com.xworkz.collectionHospitalAssignment;

import java.util.ArrayList;
import java.util.ListIterator;



public class DocterDetails {
public static void main(String[] args) {
Doctor raghvendra = new Doctor("Raghvendra","dental");
Doctor sharath = new Doctor("Sharath", "dermo");
Doctor shara = new Doctor("Shara", "pedio");
Doctor rajath = new Doctor("Rajath", "cardioligist");
Doctor rakesh = new Doctor("Rakesh", "eyespecialist");
Doctor darshan = new Doctor("darshan", "gyno");



ArrayList<Doctor> jayadevahospital =new ArrayList<Doctor>();

jayadevahospital.add(sharath);
jayadevahospital.add(shara);

ArrayList<Doctor> gopalgowdahospital = new ArrayList<Doctor>();

gopalgowdahospital.add(rajath);
gopalgowdahospital.add(darshan);

ArrayList<Doctor> sinchanaclinic =new ArrayList<Doctor>();
sinchanaclinic.add(rakesh);
sinchanaclinic.add(raghvendra);


Hospital multispecialhospital = new Hospital("JAYA_DEVA",jayadevahospital );
Hospital international = new Hospital("GOPAL_GOWDA",gopalgowdahospital );

Hospital semispecialhospital = new Hospital("SINCHANA_CLINIC",sinchanaclinic);

ArrayList<Hospital> hospitallist = new ArrayList<Hospital>();

hospitallist.add(multispecialhospital);
hospitallist.add(international);
hospitallist.add(semispecialhospital);
ListIterator<Hospital> itr = hospitallist.listIterator();
//Trainer trainer = itr.next();
while(itr.hasNext()) {
	Hospital next = itr.next() ;
	if(next.name.equals("JAYA_DEVA")) {
		
		System.out.print("Specialize Doctors In Our " + next);
	}
	
}
}


}
