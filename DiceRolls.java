import java.util.Random;

    public class DiceRolls {
        
        public static void main(String[] args) {
            
            System.out.println("Dice1 Dice2 Totle");
            Random ra=new Random();
            for (int i=0; i<5 ; i++) {
            int x=ra.nextInt(6)+1;
            int y=ra.nextInt(6)+1;
            int sum=x+y;
            System.out.println(x+"      "+y+"      "+sum);
            }
        }
    }
