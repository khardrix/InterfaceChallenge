package InterfacesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.ArrayList;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int currentHealth;


    public Player(String name, String weapon, int currentHealth) {

        this.name = name;
        this.weapon = weapon;

        if(currentHealth > 0 && currentHealth <= 100){
            this.currentHealth = currentHealth;
        }else{
            System.out.println("The value for currentHealth must be between 1 and 100. " +
                    "\nBy default, your currentHealth field will be set to the max value of 100.");
            this.currentHealth = 100;
        }
    }


    public Player(){

        this.name = "No NAME specified.";
        this.weapon = "No WEAPON specified.";
        this.currentHealth = 100;
    }

    @Override
    public ArrayList valuesToBeSaved() {

        ArrayList<String> playerFieldAttributes = new ArrayList<String>();
        playerFieldAttributes.add(0, this.name);
        playerFieldAttributes.add(1, this.weapon);
        playerFieldAttributes.add(2, String.valueOf(this.currentHealth));

        System.out.println("\n" + this.name + " is the name of the player. " + this.name + " has been saved. " +
                    "\n" + this.weapon + " is the name of the weapon " + this.name + " is wielding. " + this.weapon +
                    " has been saved. " +
                    "\n" + this.currentHealth + " is the amount of hit points " + this.name + " started with. " +
                    "The value of " + this.currentHealth + " has been saved. \n");

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
            this.weapon = stringArrayList.get(1);
            this.currentHealth = Integer.parseInt(stringArrayList.get(2));
        }
    }

    @Override
    public String toString() {

        return "The player named " + this.name + " is wielding a " + this.weapon +
                ". The player currently has " + this.currentHealth + "/100 hit points for health.";
    }


    public String getName() {
        return this.name;
    }


    public String getWeapon() {
        return this.weapon;
    }


    public int getCurrentHealth() {
        return this.currentHealth;
    }
}
