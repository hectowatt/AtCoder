package ABC044_A;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int total = 0;

        if(N>K){
            for(int i=0;i<K;i++){
                total += X;
            }  
            for(int i=0;i<N-K;i++){
                total+=Y;
            }
        }else if(N==K){
            for(int i=0;i<N;i++){
                total+=X;
            }
        }else if(N<K){
            for(int i=0;i<N;i++){
                total+=X;
            }
        }

        System.out.print(total);
        sc.close();
    }   
}