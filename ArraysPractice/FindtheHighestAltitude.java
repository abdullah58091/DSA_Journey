public class FindtheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }
    public static void main(String[] args) {
        FindtheHighestAltitude solution = new FindtheHighestAltitude();
        int[] gain = {-5, 1, 5, 0, -7};
        int result = solution.largestAltitude(gain);
        System.out.println("The highest altitude is: " + result);
    }
}