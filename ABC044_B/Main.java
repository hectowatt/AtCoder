package ABC044_B;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        int count=0;

            for(int i=0; i<str.length(); i++){
                for(int j=0; j<str.length();j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                    if(count%2 != 0){
                        System.out.print("No");
                        return;
                    }
            }
            System.out.print("Yes");
    }
}
