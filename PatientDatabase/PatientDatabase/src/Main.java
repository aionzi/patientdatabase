import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        PatientDatabase database = new PatientDatabase();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to Patient Database! Please choose an action");
            System.out.println("1. Add Patient to system");
            System.out.println("2. Retrieve Patient Details");
            System.out.println("3. Retrieve all patient details");
            System.out.println("4. Exit program");

            System.out.println("Enter here: ");

            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.print("Please enter Patient Id:");
                    String id = scanner.nextLine();
                    System.out.print("Please enter Patient Name:");
                    String name = scanner.nextLine();
                    System.out.print("Please enter Patient Age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Please enter Patient Medical history:");
                    String medicalHistory = scanner.nextLine();


                    Patient patient = new Patient(id, name, age, medicalHistory);
                    database.addPatient(patient);
                    System.out.println("Successfully added!");
                    break;

                case 2:
                    System.out.print("Please enter Patient Id:");
                    String patientId = scanner.nextLine();
                    Patient foundPatient = database.getPatient(patientId);
                    if (foundPatient != null) {
                        System.out.println("Patient Details:" + foundPatient);
                    } else {
                        System.out.println("Patient Id not found");
                    }

                    break;

                case 3:
                    ArrayList<Patient> patients = database.getAllPatients();
                    System.out.println("All Patients:");
                    for (Patient p : patients) {
                        System.out.println(p);
                    }

                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, please enter a number from 1-4..");
            }
            try {
                Thread.sleep(2000); // Delay for 2000 milliseconds (2 seconds)

            } catch (InterruptedException e) {
                System.out.println("An error occurred while waiting: " + e.getMessage());
            }

        }
        while (choice != 4);
        scanner.close();

    }
}



