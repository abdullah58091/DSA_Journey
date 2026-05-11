public class introductionofarray {
    public static void main(String[] args) {

//        Practicing prct = new Practicing();
//        int addedNumber = prct.addTwoNumber(4, 5);
//        System.out.println(addedNumber);
//       1.  decleration and memory allocation
//       int [] marks = new int [5];
//        marks [0]= 25;
//        marks [1]= 26;
//        marks [2]= 86;
//        marks [3]= 35;
//        marks [4]= 62;
//        System.out.println(marks[2]);
//      2. deceleration and then allocation memory
//          int [] marks ;
//         marks = new int [5];
//        marks [0]= 25;
//        marks [1]= 26;
//        marks [2]= 86;
//        marks [3]= 35;
//        marks [4]= 62;
//        System.out.println(marks[2]);
        // 3. deceleration ,memory allocation and initialization together
//          int [] marks = {98,53,62,82,78};
//        System.out.println(marks[3]);


        //total number of length
//        int [] marks = {1,2,5,5,0,6,0,60,6,0,60,60,60,06,60,60,60,60,60,60,06,60,60,06,60,60,60,06,60,50,50,50,6,6,9,20,02,20,20,20,20,20,20,20,20,20,90,90,90,80,80,80,80,50,805,0,80,80,80,80,9,90,90};
//        System.out.println(marks.length);
        //display an array
//        int [] marks ={10,20,30,40,50};
//        for(int i=0; i< marks.length;i++)
//        {
//            System.out.println(marks[i]);
        //       }

        //quiz reverse loop
//        System.out.println("the revers loop quiz");
//        int [] marks = {10,20,30,40,50};
//        for (int i=marks.length-1; i>=0 ;i--)
//        {
//            System.out.println(marks[i]);


//            System.out.println(" the for each loop ");
//            int [] marks = {10,20,30,40,50};
//            for(int element: marks){;
//            System.out.println(element);

//        //MultiDimention
//
//        int[] marks; //A 1-D array
//        int[][] flats;// A 2-D array
//        flats = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("\n");
//        }
//    }
//}
//
//class Practicing {
//
//    public int addTwoNumber(int num1, int num2) {
//        return num1 + num2;
//        int marks [] = {12,23,24,35,56};
//        System.out.println(marks[3]);

        int[] apple = {1, 2, 3, 4, 5, 6, 7};

        for (int i = apple.length - 1; i >= 0; i--) {

            System.out.println(apple[i]);
        }

    }
}
