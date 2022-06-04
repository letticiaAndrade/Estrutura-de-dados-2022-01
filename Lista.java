
package listaencadeada;


public abstract class Lista<T>  {

    public No<T> inicio;
    public No<T> fim;
	public No<T> aux;
    public int qtd;

    public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

	public No<T> getFim() {
		return fim;
	}

	public void setFim(No<T> fim) {
		this.fim = fim;
	}

	public No<T> getAux() {
		return aux;
	}

	public void setAux(No<T> aux) {
		this.aux = aux;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	

	public Lista() {
		
	}

	/**
     * Adiciona um elemento no final da lista
     * O(1)
     * @param elemento
     * @throws Exception
     */
    public abstract void incluir(T elemento) throws Exception;

    /**
     * Adiciona um elemento no in�cio da lista
     * O(n)
     * @param elemento
     * @throws Exception
     */
    public abstract void incluirInicio(T elemento) throws Exception;

    /**
     * Adiciona um elemento em uma posi��o espec�fica da lista
     * O(n)
     * @param elemento
     * @param posicao
     * @throws Exception
     */
    public abstract void incluir(T elemento, int posicao) throws Exception;

    /**
     * Retorna o elemento que est� na posi��o
     * O(1)
     * @param posicao
     * @return
     * @throws Exception
     */
    public abstract T get(int posicao)  throws Exception;

    /**
     * Retorna a posi��o do elemento
     * O(n)
     * @param elemento
     * @return
     * @throws Exception
     */
    public abstract int getPosElemento(T elemento)  throws Exception;

    /**
     * Remove o elemento da posi��o
     * O(n)
     * @param posicao
     * @throws Exception
     */
    public abstract void remover(int posicao) throws Exception;

    /**
     * Remove todos os elementos da lista.
     * O(1)
     */
    public abstract void limpar();

    /**
     * Retorna a quantidade de elementos na lista
     * O(1)
     * @return
     */
    public abstract int getTamanho();

    /**
     * Indica se cont�m ou n�o o elemento na lista
     * O(n)
     * @param elemento
     * @return
     * @throws Exception
     */
    public abstract boolean contem(T elemento) throws Exception;
}

