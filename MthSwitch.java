import java.util.Scanner;

public class MthSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez Saisir une entier");
		int apk = sc.nextInt();
		switch (apk)
		{ 
		  case 10:
		    System.out.println("Moyen");
		    
		    break;     
		  case 5:
			    System.out.println("faible");
			 break;
		
		  default:
			  System.out.println("Assez Bien");;

	}
	}

}
