package ejercicio5;
import java.util.Vector;

public class PeopleList {
    Vector peopleList;

    public PeopleList() {
        peopleList = new Vector();
    }

    public void addPerson(Person person) {
        peopleList.add(person);
    }

    public void deletePerson(int index) {
        peopleList.removeElementAt(index);
    }

    public void clearList() {
        peopleList.removeAllElements();
    }
}
