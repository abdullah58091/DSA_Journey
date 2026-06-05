public class Waviness {
 
   public long totalWaviness(long num1, long num2) {

        long total = 0;

        for (long num = num1; num <= num2; num++) {
            total += getWaviness(num);
        }

        return total;
    }

    private int getWaviness(long num) {

        String s = String.valueOf(num);

        if (s.length() < 3) return 0;

        int count = 0;

        for (int i = 1; i < s.length() - 1; i++) {

            int prev = s.charAt(i - 1) - '0';
            int cur  = s.charAt(i) - '0';
            int next = s.charAt(i + 1) - '0';

            if ((cur > prev && cur > next) ||
                (cur < prev && cur < next)) {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        Waviness waviness = new Waviness();
        long result = waviness.totalWaviness(100, 200);
        System.out.println("Total Waviness: " + result);

    }
}


