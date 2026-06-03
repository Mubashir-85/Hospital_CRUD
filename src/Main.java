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

                case 3:
                    System.out.println("Enter ID:");
                    int updatedId = sc.nextInt();
                    sc.nextLine();
                    if (!service.patientExists(updatedId)) {
                        System.out.println("Patient Not Found!");
                        break;
                    }
                    System.out.println("Enter Updated Name:");;
                    String updatedName = sc.nextLine();

                    System.out.println("Enter Updated Age:");
                    int updatedAge = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Updated Reason");
                    String updatedReason = sc.nextLine();

                    service.updatePatient(updatedId,updatedName,updatedAge,updatedReason);
                    break;

                case 4:
                    System.out.println("Enter Id:");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    if(!service.patientExists(removeId)){
                        System.out.println("Patient Not Found..");
                        break;
                    }
                    service.deletePatient(removeId);
                    break;
                case 5:
                    System.out.println("Enter ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    if(!service.patientExists(searchId)){
                        System.out.println("Patient Not found");
                        break;
                    }
                    service.searchPatient(searchId);
                    break;
                case 6:
                    System.out.println("Thank you for using Hospital Management System");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");


            }
        }

    }
}