import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jayme on 7/18/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        ArrayList<Person> classroom = getPeople();

        for (Person list: classroom){
            System.out.println(list.toString());
        }
    }

    private static ArrayList<Person> getPeople() {
        ArrayList<Person> classroom= new ArrayList<>();

        classroom.add(new Student("Bob", "123 Main st.","Java",2017, 6000.00));
        classroom.add(new Student("Jayme", "4567 Main St.","Java", 2017, 6000.00));
        classroom.add(new Student("Joya","7896 Main St.","Java", 2017, 6000.00));
        classroom.add(new Staff("Marie","4321 Main St.","Grand Circus", 2000.00));
        return classroom;
    }
}
