public class CheckArraySorted {


    public static boolean isSorted(int[] arr) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]%n) {
                    count++;
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
            int  nums [] = {1,2,5,3,4};
            System.out.println(isSorted(nums));
    }
}   