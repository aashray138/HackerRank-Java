import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println( A.length() + B.length());

        if (A.compareTo(B)>0){
             System.out.println("Yes");
        } else {
             System.out.println("No");
        }

        String output = A.substring(0, 1);
        String output1 = B. substring(0, 1);

        output = output.toUpperCase();
         output1 = output1.toUpperCase();
        System.out.println(  output + A.substring(1,A.length()) + " " + 
                output1 +  B.substring(1,B.length()));
    }
}



