/*
Given an integer, convert it to binary. Then find and print the binary value
and the maximum number of consecutive 1's in the binary representation.
 */
import java.util.ArrayList;
import java.util.Stack;

public class Main {
   public static void main(String[] args) {

        int nmbr = 35;

        Stack<Integer> stack = new Stack<>();


        while ((nmbr/2)>=1){
            stack.push(nmbr%2);
            nmbr = nmbr/2;
        }

        stack.push(nmbr);

        int iterations = stack.size();

        int cntr = 0;
        int max=0;

        for (int i =0;i<iterations;i++){
            int tmp = stack.pop();
            if (tmp==1){
                cntr++;
                if (max < cntr) max = cntr;
            }
            else{
                cntr=0;
            }
            System.out.print(tmp);
        }
        System.out.println();
        System.out.println(max);

    }
}
