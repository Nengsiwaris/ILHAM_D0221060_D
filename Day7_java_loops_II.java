import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int rank = 0;
            int result = a + (int)Math.pow(2, rank) * b;
            System.out.print (result+" ");
            while(rank < n-1){
                rank += 1;
                result += (int)Math.pow(2, rank) * b;
                System.out.print(result+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
