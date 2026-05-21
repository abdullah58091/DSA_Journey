public class PrefixLongest {
public int longestCommonPrefix(int[] arr1, int[] arr2) {

        int max = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                String a = String.valueOf(arr1[i]);
                String b = String.valueOf(arr2[j]);

                int count = 0;

                int len = Math.min(a.length(), b.length());

                for (int k = 0; k < len; k++) {

                    if (a.charAt(k) == b.charAt(k)) {
                        count++;
                    } else {
                        break;
                    }
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        PrefixLongest obj = new PrefixLongest();
        int[] arr1 = {123, 456, 789};
        int[] arr2 = {1234, 4567, 7890};
        int result = obj.longestCommonPrefix(arr1, arr2);
        System.out.println(result);
}
}
