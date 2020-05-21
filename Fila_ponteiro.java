package filas;

public class Fila_ponteiro {
	 public NoF ini, fim;
	    public int tam, max;
	  
	    
	    public Fila_ponteiro(){
	    	ini = null;
			fim = null;
			tam = 0;
			max = 1000;
	    }
	    
	    public Fila_ponteiro( int t ){
	    	ini = null;
			fim = null;
			tam = 0;
			max = t;
	    }
	    
	    public int size(){
	        return tam;
	    }
	    
	    public void In(double v) {

			if ( tam == 0 )
			{
				ini = new NoF(v);
				fim = ini;
				tam++;
			}
			else
			{
				NoF novo = new NoF(v);
				fim.prox = novo;
				tam++;
				fim = novo;
			}
	    }
	    public void Out() {
	    	if (tam !=0) {
				double v = ini.info;
				ini = ini.prox;
				tam--;
			}
			else {
				System.out.println("Lista vazia!!");
			}
	    }
	    public String toString () {
	    	NoF aux=ini;
	    	String s = "Lista => [ ";
	    	for (int i=0;i< size(); i++) {
	    		s=s+aux.info + " ";
	    		aux = aux.prox;
	    	}
	    	s=s+" ]";
	    	return s;
	    }
	    public double get() {
	    	if (tam!=0) {
	    		return ini.info;
	    	}
	    	else {
	    		System.out.println("Lista vazia");
	    		return 0;
	    
	    	}
	    }
	    public boolean underflow(){
	    	return size()==0;
	    }
	    
	    public boolean overflow(){
	    	return size()==max;
	    		
	    }
}