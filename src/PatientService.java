import java.util.ArrayList;

public class PatientService {
    ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient){
        patients.add(patient);
        System.out.println("Patient Added SUccessfully...");
    }

}
