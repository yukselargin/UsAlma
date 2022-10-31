import java.util.Scanner;

public class Main{
    static int power(int a, int b) {

        if (b==0) {
            return 1;
        }

        return a*power(a,b-1);
    }
    public static void main (String[] args){
        int result =1;
        Scanner input= new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int a= input.nextInt();
        System.out.println("Üssü giriniz: ");
        int b= input.nextInt();

        System.out.println("Sonuç: "+power(a,b));
    }
}