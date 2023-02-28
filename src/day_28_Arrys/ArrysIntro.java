package day_28_Arrys;

import java.util.Arrays;

public class ArrysIntro {
    public static void main(String[] args) {
        int[]arry;
        //int arry []; böyle de olur

        //Insantiating
        arry=new int[5]; // or
        int[] arryx= new int [5]; // declaring and instantiating

        // alterna declaring
        int[] arry1,arry2;
        int arry3[],arry4[],arry5[];


        // initializng

        arry[0]=10;
        arry[1]=20;
        arry[2]=30;
        arry[3]=40;
        arry[4]=50;

        // how to write an array to console
        // a) foreach()
        for(int i: arry){
            System.out.println(i);

        }
        // b) foorloop
        for (int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }

        //  c) toString()
        System.out.println();
        System.out.println(Arrays.toString(arry));

        // d) literal way
        //arry1 = { 60,70,80,90}; // you can not do this bunu yapamazsın
        int[]arrayL= { 60,70,80,90,100};
        System.out.println(arrayL[3]);
        System.out.println(arrayL[4]);
        System.out.println(Arrays.toString(arrayL));
        System.out.println(arrayL.length);

//
        arry1=new int[3];
         System.out.println(Arrays.toString(arry1));
        System.out.println(arry1[0]);

        arry2=arry1;
        System.out.println(Arrays.toString(arry2));

    }



















}
