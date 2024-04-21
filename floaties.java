//need to make sure to get the sequencing correct
//still having issues with initial scanner import so need to add it in code
//need to make a callback number variable that the program can refer back to
//need to make sure floats are decimaled
public class floaties {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		float[] numbers = new float[5];  // To store the five floating-point numbers
        int index = 0;  // To track how many valid numbers we've collected

        // Collect five valid floating-point values
        while (index < 5) {
            System.out.print("Enter a floating-point number (" + (index + 1) + " of 5): ");
            if (scanner.hasNextFloat()) {
                numbers[index++] = scanner.nextFloat();  // Store valid input and increment index
            } else {
                System.out.println("Invalid input. Please enter a floating-point number.");
                scanner.next();  // Discard invalid input
            }
        }

        // Calculate total
        float total = 0;
        for (float number : numbers) {
            total += number;  // Accumulate the total
        }

        // Calculate average
        float average = total / numbers.length;  // The average of the five numbers

        // Calculate maximum and minimum
        float max = numbers[0];
        float min = numbers[0];
        for (float number : numbers) {
            if (number > max) max = number;  // Update max if current number is greater
            if (number < min) min = number;  // Update min if current number is lesser
        }

        // Calculate 20% interest on the total
        float interest = total * 0.20f;

        // Display the results
        System.out.println("\nResults:");
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Interest on total at 20%%: %.2f\n", interest);

        scanner.close();  // Close the scanner to avoid resource leaks
		// TODO Auto-generated method stub

	}

}
