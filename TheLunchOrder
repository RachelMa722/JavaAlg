import java.text.NumberFormat;
import java.util.Scanner;

// Template class
class Food {
        String  item; 
        double price; 
        double fat; 
        double carb; 
        double fiber; 

        public Food(String iem,double v, double v1, int i, int i1) {
            item = iem;
            price = v;
            fat = v1;
            carb = i;
            fiber = i1;
        }
        public void setItem(String item) {
            this.item = item;
        }
            
        public String getItem() {
            return item;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getFat() {
            return fat;
        }

        public void setFat(double fat) {
            this.fat = fat;
        }

        public double getCarb() {
            return carb;
        }

        public void setCarb(double carb) {
            this.carb = carb;
        }

        public double getFiber() {
            return fiber;
        }

        public void setFiber(double fiber) {
            this.fiber = fiber;
        }
}
    
//Test class    
public class Lunch {
    
    private static double foodTotal= 0;

    public static String formatFood(Food food,int n){
        foodTotal +=  food.getPrice()* n;
        return "Each "+food.getItem()+" has "+food.getFat()+"g of fat,"+food.getCarb()+"g of carbs, and "+food.getFiber()+"g of fiber.\n";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of hamburgers: ");
        int hamburgerTotal = input.nextInt();
        Food hamburger = new Food("hamburgers",1.85, 9.0, 33, 1);
        System.out.println(formatFood(hamburger,hamburgerTotal));

        System.out.print("Enter number of salads: ");
        int saladTotal = input.nextInt();
        Food salad = new Food("salads",2.00, 1, 11, 5);
        System.out.println(formatFood(salad,saladTotal));

        System.out.print("Enter number of french fries: ");
        int frenchFrieTotal = input.nextInt();
        Food frenchFrie = new Food("fries",1.30, 11, 36, 4);
        System.out.println(formatFood(frenchFrie,frenchFrieTotal));

        System.out.print("Enter number of sodas: ");
        int sodaTotal = input.nextInt();
        Food soda = new Food("sodas",0.95, 0, 38, 0);
        System.out.println(formatFood(soda,sodaTotal));
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println("Your order comes to: $"+nf.format(foodTotal));

    }
    
}
