package listaencadeada;

public class No<T> implements Comparable <No <T>> {

	    public No<T> prox;
	    public No<T> ant;
		public T dado;
		
		

		public No(T dado) {
			this.dado = dado;
		}

		public No(Object object, T elemento) {

		}

		public No<T> getProx() {
			return prox;
		}

		public void setProx(No<T> prox) {
			this.prox = prox;
		}

		public No<T> getAnt() {
			return ant;
		}

		public void setAnt(No<T> ant) {
			this.ant = ant;
		}
		

		public T getDado() {
			return dado;
		}

		public void setDado(T dado) {
			this.dado = dado;
		}


		@Override
	    public String toString() {
	        return "dado=" + dado;
	    }



		public int compareTo(No<T> dados) {
			return 0;
		}
}


		