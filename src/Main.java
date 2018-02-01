/*
Given an integer, convert it to binary. Then find and print the binary value
and the maximum number of consecutive 1's in the binary representation.
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int number = 35;
        System.out.println(number + " in binary will be:");
        ArrayList<Boolean> binaryList =toBinary(number);
        printBinary(binaryList);
        System.out.println("With max " + numberOfConsecutiveOnes(binaryList) + " consecutive ones");
    }

    public static ArrayList<Boolean> toBinary(int n){
        int remainder = 0;
        ArrayList<Boolean> tmpList = new ArrayList<Boolean>();
        while (n>0){
            if(n%2==0){
                tmpList.add(false);
            }
            else{
                tmpList.add(true);
            }
            n= n/2;
        }
        ArrayList<Boolean> binaryList = new ArrayList<Boolean>();
        for (int i = tmpList.size() -1; i>=0; i--){
            binaryList.add(tmpList.get(i));
        }
        return binaryList;
    }

    public static void printBinary(ArrayList<Boolean> binaryList){
        for (int i=0;i<binaryList.size();i++){
            if(binaryList.get(i)==true){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
        System.out.println();
    }

    public static int numberOfConsecutiveOnes(ArrayList<Boolean> binaryList){

        int consecutives= 0;
        int counter=0;

        for (int i = 0; i<binaryList.size(); i++){
            if (binaryList.get(i)==true) {
                counter++;
                if (consecutives < counter){
                    consecutives = counter;
                }
            }
            else{
                counter = 0;
            }
        }
        return consecutives;
    }
}
