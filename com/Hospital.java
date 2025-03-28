package com;

public class Hospital {
    private String hospitalName;
    private int numberOfDoctors = 0;
    private int numberOfPatients = 0;
    private Doctor[] doctors;
    private Patient[] patients;
    private int sizeOfDoctors;
    private int sizeOfPatients;

    public Hospital(String hosName, int sizeOfDocs, int sizeOfPats) {
        this.hospitalName = hosName;
        this.sizeOfDoctors = sizeOfDocs;
        this.sizeOfPatients = sizeOfPats;
        this.doctors = new Doctor[sizeOfDocs];
        this.patients = new Patient[sizeOfPats];
    }

    public void addPatient(Patient pat) {
        if (numberOfPatients > sizeOfPatients) {
            System.out.println("Hastane maksimum hasta sayısına sahip.");
            return;
        }
        patients[numberOfPatients] = new Patient(pat);
        System.out.println(pat + " added to hospital database");
        numberOfPatients++;
    }

    public void addDoctor(Doctor doc) {
        if (numberOfDoctors > sizeOfPatients) {
            System.out.println("Hastane maksimum doctor sayısına sahip.");
            return;
        }
        doctors[numberOfDoctors] = new Doctor(doc);
        System.out.println(doc + " added to hospital database");
        numberOfDoctors++;
    }

    public Doctor findDoctor(String id) {
        String temp = "0";
        for (Doctor d : doctors) {
            if (d == null) {
                continue;
            }
            temp = d.getdoctorID();
            if (temp == id) {
                return new Doctor(d);
            }
        }
        System.out.println("Doctor bulunamadı.");
        return null;
    }

    public Patient findPatient(String id) {
        String temp = "0";
        for (Patient p : patients) {
            if (p == null) {
                continue;
            }
            temp = p.getpatientID();
            if (temp.equals(id)) {

                return new Patient(p);
            }
        }
        System.out.println("Hasta bulunamadı.");
        return null;
    }

    public void assignDoctorToPatient(String patientID, String doctorID) {
        Patient temp1 = findPatient(patientID);
        String temp2 = "0";
        for (Doctor d : doctors) {

            if (d == null) {
                continue;
            }

            temp2 = d.getdoctorID();
            if (temp2 == doctorID) {
                d.assignPatient(temp1);
                return;
            }
        }
        System.out.println("Doctor bulunamadı.");
    }

    public void removePatient(String patientID){
        String temp = "0";
        for (int i = 0; i < patients.length ; i++){
            if (patients[i] == null){
                continue;
            }
            temp = patients[i].getpatientID();
            if (temp == patientID){
                patients[i] = null;
                break;
            }
        }
        Doctor tempdoc;
        for (int i = 0; i < doctors.length ; i++){
            if (doctors[i] == null){
                continue;
            }
            tempdoc = doctors[i];
            for (int j = 0; j < tempdoc.docpatients.length ; j++){
                if (tempdoc.docpatients[j] == null){
                    continue;
                }
                String temp2 = tempdoc.docpatients[j].getpatientID();
                if (temp2 == patientID){
                    tempdoc.docpatients[j] = null;
                    break;
                }
            }
        }
    }

    public String toString() {
        return "Hospital name: " + hospitalName + "Patient limit: " + sizeOfPatients + "Doctor limit: " + sizeOfDoctors;
    }

    public static void main(String[] args) {
        Doctor t1 = new Doctor("sdd", "34", "edd");
        Doctor t2 = new Doctor("sdd", "55", "edd");
        Patient p1 = new Patient("asd", "1", 12345);
        Hospital hospital1 = new Hospital("has", 10, 10);
        hospital1.addDoctor(t1);
        hospital1.addDoctor(t2);
        hospital1.addPatient(p1);
        hospital1.findDoctor("55");
        System.out.println(p1.getpatientID());
        System.out.println(p1);
        hospital1.findPatient("1");
        hospital1.assignDoctorToPatient("1", "34");
        hospital1.removePatient("1");
        hospital1.findPatient("1");

    }
}
