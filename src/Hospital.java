import java.util.ArrayList;
import java.util.List;

public class Hospital {

    public static void main(String[] args) {
        System.out.println(QuestionsAndMessages.welcomeMessage);
       List <Patient> patient = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            patient.add(Patient.createPatient());

            
            patient.get(i).patientDoctor = Doctor.getDoctor(patient.get(i).problem);
            patient.get(i).patientDoctor.isAvailable = false;
            System.out.println(QuestionsAndMessages.doctorMessage);
        }
        for (Patient patient1 : patient) {
            System.out.println(patient1);
            System.out.println(patient1.patientDoctor);
        }

    }
}
