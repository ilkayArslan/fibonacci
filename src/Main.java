import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet fibonacci istersiniz : ");
        int sayi = inp.nextInt();
       int fibonacci = 0, first =0,last=1;
        System.out.print(first + " " + last + " ");
       for (int i = 0 ; i<sayi-2;i++){
           fibonacci = first + last;
           first = last;
           last = fibonacci;
           System.out.print(fibonacci + " ");


       }

    }
}