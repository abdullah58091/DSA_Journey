import java.util.Scanner;

public class Practice_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // problem 01

        System.out.println("Enter the rows number : ");
        int rows = sc.nextInt();
        System.out.println("Enter the colum number: ");
        int colum = sc.nextInt();
        int [][] number = new int [rows][colum];
        // input
        // rows
        for (int i =0 ; i <rows;i++){
            // colum
            for (int j=0;j<colum;j++){
                System.out.print("Enter the numbers of rows and colum :");
                number[i][j]= sc.nextInt();
            }
        }
        for (int i =0;i<rows;i++){
            for (int j =0 ; j<colum;j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }


        // problem  02

        System.out.println(" ____ THIS IS FIND THE ELEMENT INDEXING  IN PROGRAM____..");
        System.out.println("Enter the rows number  : ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the colum number is ");
        int colum1 = sc.nextInt();

        int [][] nums = new int[rows1][colum1];

        for (int i =0 ;i<rows;i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("Enter the number of this rows and colum ");
                nums[i][j] = sc.nextInt();
            }
        }
        for (int i =0;i<rows1;i++){
            for (int j =0 ; j<colum1;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // -->> that are to find the indexing location --<<..
        System.out.println("Enter the numbers element  which are you found the index  ");
        int x = sc.nextInt();
        for (int i =0;i<rows;i++){
            for (int j =0; j<colum;j++){
                if ( nums[i][j] == x ){
                    System.out.println("x found the location is (" + i + "," + j + ")");
                }
            }
        }

        // problem 03
        System.out.println("Print the spiral order matrix as output for a given matrix of numbers. ");
        System.out.println("Enter the rows  is : ");
        int rows2 =  sc.nextInt();
        System.out.println("enter the colum is :");
        int colum2 = sc.nextInt();

        int [][]nums2 = new int[rows2][colum2] ;

        for (int i =0;i<rows2;i++){
            for (int j =0 ; j<colum2;j++){
                System.out.print("Enter the number of rows and colum ");
                nums2 [i][j]= sc.nextInt();
            }
        }

        for (int i =0;i<rows2;i++){
            for (int j =0 ; j<colum2;j++){
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }
           // same problem

        System.out.println("enter n  number is : ");
        int n = sc.nextInt();
        System.out.println("enter the m number is :");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print("Enter the n and m number is : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;


        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }




        // problem 04
        System.out.println("Enter the n1 is :");
        int n1= sc.nextInt();
        System.out.println("Enter the m1 is : ");
        int m1 = sc.nextInt();

        int  [][]matrix1= new int[n1][m1];
        for (int i= 0 ;i<n1;i++){
            for (int j = 0 ; j<m1;j++){
                System.out.print(" Enter the number of n1 and m1 is :");
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println(" this transpose of matrix");
        for (int j =0;j<m1;j++){
            for (int i =0 ;i<n1;i++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

