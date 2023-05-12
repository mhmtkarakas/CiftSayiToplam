import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , sum = 0 ;

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            n = input.nextInt();
            if(n%2==0 && n%4 == 0){
                sum +=n;
            }

        }while(n % 2 != 1 );
        System.out.print("Cift ve 4'un katlari olan sayilarin toplami : " + sum);
    }
}