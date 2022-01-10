package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    //keyValue: pet name value: pet object
    Map<String, VirtualPet> myShelter = new HashMap<>();

    //add a pet into hashmap
    public void takeInPet(VirtualPet petToAdd) {

        myShelter.put(petToAdd.getName(), petToAdd);
    }

    //remove pet object out of hashmap
    public void petAdoption(String petName) {
        VirtualPet myPet = findPetName(petName);
        myShelter.remove(myPet.getName());
    }

    //getter for to return Key value(pet name)
    public VirtualPet findPetName(String petName) {

        return myShelter.get(petName);
    }

    //getter to return all items in the hashmap
    public Collection<VirtualPet> getAllPets() {

        return myShelter.values();
    }

    //methods of behaviors

    public void feedPet(String petName) {
        VirtualPet myPet = findPetName(petName);
        myPet.giveFood();
        myPet.tick();
    }

    public void playWithPet(String petName){
        VirtualPet myPet = findPetName(petName);
        myPet.playTime();
        myPet.tick();
    }

    public void givePetWater(String petName){
        VirtualPet myPet = findPetName(petName);
        myPet.giveWater();
        myPet.tick();
    }

    public void bathroomTime(String petName){
        VirtualPet myPet = findPetName(petName);
        myPet.bathroomBreak();
        myPet.tick();
    }

    public void controlPetStats(){
        for(VirtualPet myPet: myShelter.values()){
            myPet.controlStats();
        }
    }

    public void showAllPets() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Name", "Description", "Hunger", "Thirst", "Bathroom");
        for(VirtualPet myPet : myShelter.values()){
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",myPet.getName(), myPet.getDescription(),
                                myPet.getHunger(), myPet.getThirst(), myPet.getBathroom());
        }
    }
}

