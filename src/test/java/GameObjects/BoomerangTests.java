import static org.junit.Assert.*;
import org.junit.*;

import GameObjects.Boomerang;

public class BoomerangTests {

    @Test
    public void checkNumLeft1(){
	Boomerang b = new Boomerang();
	assertEquals(b.getNumLeft(1), 3);
    }

    @Test
    public void checkNumLeft2(){
	Boomerang b = new Boomerang();
	assertEquals(b.getNumLeft(2), 3);
    }
    
    @Test
    public void checkNumLeft3(){
	Boomerang b = new Boomerang();
	assertEquals(b.getNumLeft(3), 3);
    }

    @Test
    public void checkNumLeft4(){
	Boomerang b = new Boomerang();
	assertEquals(b.getNumLeft(4), 3);
    }

    @Test
    public void checkNumLeftUsed(){
	Boomerang b = new Boomerang();
	b.useBoom(1);
	assertEquals(b.getNumLeft(1), 2);
    }

    
    @Test
    public void checkNumLeftUsedTwice(){
	Boomerang b = new Boomerang();
	b.useBoom(1);
	b.useBoom(1);
	assertEquals(b.getNumLeft(1), 1);
    }

    @Test
    public void checkNumLeftNotUsed(){
	Boomerang b = new Boomerang();
	b.useBoom(1);
	assertEquals(b.getNumLeft(2), 3);
    }

    @Test
    public void checkUseBoom(){
	Boomerang b = new Boomerang();
	assertEquals(b.useBoom(1), true);
    }

    @Test
    public void checkNoneLeft(){
	Boomerang b = new Boomerang();
	b.useBoom(1);
	b.useBoom(1);
	b.useBoom(1);	
	assertEquals(b.useBoom(1), false);
    }
}
