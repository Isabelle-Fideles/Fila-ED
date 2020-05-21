package filas;

public class Fila_vetor {
	int []f;
	int ini, livre, max, qntd;
	 public Fila_vetor(){
	    	ini = 0;
	    	qntd=0;
			max = 1000;
			livre=0;
			f=new int[max];
	    }
	    
	    public Fila_vetor( int t ){
	    	ini = 0;
	    	qntd=0;
			max = t;
			livre=0;
			f=new int[max];
	    }
	    
	    public int size(){
	        return livre;
	    }
	    
	    public void In(int v) {
	    	if (livre < max) {
				f[livre] = v;
				livre++;
				qntd++;
			}
	    /*	else
	    	if (ini==livre) {
	    		int j=0;
				f[j]=v;
				j++;
			}*/
	    	else
				System.out.println("Lista cheia!!!");
			} 
		
	    public void Out() {
	    	
			if ( livre != 0 ) {
				ini++;
				livre--;
				

			} else {
				System.out.println("Lista vazia !!!");
				
			}
			
	    }
	    public String toString () {
	    	String s ="Lista => [ ";
			for (int i = ini; i < qntd; i++) {
				s=s+f[i]+ " ";
			}
			s=s+"]";
			return s;
	    }
	    
	    public double get() {
	    	if (livre!=0) {
	    		return ini;
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
