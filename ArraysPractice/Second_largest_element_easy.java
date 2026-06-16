package ArraysPractice;

public class Second_largest_element_easy {
    public static void main(String[] args) {
        int [] arr = {10, 5, 20, 8, 20, 15};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int elem = arr[i];

            if (elem > largest) {

                secondLargest = largest;
                largest = elem;

            } else if (elem > secondLargest && elem != largest){

                secondLargest = elem;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest Element Not Found");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
