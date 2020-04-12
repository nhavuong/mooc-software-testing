package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {
	
	GettingStarted g;
	
	@BeforeEach
	public void setup() {
		g = new GettingStarted();
	}

    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }
    
    @Disabled
    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    
    @Disabled
    @Test
    public void addFiveTo99() {
    	int result = g.addFive(99);
    	Assertions.assertEquals(104, result);
    }
    
    @Test
    public void addFiveToMinus1() {
    	int result = g.addFive(-1);
    	Assertions.assertEquals(4, result);
    }
}
