package main;

public class Triangulo {
	protected int a;
	protected int b;
	protected int c;
	
	public Triangulo(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean esTriangulo () {
		if(a+b>c && b+c>a && a+c>b){
			return true;
		}
		return false;
	}
	public String tipoTriangulo() {
		String tipo=null;
		if(a==b && a==c && b==c) {
			tipo="Equilatero";
		}else if(a==b || b==c || a==c){
			tipo="Isósceles";
		}else{
			tipo="Escaleno";
		}
			
		return tipo;
	}
}

