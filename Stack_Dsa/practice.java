import java.util.Stack;
public class practice {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        practice obj = new practice();
        String s = "abbaca";
        String result = obj.removeDuplicates(s);
        System.out.println(result); 
    }
}


