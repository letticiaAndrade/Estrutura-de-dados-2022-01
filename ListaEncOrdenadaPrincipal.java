package listaencadeada;

import java.util.Scanner;

public class ListaEncOrdenadaPrincipal {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 ListaEncOrdenada<Integer> lista = new ListaEncOrdenada<Integer>();
		  int op;
		  System.out.println(" QUAL A FORMA DE ORDENAÇÃO? 1 - CRESCENTE// 2 - DECRESCENTE");
		  int opcao = entrada.nextInt();

	        System.out.println("1 – Inserir elemento");
	        System.out.println("2 - Inserir no inicio");
	        System.out.println("3 - Inserir elemento na posição");
	        System.out.println("4 - buscar elemento da posição");
	        System.out.println("5 - buscar posicao do elemento");
	        System.out.println("6 - remover posicao");
	        System.out.println("7 - Limpar lista");
	        System.out.println("8 - Tamanho da lista");
	        System.out.println("9 - Verificar se contém elemento na lista");
	        System.out.println("10 – Mostrar lista");

	        System.out.println("0 - Sair");
		  do {
			  System.out.println("Digite a opção: ");
	            op = entrada.nextInt();
	            try {

	                switch (op) {
	                    case 1: {
	                    	if (opcao == 1) {
	                    		
	                        System.out.print("Digite um numero: ");
	                        Integer dados = entrada.nextInt();
	                        lista.incluir(dados);
	                        lista.setOrdenacao(true);
	                    	} else 
	                    		if (opcao == 2) {
	                    			
		                        System.out.print("Digite um numero: ");
		                        Integer dados = entrada.nextInt();
		                        lista.incluir(dados);
		                        lista.setOrdenacao(false);
	                    	}
	                        break;
	                    }
	                    case 2: {
	                    	if (opcao == 1) {
	                        System.out.println("Digite um numero: ");
	                        Integer dados = entrada.nextInt();
	                        lista.incluirInicio(dados);
	                        lista.setOrdenacao(true);
	                    	}else {
		                        System.out.println("Digite um numero: ");
		                        Integer dados = entrada.nextInt();
		                        lista.incluirInicio(dados);
		                        lista.setOrdenacao(false);
	                    	}
	                        break;
	                    }
	                    case 3: {
	                    	if (opcao == 1) {
	                        System.out.print("Informe o elemento");
	                        Integer dados = entrada.nextInt();
	                        System.out.print("Informe a posição");
	                        int posicao = entrada.nextInt();
	                        lista.incluir(dados, posicao);
	                        lista.setOrdenacao(true);
	                    	}else {
		                        System.out.print("Informe o elemento");
		                        Integer dados = entrada.nextInt();
		                        System.out.print("Informe a posição");
		                        int posicao = entrada.nextInt();
		                        lista.incluir(dados, posicao);
		                        lista.setOrdenacao(false);
	                    	}
	                        break;
	                    }
	                    case 4: {
	                        System.out.print("Informa a posição que deseja :");
	                        int posicao = entrada.nextInt();
	                        lista.get(posicao);
	                        break;
	                    }
	                    case 5: {
	                        System.out.print("Informa o elemento que deseja :");
	                        Integer dados = entrada.nextInt();
	                        lista.getPosElemento(dados);
	                        break;
	                    }
	                    case 6: {
	                    	System.out.println("Informe a posição que deseja eleminar: ");
	                        int posicao = entrada.nextInt();
	                        lista.remover(posicao);
	                        break;
	                    }
	                    case 7: {
	                        lista.limpar();
	                        break;
	                    }
	                    case 8: {
	                        System.out.println("Tamanho: " + lista.getTamanho());
	                        break;
	                    }
	                    case 9: {
	                        System.out.print("Informa o elemento que deseja procurar :");
	                        Integer dados = entrada.nextInt();
	                        lista.contem(dados);
	                        break;
	                    }
	                    case 10: {
	
	                    		System.out.println(lista.toString());
	         


	                        break;
	                    }
	                    default:
	                        System.out.println("Opçao inválida!");
	                }


	            } catch (Exception erro){
	                System.out.println(erro.getMessage());
	            }
	        } while (op != 0);

	        entrada.close();
	    }

	       

	    
	    
	}
