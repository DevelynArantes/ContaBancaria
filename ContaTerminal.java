import java.util.Locale;
import java.util.Scanner;
class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int conta;
		String agencia;
		String  nome = " ";
		String segundoNome = "";
		String nomeCompleto;
		double saldo;
		
		
		
		System.out.println ("Por favor digite o seu nome: ");
		nome = sc.nextLine();
		
		System.out.println ("Por favor digite o seu sobrenome: ");
		segundoNome = sc.nextLine();
		
		nomeCompleto = nome + " " + segundoNome;
		
		System.out.println("Por favor digite o nome da ag�ncia:  ");
		agencia = sc.nextLine();
	
		System.out.println("Por favor digite o n�mero da sua conta:  ");
		conta = sc.nextInt();
		
		
		System.out.println("Por favor digite o saldo que deseja realizar: ");
		saldo = sc.nextDouble();
		
		System.out.printf("Ol� " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia + " , sua conta � " + conta +  " e seu saldo " + saldo + " esta dispon�vel para o saque!");
		
		
		sc.close();

	}

}
