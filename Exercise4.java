package com.Exercise4.demo
    
    
import java.util.ArrayList; 
    
    public class Exercise4 { 	
    
    public static void main(String[] args) {			
        
       
        ArrayList<String> animalnames = new ArrayList<String>();			
        
        animalnames.add("Lion");		
        
        animalnames.add("Tiger");		
        
        animalnames.add("Cat");		
        
        animalnames.add("Dog");
        
        animalnames.add("Cow");	 
        
        System.out.println(animalnames); 
       			
        
        for(String name:animalnames) {				
            
            
            System.out.println(name); 
            
            
        }	 	
    }
