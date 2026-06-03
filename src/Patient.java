public class Patient {
    private int id;
    private String name;
    private int age;
    private String reason;

    public Patient(int id, String name, int age, String reason){
        this.id= id;
        this.name = name;
        this.age = age;
        this.reason = reason;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getReason(){
        return reason;
    }
}
