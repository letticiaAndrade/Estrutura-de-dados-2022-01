package listaencadeada;





public class ListaEncOrdenada <T extends Comparable <T>> extends ListaEnc<T>{

    public String toString(){
        No<T> temp = inicio;
        String resposta = "";
        while (temp!=null){
        	
            resposta += temp.getDado() + " ";
            temp = temp.getProx();
        }
        return resposta;
    }
    public ListaEncOrdenada() {
        inicio = null;
        this.fim = null;
        qtd = 0;
    }
    public void setOrdenacao(boolean crescente) throws Exception{
    	No <T> i;
    	if (crescente == true) {
    		if (inicio != null) {
        		for ( i =  inicio; i.prox!= null; i = i.prox) {
        			No<T> menor = i;
        			for ( No <T> j = i.prox; j != null; j= j.prox) {
        				if ( j.dado.compareTo(menor.dado) < 0) {
        					menor = j;
        				}
        				T aux = i.dado;
        				i.dado = menor.dado;
        				menor.dado = aux;
        			}
        		}
        	}
    	} else
    	 if (crescente == false) {
    		if (inicio != null) {
        		for (i =inicio; i.prox != null; i = i.prox) {
        			No <T> maior = i;
        			for (No <T> j = i.prox; j!= null; j = j.prox) {
        				if (j.dado.compareTo(maior.dado) > 0) {
        					maior = j;
        				}
        				T aux = i.dado;
        				i.dado = maior.dado;
        				maior.dado = aux;
        			}
        			
        		}
    		}
    	}
    }
	@Override
    public void incluir(T elemento) throws Exception {
		
		No <T> novo = new No <T> (elemento);
		novo.dado = elemento;
		if (getInicio() == null) {
			inicio = novo;

		} else {
			fim.prox = novo;
		} 
		fim = novo; 
		this.qtd++;
		System.out.println("Incluído no final com sucesso.");

		


}
	


    @Override
    public void  incluirInicio(T elemento) throws Exception {
    	
    	No <T> novo = new No <T> (elemento);
		novo.dado = elemento;
		if (getInicio() == null) {
            inicio = novo;
            fim = novo;
            novo.prox = null;
    		this.qtd++;
		} else {
				
			
            novo.prox = inicio;
            inicio = novo;
    		this.qtd++;
		}
		System.out.println("Incluído no ínicio com sucesso");
		
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
    	No <T> novo = new No <T> (elemento);
		novo.dado = elemento;
		No<T> aux = this.inicio;
		posicao = 1;
	     if ( posicao > qtd || posicao < 0){
	            throw new Exception("Impossível fazer a operação.");
	        } 

		if (posicao == this.qtd) {
			this.incluir(elemento);

		} else 
			if (posicao == 1) {
				this.incluirInicio(elemento);
		}  else {
			for ( int i = 1; i < posicao ; i++) {
				aux = aux.getProx();
			}
			novo.setProx(aux.getProx());
			aux.setProx(novo);
			aux = novo;
			
			}
		this.qtd++;
        
    }
    @Override
    public T get(int posicao) throws Exception {
		No <T> aux = inicio;
		int i = 1;
		while (i <= posicao-1 && aux.getProx() != null) {
			aux = aux.getProx();
			i++;
		}
			if (i == posicao) {
				System.out.println(aux);
				return aux.dado;
			} else {
				 return null;
			}
    	}

    @Override
    public int getPosElemento(T elemento) throws Exception {
    	No <T> novo= inicio;
    	int i = 1;
    	while (novo!=null) {
    		if (novo.dado.equals(elemento)) {
    			return i;
    		} else {
    			novo= novo.prox;
    		}

    		i++;
    		System.out.println(i);
    		return i;
    	}
		System.out.println(i);
    	throw new Exception("Não é possível realizar processo!");
    	
    }

    @Override
    public void remover(int posicao) throws Exception {


		if (posicao <1 || posicao >=qtd) {
			throw new Exception ("POsicao não existe.");
		
		} 
		No <T> noAnteriorRemocao =inicio;
		for (int i= 1;i< posicao - 1;i++) {
			noAnteriorRemocao= noAnteriorRemocao.getProx();
		}
		No <T> noRemovido = noAnteriorRemocao.getProx();
		if (posicao == 1) {
			noRemovido = inicio;
			inicio=noRemovido.getProx();
		} else {
			noAnteriorRemocao.setProx(noRemovido.getProx());
			noRemovido.setProx(null);
		}
		qtd--;
    }
    

    @Override
    public void limpar() {
    	inicio = fim = null;
    	qtd = 0;

    }

    @Override
    public int getTamanho() {
		return this.qtd;
    } 

    @Override
    public boolean contem(T elemento) throws Exception {

    	No<T> aux = this.inicio;
    	while (aux != null) {
    		if (aux.getDado().equals(elemento)) {
    			System.out.println("Contém");
    			return true;
    			
    		}
    		aux = aux.getProx();
    	}
        throw new Exception("Não implementado");
    }

}

