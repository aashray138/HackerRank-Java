import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner bucky = new Scanner(System.in);

        try {
        int x = bucky.nextInt();
        int y = bucky.nextInt();
        int val = x / y ;
        System.out.println(val);

        } catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e){
	System.out.println(e);
}
    }
}