public class Doctor {
    private String doctorName;
    private int doctorID;
    private String specialization;
    private Patient[] patients = new Patient[4];
    private int noOfPatients = 0;
    private boolean isAvailable = true;
    private static int numberOfDoctors = 0;

    public Doctor(String docName, int docID, String docSpecialization){
        this.doctorName = docName;
        this.doctorID = docID;
        this.specialization = docSpecialization;
        numberOfDoctors++;
    }
    public Doctor(Doctor doctor){
        this.doctorName = doctor.doctorName;
        this.doctorID = doctor.doctorID;
        this.specialization = doctor.specialization;
    }

    public String toString(){
        return "Doctor name: " + doctorName + "Doctor ID: " + doctorID + "Specialization: " + specialization + "Number of patients: " + noOfPatients;
        }

    public void assignPatient(Patient patient){
        if (noOfPatients > 4){
            System.out.println("Bu doktor maksimum hasta sayısına sahip.");
            isAvailable = false;
            return;
        }
        patients[noOfPatients] = new Patient(patient);
        noOfPatients++;
        patient.setpatientdoctor(new Doctor(this));
    }
} 

