package shelter;

public class VirtualPet {

    private int hunger;
    private int bored;
    private int thirst;
    private int bathroom;
    private String name;
    private String description;

    public VirtualPet(int hunger, int bored, int thirst, int bathroom, String name, String description){
        this.hunger = hunger;
        this.bored = bored;
        this.thirst = thirst;
        this.bathroom = bathroom;
        this.name = name;
        this.description = description;
    }

    //getters*******
    public int getHunger(){
        return hunger;
    }

    public int getBored(){
        return bored;
    }

    //getters****************
    public int getThirst(){
        return thirst;
    }

    public int getBathroom(){
        return bathroom;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    //methods of behavior*******
    public void controlStats(){

        //keep hunger stat between 0 & 100
        if(hunger < 0 ){
            hunger = 0;
        }else if(hunger > 100){
            hunger = 100;
        }

        //keep bored stat between 0 & 100
        if(bored < 0 ){
            bored = 0;
        }else if(bored > 100){
            bored = 100;
        }

        //keep thirst stat between 0 & 100
        if(thirst < 0 ){
            thirst = 0;
        }else if(thirst > 100){
            thirst = 100;
        }

        //keep bathroom stat between 0 & 100
        if(bathroom < 0 ){
            bathroom = 0;
        }else if(bathroom > 100){
            bathroom = 100;
        }
    }

    public void giveFood(){
        hunger -= 25;
        thirst += 15;
        bathroom += 10;
    }

    public void playTime(){
        bored -= 25;
        thirst += 5;
    }

    public void giveWater(){
        thirst -= 25;
        bathroom += 15;
    }

    public void bathroomBreak(){
        bathroom -= 40;
    }

    public void tick(){
        hunger += 5;
        bored += 5;
        thirst += 5;
        bathroom += 10;
    }



}
