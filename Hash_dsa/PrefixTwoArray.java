import java.util.HashSet;
public class PrefixTwoArray {
    public static void main(String[] args) {
        PrefixTwoArray obj = new PrefixTwoArray();
        int[] A = {2, 3, 1};
        int[] B = {3, 1, 2};
        int[] result = obj.findThePrefixCommonArray(A, B);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        int[] ans = new int[A.length];

        int count = 0;

        for(int i = 0; i < A.length; i++) {

            setA.add(A[i]);
            setB.add(B[i]);

            if(setB.contains(A[i])) {
                count++;
            }

            if(A[i] != B[i] && setA.contains(B[i])) {
                count++;
            }

            ans[i] = count;
        }

        return ans;
    }
}

