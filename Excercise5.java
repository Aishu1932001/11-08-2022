package com.Exercise5.demo
    
import java.util.*;  


public class Exercise5 { 	
    
    
    public static void main(String[] args) {			
        
        LinkedList<String> languages=new LinkedList<String>(); 		
        
        languages.addLast("c");	
        
        languages.addLast("C++");		
        
        languages.addLast("Java");
        
        languages.addLast("Kotlin");		
        
        languages.addLast("Python");		
        
        languages.addLast("Peri");	
        
        languages.addLast("Ruby"); 
        
        System.out.println(languages); 		
        
        languages.remove(5); // remove an element at location 5 		
        
        System.out.println(languages); 	
        
        languages.remove("Kotlin"); //remove 'Kotlin' 	
        
        System.out.println(languages); 	
        
        LinkedList<String> rl= new LinkedList<String>();	
        
        rl.addLast("Python");	 
        
        rl.addLast("Peri");		 
        
        rl.addLast("Ruby"); 		
        
        languages.removeAll(rl); 		
        
        System.out.println(languages); 		
        
        language.clear();// clear all 	
        
        System.out.println(languages); 	
        
        System.out.println(languages.size()); 	
    }

}
