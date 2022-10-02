package day29_passByeValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
         4 elemanli bir array olusturalim
         sonra ayri bir method'da
         bu array'in 2. ve 4. elemanlarini
        100'den kucuk rastgele bir sayi ile degistirelim
         ve yazdiralim
        */

        int [] arr = {5,7,8,10} ;

        elemanDegistir(arr);

        System.out.println("main methodun icinde diger method calistiktan sonra : " + Arrays.toString(arr));
        System.out.println(arr);
         //  [5, 74, 8, 36]
    }

    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();

        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);

        System.out.println("Method'un icinde : " + Arrays.toString(arr));  // [5, 74, 8, 36]

        System.out.println(arr);
    }
}
