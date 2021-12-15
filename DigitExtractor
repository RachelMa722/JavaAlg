import java.util.Scanner;

//Template class
class DigitExtractor {
    private int number;
    private int units;
    private int tens;
    private int hundreds;

    public DigitExtractor(int input) {
        number = input;
        units = number%10;
        tens = number/10%10;
        hundreds = number/100%10;
    }

    public int return_units() {
        return units;
    } 

    public int return_tens() {
        return tens;
    }

    public int return_hundreds() {
        return hundreds;
    }
}

//Test class
public class TestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        System.out.println("Please enter an integer number(entering a number outside of the range of 0 to 999 will result in an error from the Num object): ");
        input = sc.nextInt();
        if (input<1000) { 
            DigitExtractor num = new DigitExtractor(input);
            System.out.println("Whole number: " + input);
            System.out.println("The ones digit is: " + num.return_units());
            System.out.println("The tens digit is: " + num.return_tens()); 
            System.out.println("The hundreds digit is: " + num.return_hundreds());
        }else {
            System.out.println("Please enter an integer number(entering a number outside of the range of 0 to 999 will result in an error from the Num object): ");
        }       

    }
}
