public class Doctor {
    private String doctorName;
    private int doctorID;
    private String specialization;
    private Patient[] docpatients = new Patient[4];
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

    public String getdoctorName(){
        return doctorName;
    } 

    public void setdoctorName(String docName){
        this.doctorName = docName;
    }

    public int getdoctorID(){
        return doctorID;
    } 

    public void setdoctorID(int docID){
        this.doctorID = docID;
    }

    public String getdoctorspecialization(){
        return specialization;
    } 

    public void setdoctorspecialization(String docspecialization){
        this.specialization = docspecialization;
    }
    public String toString(){
        return "Doctor name: " + doctorName + "Doctor ID: " + doctorID + "Specialization: " + specialization + "Number of patients: " + noOfPatients;
        }

    public void assignPatient(Patient patient){
        if (noOfPatients > 4){
            System.out.println("Doktor" + this + " maksimum hasta sayısına sahip.");
            isAvailable = false;
            return;
        }
        docpatients[noOfPatients] = new Patient(patient);
        noOfPatients++;
        patient.setpatientdoctor(new Doctor(this));
        System.out.println(patient + "assinged to" + this);
    }
} 

