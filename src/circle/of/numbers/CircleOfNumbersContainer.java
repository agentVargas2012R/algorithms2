package circle.of.numbers;

public class CircleOfNumbersContainer {

    public int circleOfNumbers(int n, int firstNumber) {
        int answer = 0;
        int semiCircle = n / 2;
        if(firstNumber < semiCircle ){
            answer = semiCircle + firstNumber;
        }else{
            answer = firstNumber - semiCircle;
        }
        return answer;
    }

}
