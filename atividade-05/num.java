import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner (System.in);
		System.out.println("Escolha um numero inteiro");
		int inteiro = sc.nextInt();
		
		if (inteiro < 0) {
			System.out.println("Seu numero e negativo");
		}else {
			System.out.println("Seu numero é positivo");
			
			sc.close();
			
		}
		
			

	}

}

	
