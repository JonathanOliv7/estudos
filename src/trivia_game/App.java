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
		
		
		int attempts = 0;
		
		for(int i = 0; i <= 3; i += attempts) {
			attempts += 1;
			
			
			System.out.print("Digite seu usúario:");
			String user = sc.nextLine();
			System.out.print("Digite sua senha:");
			String key = sc.nextLine();
			
			if(login.equals(user) && password.equals(key)) {
				System.out.println("Login efetuado com sucesso!!!");
				int verification = 0;
					while(verification == 0) {
						
						System.out.println("VAMOS INICIAR O GAME"); 
						System.out.println("Escolha um tema, digite o número correspondente ao tema:");
						System.out.println("1-Animais\n"+"2-Matemática\n"+"3-Geografia\n"+"4-Portugês");
						System.out.print("Digite a opção desejada:"); 
						char teme = sc.next().charAt(0);
						int pontuation = 0;
						switch(teme) {
							case '1':
								System.out.println("Vale 5 pontos"); 
								System.out.println("1-Nível Fácil: Qual classe de vertebrados é a única capaz de voar "
										+ "ativamente e é caracterizada por ter o corpo coberto de penas?"); 
								System.out.print("a)Aves\n"
										+ "b)Mamíferos\n"
										+ "c)répteis\n"
										+ "d)Anfíbios\n");
								System.out.println("Digite a alternativa correta?"); 
								char question1 = sc.next().charAt(0);
								
								switch(question1) {
								case 'a':
									pontuation += 5;
									break;
								default:
									break;
								}
								System.out.println("Vale 10 pontos"); 
								System.out.println("1-Nível Fácil: Qual classe de vertebrados é a única capaz de voar "
										+ "ativamente e é caracterizada por ter o corpo coberto de penas?"); 
								System.out.print("a)Aves\n"
										+ "b)Mamíferos\n"
										+ "c)répteis\n"
										+ "d)Anfíbios\n");
								System.out.println("Digite a alternativa correta?"); 
								char question2 = sc.next().charAt(0);
								
								switch(question2) {
								case 'a':
									pontuation += 10;
									break;
								default:
									break;
								}
								
								
								
								
								
								
								
								
									
								break;
							case '2':	
								System.out.println("deu certo 2"); 
								break;
							case '3':
								System.out.println("deu certo 3"); 
								break;
							case '4':
								System.out.println("deu certo 4"); 
								break;
							default:
								break;
									}											
						
					
						
					}
			}else
				System.out.println("Senha ou usúario inválido.");
		}
		
		sc.close();
	}

}
