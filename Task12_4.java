package tasK12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12_4 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
        List<String> list = new ArrayList<>();

        System.out.println("Enter the number of elements in the list:"); 
        
        int numberOfElements = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character

        // Add elements to the list
        
        for (int i = 0; i < numberOfElements; i++) {
        	
            System.out.println("Enter element " + (i + 1) + ":");
            
            String element = scanner.nextLine();

            list.add(element);
        }

        // Convert List to Array
        
        String[] array = list.toArray(new String[0]);

        // Display the Array
        
        System.out.println("Array elements:");
        
        for (String element : array) {
        	
            System.out.println(element);
        }

        scanner.close();
		

	}

}
