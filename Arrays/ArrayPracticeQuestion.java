package com.company.Arrays;


public class ArrayPracticeQuestion {
    public static void main(String[] args) {
        /* Quetion1*/

//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        int e = 5;
//
//        int sum =(a+b+c+d+e);
//        System.out.println(sum);

//        int [] arr ={1,2,3,4,5};
//        int a =0;
//        for(int num :arr)
//            a += num;
//        System.out.println("sum = " + a  + " answer");

        //  Quetions 2
//        int [] arr = { 5,8,2,10,3};
//
//        int max = arr[0];
//        for (int i =1 ;i < arr.length; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println("maximum elements is ;"+max);

        //quetion 2 b
//        int [] arr = {12,45,7,89,23};
//         int max = arr[0];
//         for(int i = 1;i < arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//        System.out.println("Maximum elements is : " +max);
//
        // quetion 03
//        int [] arr = {11,2,3,44,52};
//        int min = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("minimum elements nuber : " + min);

        //Quetions 04
//        int [] arr = {1,2,3,4};
//        String name = "abdullah";
//        for(int i = name.length()-1;i>=0;i--){
//            System.out.println(name.charAt(i));
//        }
//        for(int i = arr.length -1; i >= 0; i--){
//            System.out.println(arr[i]);

        // quetions 05
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println("Enter the number :");
//        int key = sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == key) {
//                System.out.println("Elements founds ");
//            return;
//            }
//        }
//        System.out.println("Elements not founds ");
        // quetion 06
//        int [] arr = {10 ,5 ,20 ,8};
//        int first = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//        for( int i =0;i<arr.length;i++){
//            if(arr[i]>first){
//                second = first;
//                first = arr[i];
//            }
//            else if (arr[i]> second && arr[i]!=first) {
//                second = arr[i];
//
//            }
//        }
//        System.out.println("second largest:"+ second);
        // quetion 7
        int [] arr = {4,8,9,7,3,};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int num : arr)
            System.out.println(num + " ");
        // quetion 08

//        int [] arr1 = {1,2,3,4,5};
//        int [] arr2 = new int[arr1.length];
//        for(int i =0;i< arr1.length;i++)
//            arr2[i]=arr1[i];
//        for(int num : arr2)
//            System.out.print(num + " ");

        // quiz hai
//        String name = "ABDULLAH";
//        for (int i = name.length() - 1; i >= 0; i--)
//        {
//            System.out.print(name.charAt(i));
//        }
        // quetion 9
//        int [] arr = {1,2,2,3,4,4,5};
//        for(int i = 0;i < arr.length;i++){
//            boolean duplicate = false;
//              for(int j =0;j<i;j++){
//               if(arr[i] == arr[j]){
//                   duplicate =true;
//                   break;
//               }
//           }
//           if(!duplicate)
//            System.out.print(arr[i] + " ");
//        }
//        Scanner sc= new Scanner(System.in);
//        int [] arr = {1,2,3,4,5,6,7,8,9,0};
//        System.out.println("enter the nuber ");
//        int key = sc.nextInt();
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i] == key ){
//                System.out.println("elements hai ");
//                return;
//            }
//        }
//        System.out.println("elements nahi hai ");


    }
}