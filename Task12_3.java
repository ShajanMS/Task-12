package tasK12;

import java.util.Scanner;
import java.util.TreeMap;

public class Task12_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		TreeMap<Integer, String> employeeMap = new TreeMap<>();

		System.out.println("Enter the number of employees:");

		int numberOfEmployees = scanner.nextInt();

		scanner.nextLine(); // Consume the newline character

		// Add employees to the TreeMap

		for (int i = 0; i < numberOfEmployees; i++) {

			System.out.println("Enter employee ID for employee " + (i + 1) + ":");

			int id = scanner.nextInt();

			scanner.nextLine(); // Consume the newline character

			System.out.println("Enter employee name for employee " + (i + 1) + ":");

			String name = scanner.nextLine();

			employeeMap.put(id, name);
		}

		// Print employee names in alphabetical order

		System.out.println("Employee names in alphabetical order:");

		employeeMap.values().stream().sorted().forEach(System.out::println);

		scanner.close();

	}

}
