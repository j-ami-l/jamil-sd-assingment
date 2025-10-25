import java.util.*;

class TooLongWords {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        // System.out.println(sentence);
        if(sentence.length() > 10){
            String abb = "" + sentence.charAt(0) + (sentence.length() - 2) + sentence.charAt(sentence.length() - 1);
            System.out.println(abb);
        } else {
            System.out.println(sentence);
        }
    }
}
