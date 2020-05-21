package filas;

public class NoF {
	
	public double info;
	public NoF prox;
	
	public NoF ( double v ){
		info = v;
		prox = null;
	}

	public NoF ( double v, NoF p ){
		info = v;
		prox = p;
	}

}
