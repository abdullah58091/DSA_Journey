public class Longest_Common_Prefix {
    
    public String LCP ( String[] strs){

      for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];

    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Longest_Common_Prefix result = new Longest_Common_Prefix();
        System.out.println(result.LCP(strs));
    }
}
