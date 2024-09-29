package Basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindEvenOddNumber {
    public static void main(String[] args) {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            var inputSample = inputReader.readLine();
            var inputTestCase = Integer.parseInt(inputSample);
            var resultOutput = isNumberEvenOrOdd(inputTestCase);
            System.out.println(resultOutput);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static String isNumberEvenOrOdd(int inputSample) {
        if(inputSample%2==0){
            return "Even";
        }
        return "Odd";
    }
}

