package ABC045_B;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];
		for (int i = 0; i < 3; i++) {
			s[i] = sc.next();
		}
		int i = 0;

		while (s[i].length()!=0) {
			int n = s[i].charAt(0) - 'a';
			s[i] = s[i].substring(1);
			i=n;
		}
		System.out.println((char)('A'+i));

	}

}

        /*これでいけると思ったんだけどだめだった。なぜかわからん

        if(a.substring(0, 1)=="a"){
            strA();
        }else if(a.substring(0, 1)=="b"){
            strB();
        }else if(a.substring(0, 1)=="c"){
            strC();
        }

    }

    static void strA(){
        if(a==""){
            System.out.print("A");
            return;
        }
         String topA = a.substring(0,1);
        a=a.substring(1);
        if(topA=="a"){
            strA();
        }else if(topA=="b"){
            strB();
        }else if(topA=="b"){
            strC();
        }
    }

    static void strB(){
        if(b==""){
            System.out.print("B");
            return;
        }
         String topB = b.substring(0,1);
        b=b.substring(1);
        if(topB == "a"){
            strA();
        }else if(topB=="b"){
            strB();
        }else if(topB=="c"){
            strC();
        }
    }

    static void strC(){
        if(c==""){
            System.out.print("C");
            return;
        }
        String topC = c.substring(0,1);
        c=a.substring(1);
        if(topC=="a"){
            strA();
        }else if(topC=="b"){
            strB();
        }else if(topC=="c"){
            strC();
        }
    }
    */
