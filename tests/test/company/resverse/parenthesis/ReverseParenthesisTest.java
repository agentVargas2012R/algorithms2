package test.company.resverse.parenthesis;

import com.company.reverseParentheses.ReverseParenthesis;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class ReverseParenthesisTest {

    @Test
    public void test1(){
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String test = "a(bc)de";
        String pass = "acbde";
        String result = reverseParenthesis.reverseParentheses(test);

        Assert.assertTrue(pass.equals(result));
    }

    @Test
    public void test5(){
        String testData = "Where are the parentheses?";
        String pass = "Where are the parentheses?";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        Assert.assertTrue(pass.equals(result));
    }


    @Test
    public void test2(){
        String testData = "a(bcdefghijkl(mno)p)q";
        String pass = "apmnolkjihgfedcbq";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        Assert.assertTrue(pass.equals(result));
    }

    @Test
    public void test3(){
        String testData = "co(de(fight)s)";
        String pass = "cosfighted";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        Assert.assertTrue(pass.equals(result));

    }



    @Test
    public void test4(){
        String testData = "Code(Cha(lle)nge)";
        String pass = "CodeegnlleahC";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        Assert.assertTrue(pass.equals(result));
    }

    @Test
    public void test6(){
        String testData = "abc(cba)ab(bac)c";
        String pass = "abcabcabcabc";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        Assert.assertTrue(pass.equals(result));
    }

    //s: "The ((quick (brown) (fox) jumps over the lazy) dog)"
    @Test
    public void test7(){
        String testData = "The ((quick (brown) (fox) jumps over the lazy) dog)";
        String pass = "The god quick nworb xof jumps over the lazy";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        Assert.assertTrue(pass.equals(result));
    }


    @Test
    public void test9(){
        String testData = "(a(b)c)";
        String pass = "(())";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        assert(pass.equals(result));
    }

    //(bac)bac
    @Test
    public void test10(){
        String testData = "(bac)bac";
        String pass = "cabbac";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        assert(pass.equals(result));
    }

    //(meh(peh(beh(tex)l)))
    @Test
    public void test11(){
        String testData = "(meh(peh(beh(tex)l)))";
        String pass = "pehltexhebhem";
        ReverseParenthesis reverseParenthesis = new ReverseParenthesis();
        String result = reverseParenthesis.reverseParentheses(testData);
        assert(pass.equals(result));
    }

}
