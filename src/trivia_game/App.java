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
						System.out.println("1-Animais\n"+"2-Matemática\n"+"3-Filmes\n"+"4-Futebol");
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
										+ "c)Detritívoro.\n"
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
								System.out.println("Vale 5 pontos"); 
								System.out.println("1-Qual estúdio de cinema é mundialmente famoso por seus filmes de animação, "
										+ "como O Rei Leão e Frozen, e por ter o Mickey Mouse como seu mascote?\n"); 
								System.out.print("a)Universal Pictures.\n"
										+ "b)Warner Bros.\n"
										+ "c)Paramount Pictures.\n"
										+ "d)Walt Disney Pictures.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question11= sc.next().charAt(0);
								
								switch(question11) {
								case 'd':
									pontuation += 5;
									break;
								default:
									break;
								}
								System.out.println("Vale 10 pontos"); 
								System.out.println("2-Qual famoso ator interpretou Jack Dawson, o protagonista que se apaixona por Rose a bordo do navio, "
										+ "no filme Titanic (1997)?\n"); 
								System.out.print("a)Leonardo DiCaprio.\n"
										+ "b)Tom Cruise.\n"
										+ "c)Christian Bale.\n"
										+ "d)Brad Pitt.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question12 = sc.next().charAt(0);
								
								switch(question12) {
								case 'a':
									pontuation += 10;
									break;
								default:
									break;
								}
								
								System.out.println("Vale 15 pontos"); 
								System.out.println("3-Na trilogia de ficção científica Matrix, o protagonista Neo (Keanu Reeves) precisa escolher entre qual par de pílulas "
										+ "oferecido por Morpheus para descobrir a verdade sobre a realidade?\n"); 
								System.out.print("a)Branca e Preta.\n"
										+ "b)Dourada e Prateada.\n"
										+ "c)Azul e Vermelha.\n"
										+ "d)Amarela e Verde.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question13 = sc.next().charAt(0);
								
								switch(question13) {
								case 'c':
									pontuation += 15;
									break;
								default:
									break;
								}
								System.out.println("Vale 25 pontos"); 
								System.out.println("4-Qual é o nome oficial do prêmio mais prestigiado, concedido anualmente ao melhor filme "
										+ "em competição no Festival de Cinema de Cannes, na França?\n"); 
								System.out.print("a)Leão de Ouro.\n"
										+ "b)Palma de Ouro (Palme d'Or).\n"
										+ "c)Urso de Ouro.\n"
										+ "d)Grande Prêmio do Júri.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question14 = sc.next().charAt(0);
								
								switch(question14) {
								case 'b':
									pontuation += 25;
									break;
								default:
									break;
								}
								System.out.println("Vale 45 pontos"); 
								System.out.println("5-Qual filme de 1994, dirigido por Quentin Tarantino, é famoso por sua narrativa não-linear, diálogos marcantes e "
										+ "que apresenta personagens icônicos como Vincent Vega e Jules Winnfield?\n"); 
								System.out.print("a)Pulp Fiction: Tempo de Violência (Pulp Fiction).\n"
										+ "b)Cães de Aluguel (Reservoir Dogs).\n"
										+ "c)Kill Bill.\n"
										+ "d)Bastardos Inglórios (Inglourious Basterds).\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question15= sc.next().charAt(0);
								
								switch(question15) {
								case 'a':
									pontuation += 45;
									break;
								default:
									break;
								}
								break;
								
								
								
								
								
								
//tema Filmes//								
							case '4':
								System.out.println("Vale 5 pontos"); 
								System.out.println("1-Qual cartão o árbitro usa para mostrar que um jogador cometeu uma falta grave "
										+ "e deve ser expulso do jogo imediatamente?\n"); 
								System.out.print("a)Cartão Azul.\n"
										+ "b)Cartão Amarelo.\n"
										+ "c)Cartão Verde.\n"
										+ "d)Cartão Vermelho.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question16= sc.next().charAt(0);
								
								switch(question16) {
								case 'd':
									pontuation += 5;
									break;
								default:
									break;
								}
								System.out.println("Vale 10 pontos"); 
								System.out.println("2-Qual é a entidade máxima que organiza e rege o futebol mundial, incluindo a Copa do Mundo FIFA?\n"); 
								System.out.print("a)CONMEBOL.\n"
										+ "b)FIFA.\n"
										+ "c)UEFA.\n"
										+ "d)CBF.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question17 = sc.next().charAt(0);
								
								switch(question17) {
								case 'b':
									pontuation += 10;
									break;
								default:
									break;
								}
								
								System.out.println("Vale 15 pontos"); 
								System.out.println("3-Qual clube é o maior vencedor da história da Liga dos Campeões da UEFA (UEFA Champions League), "
										+ "o principal torneio de clubes da Europa?\n"); 
								System.out.print("a)AC Milan (Itália).\n"
										+ "b)Real Madrid (Espanha).\n"
										+ "c)Liverpool FC (Inglaterra).\n"
										+ "d)Bayern de Munique (Alemanha).\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question18 = sc.next().charAt(0);
								
								switch(question18) {
								case 'b':
									pontuation += 15;
									break;
								default:
									break;
								}
								System.out.println("Vale 25 pontos"); 
								System.out.println("4-Qual jogador, conhecido pelo apelido 'Fenômeno', foi o artilheiro da Copa do Mundo FIFA de 2002, "
										+ "marcando 8 gols e ajudando o Brasil a conquistar seu quinto título mundial?\n"); 
								System.out.print("a)Miroslav Klose.\n"
										+ "b)Ronaldo Nazário.\n"
										+ "c)Ronaldinho Gaúcho.\n"
										+ "d)Rivaldo.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question19 = sc.next().charAt(0);
								
								switch(question19) {
								case 'b':
									pontuation += 25;
									break;
								default:
									break;
								}
								System.out.println("Vale 45 pontos"); 
								System.out.println("5-O 'impedimento' é uma regra crucial no futebol. "
										+ "Qual das alternativas descreve corretamente a posição de impedimento de um jogador?\n"); 
								System.out.print("a)O jogador está em sua metade do campo (seu próprio lado) no momento do passe.\n"
										+ "b)O jogador está mais próximo da linha de meta adversária do que o goleiro, no momento do passe.\n"
										+ "c)O jogador recebe a bola diretamente de um arremesso lateral ou cobrança de escanteio (corner).\n"
										+ "d)O jogador está mais próximo da linha de meta adversária do que a bola e o penúltimo adversário no momento "
										+ "em que a bola é tocada pelo companheiro.\n\n");
								System.out.print("Digite a alternativa correta?"); 
								char question20= sc.next().charAt(0);
								
								switch(question20) {
								case 'd':
									pontuation += 45;
									break;
								default:
									break;
								}
								break;
								
									}											
						
						
						
						
						
						System.out.println("Parabéns, você chegou ao fim do game, sua pontuação foi: " + pontuation + " pontos"); 
						System.out.print("Deseja jogar novamente? digite 1 para SIM e 2 para NÃO:"); 
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
