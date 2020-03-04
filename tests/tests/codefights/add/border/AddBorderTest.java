package tests.codefights.add.border;

import add.border.AddBorder;
import alternating.sums.AlternatingSums;
import org.junit.Assert;
import org.junit.Test;

public class AddBorderTest {

        @Test
        public void test1(){
            String[] testData = new String[2];
            testData[0] = "abc";
            testData[1] = "ded";

            String[] pass = new String[4];
            pass[0] = "*****";
            pass[1] = "*abc*";
            pass[2] = "*ded*";
            pass[3] = "*****";


            AddBorder addBorder = new AddBorder();
            String[] result = addBorder.addBorder(testData);
            Assert.assertTrue(pass[0].equals(result[0]));
            Assert.assertTrue(pass[1].equals(result[1]));
            Assert.assertTrue(pass[2].equals(result[2]));
            Assert.assertTrue(pass[3].equals(result[3]));
        }

        @Test
        public void test2(){
            String[] testData = new String[1];
            testData[0] = "a";


            String[] pass = new String[3];
            pass[0] = "***";
            pass[1] = "*a*";
            pass[2] = "***";


            AddBorder addBorder = new AddBorder();
            String[] result = addBorder.addBorder(testData);
            Assert.assertTrue(pass[0].equals(result[0]));
            Assert.assertTrue(pass[1].equals(result[1]));
            Assert.assertTrue(pass[2].equals(result[2]));
        }

        @Test
        public void test3(){
            String[] testData = new String[3];
            testData[0] = "aa";
            testData[1] = "**";
            testData[2] = "zz";


            String[] pass = new String[5];
            pass[0] = "****";
            pass[1] = "*aa*";
            pass[2] = "****";
            pass[3] = "*zz*";
            pass[4] = "****";


            AddBorder addBorder = new AddBorder();
            String[] result = addBorder.addBorder(testData);
            Assert.assertTrue(pass[0].equals(result[0]));
            Assert.assertTrue(pass[1].equals(result[1]));
            Assert.assertTrue(pass[2].equals(result[2]));
            Assert.assertTrue(pass[3].equals(result[3]));
            Assert.assertTrue(pass[4].equals(result[4]));
        }

        @Test
        public void test4(){
            String[] testData = new String[5];
            testData[0] = "abcde";
            testData[1] = "fghij";
            testData[2] = "klmno";
            testData[3] = "pqrst";
            testData[4] = "uvwxy";


            String[] pass = new String[7];
            pass[0] = "*******";
            pass[1] = "*abcde*";
            pass[2] = "*fghij*";
            pass[3] = "*klmno*";
            pass[4] = "*pqrst*";
            pass[5] = "*uvwxy*";
            pass[6] = "*******";


            AddBorder addBorder = new AddBorder();
            String[] result = addBorder.addBorder(testData);
            Assert.assertTrue(pass[0].equals(result[0]));
            Assert.assertTrue(pass[1].equals(result[1]));
            Assert.assertTrue(pass[2].equals(result[2]));
            Assert.assertTrue(pass[3].equals(result[3]));
            Assert.assertTrue(pass[4].equals(result[4]));
            Assert.assertTrue(pass[5].equals(result[5]));
            Assert.assertTrue(pass[6].equals(result[6]));
        }

        @Test
        public void test5(){
            String[] testData = new String[1];
            testData[0] = "wzy**";


            String[] pass = new String[3];
            pass[0] = "*******";
            pass[1] = "*wzy***";
            pass[2] = "*******";


            AddBorder addBorder = new AddBorder();
            String[] result = addBorder.addBorder(testData);
            Assert.assertTrue(pass[0].equals(result[0]));
            Assert.assertTrue(pass[1].equals(result[1]));
            Assert.assertTrue(pass[2].equals(result[2]));
        }
}
