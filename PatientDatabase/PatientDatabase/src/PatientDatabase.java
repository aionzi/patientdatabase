import java.util.ArrayList;
import java.util.HashMap;


public class PatientDatabase {
    private HashMap<String, Patient> patientMap;

    public PatientDatabase(){
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient patient){
        patientMap.put(patient.getId(),patient);
    }

    public Patient getPatient(String id){
        return patientMap.get(id);
    }

    public ArrayList<Patient> getAllPatients(){
        return new ArrayList<>(patientMap.values());
    }



}
