package InterfacesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.ArrayList;

public class Monsters implements ISaveable {

    private String name;
    private String weapon;

    @Override
    public ArrayList valuesToBeSaved() {

        return null;
    }

    @Override
    public void populateFields(ArrayList<String> stringArrayList) {

    }

    @Override
    public String toString() {

        return "The monster named " + this.name + " is wielding a " + this.weapon;
    }
}
