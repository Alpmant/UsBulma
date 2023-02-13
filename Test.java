import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı:");
        int x = input.nextInt();
        System.out.print("Üs:");
        int y=input.nextInt();
        int sayi=1;
        for(int i =1;i<=y;i++)
        {
            sayi*=x;
        }
        System.out.println(sayi);






    }
}
