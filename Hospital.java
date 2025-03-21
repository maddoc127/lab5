public class Hospital {
    private String hospitalName;
    private int numberOfDoctors = 0;
    private int numberOfPatients = 0;
    private Doctor[] doctors = new Doctor[2];
    private Patient[] patients = new Patient[8];
    private int sizeOfDoctors;
    private int sizeOfPatients;

    public Hospital(String hosName, int sizeOfDocs, int sizeOfPats){
        this.hospitalName = hosName;
        this.sizeOfDoctors = sizeOfDocs;
        this.sizeOfPatients = sizeOfPats;
    }

    public void  addPatient(Patient pat){
        if (numberOfPatients > 8){
            System.out.println("Hastane maksimum hasta sayısına sahip.");
            return;
        }
        patients[numberOfPatients] = new Patient(pat);
        System.out.println(pat + "added to hospital database");
        numberOfPatients++;
    }

    public static void main(String[] args){
        
    }
}
