package listaencadeada;

import listaencadeada.Lista;

public class ListaEnc<T> extends Lista<T> {


    public ListaEnc(){

    }

	@Override
    public void incluir(T elemento) throws Exception {
        throw new Exception("N�o implementado");
    }


    public T get(int posicao)  throws Exception {
        throw new Exception("Posi��o solicitada n�o existe na lista");
    }


    public int getPosElemento(T elemento)  throws Exception {
        throw new Exception("Elemento n�o localizado");
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        throw new Exception("N�o implementado");
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        throw new Exception("N�o implementado");
    }

    @Override
    public void remover(int posicao) throws Exception {
        throw new Exception("N�o implementado");
    }

    @Override
    public int getTamanho() {
		return qtd;
    }

    public void limpar() {
    }



    @Override
    public boolean contem(T elemento) throws Exception {
        throw new Exception("N�o implementado");
    }

}
