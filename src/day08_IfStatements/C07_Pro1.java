package day08_IfStatements;

import java.util.Scanner;

public class C07_Pro1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scan.nextInt() ;
        int sayi2 = scan.nextInt() ;

        if (sayi1 > 0 && sayi2 > 0 ) {
            System.out.println(sayi1 + sayi2);

        } else if(sayi1<0 && sayi2<0 ) {
            System.out.println(sayi1*sayi2);

        } else if (sayi1 == 0 || sayi2 == 0){
            System.out.println("sifir carpmaya göre yutan elemandir");

        } else {
            System.out.println("farkli isaretli sayilarla islem yapamazsin" );
        }


    }
}
