import java.util.Scanner;

public class StudentGradingSystem {

    public static String formatName(String name) {
        // Capitalize first letter of each word
        String[] words = name.trim().toLowerCase().split(" ");
        StringBuilder formatted = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                formatted.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1))
                         .append(" ");
            }
        }
        return formatted.toString().trim();
    }

    public static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input name and marks
            System.out.print("Enter student name: ");
            String nameInput = scanner.nextLine();

            System.out.print("Enter marks (0-100): ");
            String marksInput = scanner.nextLine();

            // Validate numeric input
            int marks;
            try {
                marks = Integer.parseInt(marksInput);
            } catch (NumberFormatException e) {
                throw new InvalidMarksException("Marks must be a valid integer!");
            }

            // Validate range
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100!");
            }

            // Format and display result
            String formattedName = formatName(nameInput);
            String grade = getGrade(marks);

            System.out.println("\n--- Student Grade Report ---");
            System.out.println("Student Name: " + formattedName);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nProcess Completed.");
            scanner.close();
        }
    }
}
