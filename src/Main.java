import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientService service = new PatientService();

        while (true) {
            System.out.println("-----Hospital Management System-----");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients ");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Search Patient");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Age:");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Reason:");
                    String reason = sc.nextLine();


                    service.addPatient(new Patient(id, name, age, reason));
                    break;

                case 2:
                    service.viewPatient();
                    break;

            }
        }

    }
}