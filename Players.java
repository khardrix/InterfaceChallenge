package InterfacesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.ArrayList;

public class Players implements ISaveable {

    private String name;
    private String weapon;
    private int currentHealth;
    private ArrayList<String> playerFieldAttributes;


    public Players(String name, String weapon, int currentHealth) {

        playerFieldAttributes = new ArrayList<String>();

        this.name = name;
        playerFieldAttributes.add(0, this.name);
        this.weapon = weapon;
        playerFieldAttributes.add(1, this.weapon);

        if(currentHealth > 0 && currentHealth <= 100){
            this.currentHealth = currentHealth;
        }else{
            System.out.println("The value for currentHealth must be between 0 and 100. " +
                    "\nBy default, your currentHealth field will be set to the max value of 100.");
            this.currentHealth = 100;
        }
        playerFieldAttributes.add(2, String.valueOf(this.currentHealth));
    }


    public Players(){

        playerFieldAttributes = new ArrayList<String>();

        this.name = "No NAME specified.";
        playerFieldAttributes.add(0, this.name);
        this.weapon = "No WEAPON specified.";
        playerFieldAttributes.add(1, this.weapon);
        this.currentHealth = 100;
        playerFieldAttributes.add(2, String.valueOf(this.currentHealth));
    }

    @Override
    public ArrayList valuesToBeSaved() {

        return playerFieldAttributes;
    }

    @Override
    public void populateFields(ArrayList<String> stringArrayList) {

        if(stringArrayList.size() > 3){
            System.out.println("Too many fields provided. Only three fields to specify. " +
                    "\nThe first field should be a String for the Player name." +
                    "\nThe second field should be a String for the name of the weapon the Player is wielding. " +
                    "\nThe third and final field should be an int to set the value of your current health.");
        }else{
            this.name = stringArrayList.get(0);
            playerFieldAttributes.set(0, this.name);
            this.weapon = stringArrayList.get(1);
            playerFieldAttributes.set(0, this.weapon);
            this.currentHealth = Integer.parseInt(stringArrayList.get(2));
            playerFieldAttributes.set(2, String.valueOf(this.currentHealth));
        }
    }

    @Override
    public String toString() {

        return "The player named " + this.name + " is wielding a " + this.weapon +
                ". The player currently has " + this.currentHealth + "/100 hit points for health.";
    }


    public String getName() {
        return name;
    }


    public String getWeapon() {
        return weapon;
    }


    public int getCurrentHealth() {
        return currentHealth;
    }


    public ArrayList<String> getPlayerFieldAttributes() {
        return playerFieldAttributes;
    }
}
