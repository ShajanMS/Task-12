package tasK12;

import java.util.ArrayList;
import java.util.Scanner;

public class Task12_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        ArrayList <String> list = new ArrayList<>();

        System.out.println("Enter the number of elements you want to add to the ArrayList:");
        
        int numberOfElements = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character
 
        // Add elements to the ArrayList
        
        for (int i = 0; i < numberOfElements; i++) {
        	
            System.out.println("Enter element " + (i + 1) + ":");
            
            String element = scanner.nextLine();
            
            list.add(element);
        }

        // Display the ArrayList
        
        System.out.println("ArrayList elements:");
        
        for (String element : list) {
        	
            System.out.println(element);
        }

        // Remove all elements from the ArrayList
        
        list.clear();

        // Display the ArrayList after removing elements
        
        System.out.println("ArrayList after removing all elements: " + list);

        scanner.close();

	}

}
