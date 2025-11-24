package trivia_game;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo ao TRIVIA GAME");
		System.out.print("Vamos criar sua conta, digite seu novo usúario:");
		String login = sc.nextLine();
		System.out.print("Digite sua nova senha:");
		String password = sc.nextLine();
		
		System.out.print("testando variaveis" + password + login);
		
		int attempts = 0;
		
		for(int i = 0; i <= 3; i += attempts) {
			attempts += 1;
			
			
			System.out.print("Digite seu usúario:");
			String user = sc.nextLine();
			System.out.print("Digite sua senha:");
			String key = sc.nextLine();
			
			if(login.equals(user) && password.equals(key)) {
				int verification = 0;
					while(verification != 2) {
						System.out.println("Login efetuado com sucesso!!!");
						System.out.print("VAMOS INICIAR O GAME");
						
					}
			}else
				System.out.print("Senha inválida");
		}
		
	}

}
