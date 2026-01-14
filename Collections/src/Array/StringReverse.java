package Array;

public class StringReverse {

    public static String reverse(String s) {

        String[] words = s.split("s+"); 
        
        StringBuilder sb = new StringBuilder();

        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]+" ");
            
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "Hare                        ram krishna";

        String revStr = reverse(s);

        System.out.println(revStr);  
        
    }

}
