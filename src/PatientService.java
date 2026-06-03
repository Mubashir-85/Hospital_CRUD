import java.util.ArrayList;

public class PatientService {
    ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient Added SUccessfully...");
    }

    public void viewPatient() {
        for (Patient patient : patients) {
            System.out.println("ID: " + patient.getId()+"," + " " + "Patient Name: "+ patient.getName()+"," + " " + "Patient Age: "+ patient.getAge()+"," + " " + "Patient Reason: " + patient.getReason());
        }
    }

    public boolean patientExists(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void updatePatient(int id,String name, int age, String reason){
        for(Patient patient: patients){
            System.out.println("Found ID: " + patient.getId());
            if(patient.getId() == id){
                patient.setName(name);
                patient.setAge(age);
                patient.setReason(reason);
                System.out.println("Patient Updated successfully");
                return;

            }
        }
        System.out.println("Patient Not Found!!!!!");
    }

}
