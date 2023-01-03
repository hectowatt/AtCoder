package ABC045_A;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int above = sc.nextInt();
        int below = sc.nextInt();
        int height = sc.nextInt();

        int ans = ((above + below)*height)/2;

        System.out.print(ans);
    }
}
