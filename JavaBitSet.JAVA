import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int numValues = get.nextInt();
        int operations = get.nextInt();
      
        BitSet b1 = new BitSet(numValues);
        BitSet b2 = new BitSet(numValues);
        BitSet[] bitset = new BitSet[3];
      
        bitset[1] = b1;
        bitset[2] = b2;
      
        while ( 0 < operations--) {
          String operation = get.next();
          int x = get.nextInt();
          int y = get.nextInt();
          
        if (operation.equals("AND")){
              bitset[x].and(bitset[y]);
            
        }else  if (operation.equals("OR")){
              bitset[x].or(bitset[y]);
           
        }else if (operation.equals("XOR")){
              bitset[x].xor(bitset[y]);
      
        }else if (operation.equals("FLIP")){
              bitset[x].flip(y);
        
        }else if (operation.equals("SET")){
              bitset[x].set(y);
          }
          
          System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
        }
    }
}