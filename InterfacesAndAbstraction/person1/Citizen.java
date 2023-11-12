package interface_abstraction.person1;

public class Citizen implements Person, Identifiable, Birthable{
    private String name;
    private int age;
    private  String id;
    private  String birthday;


    public Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public String getBirthDate() {
        return birthday;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "interface_abstraction.person.person2Extended.Citizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
