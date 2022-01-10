package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    VirtualPetShelter shelterTest;
    VirtualPet petTest1;
    VirtualPet petTest2;

    @BeforeEach
    public void setUp(){
        shelterTest = new VirtualPetShelter();
        petTest1 =  new VirtualPet(50, 50, 50, 50, "max", "black");
        petTest2 =  new VirtualPet(50, 50, 50, 50, "oliver", "yellow");
    }

    @Test
    public void shouldBeAbleToAddPet(){
        shelterTest.takeInPet(petTest1);
        VirtualPet retrievePet = shelterTest.findPetName("max");
        assertEquals(retrievePet, petTest1);
        }


    @Test
    public void shouldBeAbleToAddTwoPets(){
        shelterTest.takeInPet(petTest1);
        shelterTest.takeInPet(petTest2);
        Collection<VirtualPet> allPets = shelterTest.getAllPets();
        assertEquals(2, allPets.size());
    }

    @Test
    public void shouldBeAbleToRemoveAPet(){
        shelterTest.takeInPet(petTest1);
        String petName = petTest1.getName();
        shelterTest.petAdoption(petName);
        assertEquals( 0, shelterTest.getAllPets().size());
    }

    @Test
    public void shouldAddToHunger(){
        shelterTest.takeInPet(petTest1);
        shelterTest.feedPet(petTest1.getName());
        assertEquals(petTest1.getHunger(), 45 );
    }

    @Test
    public void shouldAddToBored(){
        shelterTest.takeInPet(petTest1);
        shelterTest.playWithPet(petTest1.getName());
        assertEquals(petTest1.getBored(), 45 );
    }

    @Test
    public void shouldAddToThirst(){
        shelterTest.takeInPet(petTest1);
        shelterTest.givePetWater(petTest1.getName());
        assertEquals(petTest1.getThirst(), 45 );
    }

    @Test
    public void shouldAddToBathroom(){
        shelterTest.takeInPet(petTest1);
        shelterTest.bathroomTime(petTest1.getName());
        assertEquals(petTest1.getBathroom(), 45 );
    }

}
