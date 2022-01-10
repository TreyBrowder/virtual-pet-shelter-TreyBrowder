package shelter;

import org.junit.jupiter.api.BeforeEach;

public class VirtualPetShelterTest {

    VirtualPetShelter shelterTest;
    VirtualPet petTest1;
    VirtualPet petTest2;

    @BeforeEach
    public void setUp(){
        shelterTest = new VirtualPetShelter();
        petTest1 =  new VirtualPet(150, 150, 150, 150, "max", "black");
        petTest2 =  new VirtualPet(-5, -5, -5, -5, "oliver", "yellow");
    }
}
