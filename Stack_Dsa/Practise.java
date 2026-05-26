public class Practise {
   
    public int numberOfSpecialChars(String word) {

      //int n = word.length();
      int count = 0 ;
        for(char ch = 'a' ; ch <= 'z'; ch++){
           
        if(word.indexOf(ch) != -1 &&
               word.indexOf(Character.toUpperCase(ch)) != -1) {

                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Practise p = new Practise();
        String word = "aAbBcC";
        int result = p.numberOfSpecialChars(word);
        System.out.println("Number of special characters: " + result);
    }
}

