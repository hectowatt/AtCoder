package AtCoder.ABC043_B;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        while(str.contains("B")){
            int idx = str.indexOf("B");
            str=(idx>0? str.substring(0,idx-1):"") + str.substring(idx+1);
        }
        System.out.print(str);
        sc.close();
    }
}
