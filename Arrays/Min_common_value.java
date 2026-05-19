public class Min_common_value {

    public int minCommonValue(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                return arr1[i];
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1; // No common value found
    }

    public static void main(String[] args) {
        Min_common_value obj = new Min_common_value();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2,3, 4, 5, 6, 7};
        System.out.println(obj.minCommonValue(arr1, arr2)); // Output: 3
    }
}