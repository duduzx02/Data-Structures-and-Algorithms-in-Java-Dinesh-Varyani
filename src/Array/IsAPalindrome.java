package Array;

public class IsAPalindrome {
    public boolean Solution(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        IsAPalindrome obj = new IsAPalindrome();
        boolean result = obj.Solution("racecar");
        System.out.println(result);
    }
}
