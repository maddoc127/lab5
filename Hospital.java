public class Hospital {
    private String hospitalName;
    private int numberOfDoctors = 0;
    private int numberOfPatients = 0;
    private Doctor[] doctors;
    private Patient[] patients;
    private int sizeOfDoctors;
    private int sizeOfPatients;

    public Hospital(String hosName, int sizeOfDocs, int sizeOfPats){
        this.hospitalName = hosName;
        this.sizeOfDoctors = sizeOfDocs;
        this.sizeOfPatients = sizeOfPats;
    }

    public void addPatient(Patient pat){
        if (numberOfPatients > sizeOfPatients){
            System.out.println("Hastane maksimum hasta sayısına sahip.");
            return;
        }
        patients[numberOfPatients] = new Patient(pat);
        System.out.println(pat + "added to hospital database");
        numberOfPatients++;
    }

    public void addDoctor(Doctor doc){
        if (numberOfDoctors > sizeOfPatients){
            System.out.println("Hastane maksimum doctor sayısına sahip.");
            return;
        }
        doctors[numberOfDoctors] = new Doctor(doc);
        System.out.println(doc + "added to hospital database");
        numberOfDoctors++;        
    }

    public void assignDoctorToPatient(String patientID, String doctorID){
        Doctor.assignPatient(patientID);
    }

    public String toString(){
        return "Hospital name: " + hospitalName + "Patient limit: " + sizeOfPatients + "Doctor limit: " + sizeOfDoctors;
        }

    public static void main(String[] args){
        
    }
}
