import java.util.*;
//import java.util.Scanner;
public class Assignment_problemt_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0 ; i < n  ; i++){
            int x = input.nextInt();
            numbers.add(x);
        }
        System.out.println("Total Unique Numbers"+numbers.size());
    }
}
