import java.util.*;
public class Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k=5;
		while(k>0)
		{	System.out.println("Veuillez Saisir une entier");
			int apk = sc.nextInt();
			if(apk<0)
				System.out.println(apk+" est un entier négative");
			else
				System.out.println(apk+" est un entier positive");
			k--; 
		}

	}

}
