package com.codingdojo.com.caresoftinterfaces;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser {
	
	
	public Physician(Integer id) {
			super(id);
			// TODO Auto-generated constructor stub
		}
	
	//... imports class definition...
	    
	    // Inside class:    
	    private ArrayList<String> patientNotes;
		
	    // TO DO: Constructor that takes an ID
	    // TO DO: Implement HIPAACompliantUser!
		
	    public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }
	
		@Override
		public boolean assignPin(int pin) {
			int num = String.valueOf(pin).length();

			if(num != 4) {
				return false;
			} else {
				return true;
			}
			
		}
	
		@Override
		public boolean accessAuthorized(Integer confirmedAuthID) {
			if(confirmedAuthID == this.id) {
				return true;
			} else {
				return false;
			}
		}
		
	    // TO DO: Setters & Getters
}
