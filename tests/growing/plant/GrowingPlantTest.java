package growing.plant;

import org.junit.Assert;
import org.junit.Test;

public class GrowingPlantTest {

    private GrowingPlantContainer growingPlantContainer = new GrowingPlantContainer();

    @Test
    public void test1() {
        int upSpeed = 100;
        int downSpeed = 10;
        int desiredHeight = 910;

        int output = growingPlantContainer.growingPlant(upSpeed, downSpeed, desiredHeight);
        int pass = 10;

        Assert.assertTrue("Expected growing plant to take " +
                        pass + " but was " + output, output == pass);

    }

    @Test
    public void test2() {
        int upSpeed = 10;
        int downSpeed = 9;
        int desiredHeight = 4;

        int output = growingPlantContainer.growingPlant(upSpeed, downSpeed, desiredHeight);
        int pass = 1;

        Assert.assertTrue("Expected growing plant to take " +
                pass + " but was " + output, output == pass);

    }
}
