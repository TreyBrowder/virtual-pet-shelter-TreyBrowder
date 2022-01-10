package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        VirtualPetShelter myShelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet(50,50,50,50,"max", "gray");
        VirtualPet pet2 = new VirtualPet(50,50,50,50,"ollie", "yellow");
        VirtualPet pet3 = new VirtualPet(50,50,50,50,"ace", "black");
        VirtualPet pet4 = new VirtualPet(50,50,50,50,"ty", "brown");

        myShelter.takeInPet(pet1);
        myShelter.takeInPet(pet2);
        myShelter.takeInPet(pet3);
        myShelter.takeInPet(pet4);

        System.out.println("WELCOME TO VIRTUAL PET!");
        System.out.println();

        String gameOptChoice;

        do{
            System.out.println("Here is the status of all pets with us today:");
            myShelter.controlPetStats();
            myShelter.showAllPets();
            System.out.println();

            System.out.println("Please enter a number from the options below:");
            System.out.println();
            System.out.println("1. Feed pets");
            System.out.println("2. play with pets");
            System.out.println("3. give water to pets");
            System.out.println("4. take pets out to bathroom");
            System.out.println("5. to add a new pet to the shelter");
            System.out.println("6. to adopt a pet out of the shelter");
            System.out.println("7. exit");
            gameOptChoice = userInput.nextLine();

            if(gameOptChoice.equals("1")){
                //feed pets
                System.out.println("you chose to feed a pet");
                System.out.println("please type in the name of pet you want to feed: ");
                myShelter.showAllPets();

                String petChoice = userInput.nextLine();
                myShelter.feedPet(petChoice);

            }else if(gameOptChoice.equals("2")){
                //play with pets
                System.out.println("you chose to play with a pet");
                System.out.println("please type in the name of pet you want to play with: ");
                myShelter.showAllPets();

                String petChoice = userInput.nextLine();
                myShelter.playWithPet(petChoice);


            }else if(gameOptChoice.equals("3")){
                //give pets water
                System.out.println("you chose to give water to a pet");
                System.out.println("please type in the name of pet you want to give water to: ");
                myShelter.showAllPets();

                String petChoice = userInput.nextLine();
                myShelter.givePetWater(petChoice);

            }else if(gameOptChoice.equals("4")){
                //take pets out to bathroom
                System.out.println("you chose to take a pet out to relieve itself");
                System.out.println("please type in the name of pet you want to give a bathroom break to: ");
                myShelter.showAllPets();

                String petChoice = userInput.nextLine();
                myShelter.bathroomTime(petChoice);
            }else if(gameOptChoice.equals("5")){
                //add new pet to shelter
                System.out.println("you chose to add a new pet");
                System.out.println("what is the name of your pet you want to add?");
                String newPetAddedName = userInput.nextLine();
                System.out.println("what color is the pet?");
                String newPetAddedDescription = userInput.nextLine();

                VirtualPet newPet = new VirtualPet(50, 50, 50, 50,
                        newPetAddedName, newPetAddedDescription);
                myShelter.takeInPet(newPet);
                myShelter.showAllPets();

            }else if(gameOptChoice.equals("6")){
                //remove a pet from shelter
                System.out.println("you chose to adopt a pet!");
                System.out.println("please type in the name of pet you want to adopt: ");
                myShelter.showAllPets();

                String petChoice = userInput.nextLine();
                myShelter.petAdoption(petChoice);
                myShelter.showAllPets();
            }

            myShelter.controlPetStats();

        }while(!gameOptChoice.equals("7"));
        System.out.println("Thanks for coming in today!!");
    }

}
