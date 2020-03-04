package alphabetic.shift;

/**
 * Given a string, your task is to replace each of its characters
 * by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc
 * (z would be replaced by a).
 */
public class AlphabeticShiftContainer {

    public String alphabeticShift(String inputString) {
        StringBuffer shiftedWord = new StringBuffer();

        char[] chars = inputString.toCharArray();
        for(char ch : chars){

            if(ch == 'z'){
                ch = 'a';
            }else{
                ch++;
            }
            shiftedWord.append(ch);
        }
        return shiftedWord.toString();
    }

}
