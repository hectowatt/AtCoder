package ABC043_C;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] num = new double[N];
        double sum = 0;
        for(int i=0;i<N; i++){
            num[i] = sc.nextDouble();
            sum += num[i];
        }
        double avr=Math.round(sum/N);
        double ans=0;
        for(int i=0;i<N;i++){
            ans+=(num[i]-avr)*(num[i]-avr);
        }

        System.out.print((int)ans);
        sc.close();

    }
}
