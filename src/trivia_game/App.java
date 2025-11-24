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
					while(verification != 2) {
						
						System.out.println("VAMOS INICIAR O GAME"); 
						System.out.println("Escolha um tema, digite o número correspondente ao tema:");
						System.out.println("1-Animais\n"+"2-Matemática\n"+"3-Geografia\n"+"4-Portugês");
						System.out.print("Digite a opção desejada:"); 
						char teme = sc.next().charAt(0);
						int pontuation = 0;
						switch(teme) {
							case '1':
								System.out.println("Vale 5 pontos"); 
								System.out.println("1-Qual classe de vertebrados é a única capaz de voar "
										+ "ativamente e é caracterizada por ter o corpo coberto de penas?\n"); 
								System.out.print("a)Aves.\n"
										+ "b)Mamíferos.\n"
										+ "c)Répteis.\n"
										+ "d)Anfíbios.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question1 = sc.next().charAt(0);
								
								switch(question1) {
								case 'a':
									pontuation += 5;
									break;
								default:
									break;
								}
								System.out.println("Vale 10 pontos"); 
								System.out.println("2-Qual é a classificação dietética do animal "
										+ "que se alimenta exclusivamente de plantas, vegetais e frutas?\n"); 
								System.out.print("a)Carnívoro.\n"
										+ "b)Herbívoro.\n"
										+ "c)Detritívoro.n"
										+ "d)Omnivoro.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question2 = sc.next().charAt(0);
								
								switch(question2) {
//Tema Biologia//								
								case 'b':
									pontuation += 10;
									break;
								default:
									break;
								}
								
								System.out.println("Vale 15 pontos"); 
								System.out.println("3-O ornitorrinco é um animal único que, apesar de ser um mamífero, "
										+ "não dá à luz a filhotes vivos. Em vez disso, ele faz o quê?\n"); 
								System.out.print("a)Põe ovos.\n"
										+ "b)Faz a gestação em uma bolsa (marsúpio).\n"
										+ "c)Gera filhotes por brotamento.\n"
										+ "d)Passa por metamorfose completa.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question3 = sc.next().charAt(0);
								
								switch(question3) {
								case 'a':
									pontuation += 15;
									break;
								default:
									break;
								}
								System.out.println("Vale 25 pontos"); 
								System.out.println("4-Qual dos seguintes animais é classificado como ectotérmico, "
										+ "o que significa que sua temperatura corporal é regulada principalmente pelo ambiente externo?\n"); 
								System.out.print("a)Urso-pardo.\n"
										+ "b)Morcego.\n"
										+ "c)Cobra-real.\n"
										+ "d)Pinguim-imperador.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question4 = sc.next().charAt(0);
								
								switch(question4) {
								case 'c':
									pontuation += 25;
									break;
								default:
									break;
								}
								System.out.println("Vale 45 pontos"); 
								System.out.println("5-Qual é a função primária da linha lateral, "
										+ "um órgão sensorial encontrado em peixes e larvas de anfíbios??\n"); 
								System.out.print("a)Regulação da flutuabilidade e profundidade na coluna d'água.\n"
										+ "b)Detecção de campos elétricos para caça.\n"
										+ "c)Captação de luz ultravioleta para navegação.\n"
										+ "d)Percepção de movimento e vibrações da água.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question5 = sc.next().charAt(0);
								
								switch(question5) {
								case 'd':
									pontuation += 45;
									break;
								default:
									break;
								}
								
								break;
							
//Tema matemática//								
							case '2':	
								System.out.println("Vale 5 pontos"); 
								System.out.println("1-Qual é o resultado da seguinte operação: 8 x 4 + 10?\n"); 
								System.out.print("a)72\n"
										+ "b)42\n"
										+ "c)18\n"
										+ "d)34\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question6= sc.next().charAt(0);
								
								switch(question6) {
								case 'b':
									pontuation += 5;
									break;
								default:
									break;
								}
								System.out.println("Vale 10 pontos"); 
								System.out.println("2-Se um produto custa R$ 80,00 e você recebe um desconto de 25% no preço total, "
										+ "qual é o valor final que você pagará?\n"); 
								System.out.print("a)R$ 60,00\n"
										+ "b)R$ 75,00\n"
										+ "c)R$ 55,00\n"
										+ "d)R$ 65,00\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question7 = sc.next().charAt(0);
								
								switch(question7) {
								case 'a':
									pontuation += 10;
									break;
								default:
									break;
								}
								
								System.out.println("Vale 15 pontos"); 
								System.out.println("3-A área de um quadrado é de 49cm\u00B2. Qual é o perímetro desse quadrado?\n"); 
								System.out.print("a)14 cm.\n"
										+ "b)7 cm.\n"
										+ "c)28 cm.\n"
										+ "d)49 cm.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question8 = sc.next().charAt(0);
								
								switch(question8) {
								case 'c':
									pontuation += 15;
									break;
								default:
									break;
								}
								System.out.println("Vale 25 pontos"); 
								System.out.println("4-Qual é o valor de x na equação: 3x - 7 = 14?\n"); 
								System.out.print("a)x = 1/3\n"
										+ "b)x = 7\n"
										+ "c)x = 21\n"
										+ "d)x = 5\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question9 = sc.next().charAt(0);
								
								switch(question9) {
								case 'b':
									pontuation += 25;
									break;
								default:
									break;
								}
								System.out.println("Vale 45 pontos"); 
								System.out.println("5-No triângulo retângulo, se a hipotenusa mede 10 e um dos catetos mede 6, qual é a medida do outro cateto?\n"); 
								System.out.print("a)8\n"
										+ "b)4\n"
										+ "c)16\n"
										+ "d)12\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question10= sc.next().charAt(0);
								
								switch(question10) {
								case 'a':
									pontuation += 45;
									break;
								default:
									break;
								}
								break;
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
//Tema Futebol//								
							case '3':
								System.out.println("deu certo 3"); 
								break;
//tema Filmes//								
							case '4':
								System.out.println("deu certo 4"); 
								break;
							default:
								break;
									}											
						
						
						
						
						
						System.out.println("Parabéns, você chegou ao fim do game, sua pontuação foi: " + pontuation + " pontos"); 
						System.out.print("Deseja jogar novamente? digite 1 para SIM e 2 para NÃO"); 
						int verification2 = sc.nextInt();
						
						switch(verification2) {
						case 2:
							verification = 2;
							attempts = 4;
							default:
							pontuation = 0;	
						}
					}
			}else
				System.out.println("Senha ou usúario inválido.");
		}
		System.out.println("Muito obrigado por jogar!!!");
		sc.close();
	}

}
