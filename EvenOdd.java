import java.util.Random;

public class EvensOdds {
    
    public static void main (String[] args) {
        
        int[] randomNum = new int[25];
        for (int i=0; i<randomNum.length; i++) {
            randomNum[i] = (int)(Math.random()*99);
        }
        System.out.print("ODD: ");
        for (int a=0; a<randomNum.length; a++) {
            if (randomNum[a] %2 != 0) {
                System.out.print(randomNum[a]+" ");
            }
        }
        System.out.println("");
        System.out.print("Even: ");
        for (int b=0; b<randomNum.length; b++) {
            if (randomNum[b] %2 == 0) {
                System.out.print(randomNum[b]+" ");
            }
        }
    }
}
