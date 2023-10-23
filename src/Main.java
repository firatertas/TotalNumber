import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        Scanner sc = new Scanner(System.in);
        int numTotal = 0, numStep = 1, numValue = 1;
        System.out.print("Lütfen sayı giriniz : ");
        int number = sc.nextInt();
        int value = number;

        while (number != 0) {
            int lastDigit = number % 10;
            numTotal += lastDigit;
            number /= 10;
            numValue++;
        }


        System.out.println(value + " sayısının basamak toplamı " + numTotal + " eşittir.");
    }
}