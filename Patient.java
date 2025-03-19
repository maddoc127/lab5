public class Patient {
    private String patientName;
    private int patientID;
    private Doctor patientDoctor;
    private int entryDate;
    private int numberOfPatients = 0;

public Patient(String patName, int patID, int patEntryDate){
this.patientName = patName;
this.patientID = patID;
this.entryDate = patEntryDate;
numberOfPatients++;
}

public Patient(Patient patient){
    this.patientName = patient.patientName;
    this.patientID = patient.patientID;
    this.entryDate = patient.entryDate;
}

public Doctor getpatientDoctor(){
    return patientDoctor;
}

public void setpatientdoctor(Doctor doctord){
    this.patientDoctor = doctord;
}

public String toString(){
return "Patient name: " + patientName + "Patient ID: " + patientID + "Patient's doctor: " + patientDoctor + "Patient's entry date: " + entryDate;
}
}