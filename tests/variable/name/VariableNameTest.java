package variable.name;

import org.junit.Assert;
import org.junit.Test;

public class VariableNameTest {

    private VariableNameContainer variableNameContainer = new VariableNameContainer();

    /**
     * Input:
     *  name: "var_1__Int"
     *
     * Expected Output:
     *  true
     */
    @Test
    public void test1() {
        String name = "var_1__Int";
        Boolean result = variableNameContainer.variableName(name);
        Boolean pass  = true;

        if(result != pass){
            Assert.assertTrue("Variable Name " + name + " should be " + pass, false);
        }
    }

    /**
     * Input:
     *  name: "qq-q"
     *
     * Expected Output:
     *  false
     */
    @Test
    public void test2() {
        String name = "qq-q";
        Boolean result = variableNameContainer.variableName(name);
        Boolean pass  = false;

        if(result != pass){
            Assert.assertTrue("Variable Name " + name + " should be " + pass, false);
        }
    }

    /**
     * Input:
     *  name: "2w2"
     *
     * Expected Output:
     *  false
     */
    @Test
    public void test3() {
        String name = "2w2";
        Boolean result = variableNameContainer.variableName(name);
        Boolean pass  = false;

        if(result != pass){
            Assert.assertTrue("Variable Name " + name + " should be " + pass, false);
        }
    }

    /**
     * Input:
     *  name: " variable"
     *
     * Expected Output:
     *  false
     */
    @Test
    public void test4() {
        String name = " variable";
        Boolean result = variableNameContainer.variableName(name);
        Boolean pass  = false;

        if(result != pass){
            Assert.assertTrue("Variable Name " + name + " should be " + pass, false);
        }
    }

    /**
     * Input:
     *  name: "variable0"
     *
     * Expected Output:
     *  true
     */
    @Test
    public void test5() {
        String name = "variable0";
        Boolean result = variableNameContainer.variableName(name);
        Boolean pass  = true;

        if(result != pass){
            Assert.assertTrue("Variable Name " + name + " should be " + pass, false);
        }
    }
}
