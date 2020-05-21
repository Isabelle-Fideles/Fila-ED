package filas;
public class Teste_fila {
	public static void main (String[]args) {
		Fila_vetor f = new Fila_vetor();
		f.In(59);
		f.In(9);
		f.In(349);
		f.In(21);
		f.In(34);

		System.out.println(f);
		System.out.println("Tamanho = "+f.size());
		f.Out();
		System.out.println(f);
		System.out.println("Tamanho = "+f.size());
		
		System.out.println();
		
		Fila_ponteiro p = new Fila_ponteiro();
		p.In(59);
		p.In(9);
		p.In(349);
		p.In(21);
		p.In(34);

		System.out.println(p);
		System.out.println("Tamanho = "+p.size());
		p.Out();
		System.out.println(p);
		System.out.println("Tamanho = "+p.size());
	}
}
