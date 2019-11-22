package com.dajance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookingService {
	
	
	
	public BookingService() {};
	
		
		
	
	

	
	
	public void provjeraDostupnisti(int dolazak, int odlazak, ArrayList<Integer> listaslobodnih, ArrayList<Integer> listazauzetih) {
		
		int a= dolazak;
		while (odlazak>=a) {
			
			if (listaslobodnih.contains(dolazak)) {
				
				
				System.out.println("Datumi su slobodni " + a);
			}
			
			
			
			else {
				System.out.println("Datumi nisu dostupni");
				
			}
			
			a+=1;
			
			
		}
		
		
		//if (listaslobodnih.contains(dolazak) && listaslobodnih.contains (odlazak)){
			
		//	System.out.println("Datum je slobodan");
		//}
		
		
		int startni= dolazak;
		for (int i=0; i<odlazak-dolazak; i++ ){
			listazauzetih.add(new Integer(startni));
			listaslobodnih.remove(new Integer (startni));
			startni+=1;
			
			
			
		
		}
	}
	}
