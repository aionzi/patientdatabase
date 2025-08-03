public class Patient {
    private String id;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String id, String name, int age, String medicalHistory){
        this.id = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;

    }

    public String getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getMedicalHistory(){return medicalHistory;}

    @Override
    public String toString(){
        return "\n Patient id: " +  id + "\n Patient Name: " + name + "\n Patient Age: " + age + "\n Patient Medical History: " + medicalHistory;

    }



}
