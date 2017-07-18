/**
 * Created by jayme on 7/18/2017.
 */
public class Person {
    private String name;
    private String address;

//    public Person() {//blank constructor needed to extend until generate constructors in other classes
//    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +  "name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
