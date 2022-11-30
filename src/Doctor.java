import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doctor {


    public Doctor(String fName, String lName, String speciality, boolean isAvailable) {
        this.fName = fName;
        this.lName = lName;
        this.speciality = speciality;
        this.isAvailable = isAvailable;
    }

    public static final List<String> firstNames = new ArrayList<>(Arrays.asList("Adel",
            "Nataliia",
            "Liliia",
            "Ivan",
            "Polina",
            "Denys",
            "Halyna"));

    public static final List<String> lastNames = new ArrayList<>(Arrays.asList("Belous",
            "Ksendziuk",
            "Kravchenko",
            "Safonov",
            "Shariy",
            "Podolyan",
            "Smith"));


    public String fName;
    public String lName;
    public String speciality;
    public boolean isAvailable = true;

    public static Doctor getDoctor(String problem){

        problem = problem.toLowerCase();

        // 6 first names -> size = 6 -> max index = 5, startIndex = 0
        int randomIndexForFirstName = RandomNumberGenerator.getRandomNumber(0, firstNames.size() - 1);
        String firstName = firstNames.get(randomIndexForFirstName);

        // 6 last names -> size = 6 -> max index = 5, startIndex = 0
        int randomIndexForLastName = RandomNumberGenerator.getRandomNumber(0, lastNames.size() - 1);
        String lastName = lastNames.get(randomIndexForLastName);

        /*
        emergency, life, threat -> "ER"
        heart -> "Cardiologist"
        ear, throat, nose -> "ENT"
        eye -> "Ophthalmologist"
        skin -> "Dermatologist"
        other -> "PCP"
         */
        String speciality = "";
        if (problem.contains("emergency") || problem.contains("life") || problem.contains("threat") ) speciality = "ER";
        else if (problem.contains("heart")) speciality = "Cardiologist";
        else if (problem.contains("ear") || problem.contains("throat") || problem.contains("nose")) speciality = "ENT";
        else if (problem.contains("eye")) speciality = "Ophthalmologist";
        else if (problem.contains("skin")) speciality = "Dermatologist";
        else speciality = "PCP";

        return new Doctor(firstName,lastName,speciality,true);


    }

    @Override
    public String toString() {
        return "Doctor{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(getDoctor("My heart is hearting"));
        System.out.println(getDoctor("I cannot see"));
    }




}
