import java.util.*;
public class TpOpenClassRoom {

	public static void main(String[] args) {
			int num;
			char choix='O';
		Scanner sc = new Scanner(System.in);
		System.out.println("Convertisser Degr�s Celsius - Degr�s Fahrenheit");
		System.out.println("---------------------------------------------");
		//while(choix=='O')
		do{
		System.out.println("Choisissez le Mode de Conversion");
		System.out.println("1 : Convertisser Celsius - Fahrenheit");
		System.out.println("2 : Convertisser Fahrenheit - Celsius");
		num=sc.nextInt();
		//
		if (num==1)
			{
				System.out.println("Temp�rature � Convertir");
				//sc.nextFloat();
				float tem =sc.nextFloat();
				float con=((9*tem)/5)+32;
				System.out.println(tem+" �C Correspond � : "+con+" �F");
			}
		else
			{
				System.out.println("Temp�rature � Convertir");
				//sc.nextFloat();
				float tem =sc.nextFloat();
				float con=((tem-32)*5)/9f;
				System.out.println(tem+" �F Correspond � : "+con+" �C");
			}
		
		System.out.println("Souhaitez vous convertir une autre temp�rature ? (O/N)");
		sc.nextLine();
		choix = sc.nextLine().charAt(0);
		while (choix !='O' && choix !='N') 
			{
			System.out.println("Souhaitez vous convertir une autre temp�rature ? (O/N)");
			choix = sc.nextLine().charAt(0);
			}		

		} while (choix=='O');
		
			System.out.println("Au revoir !");
			
	}

}
