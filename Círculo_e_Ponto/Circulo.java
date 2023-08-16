package Círculo_e_Ponto;
//import Círculo_e_Ponto.Ponto;

public class Circulo 
{
	Ponto p;
	int raio;
	
	public Circulo() {}
	public Circulo(Ponto p, int raio)
	{
		setP(p);
		setRaio(raio);
	}
	
	public double calcularCircunferência(int raio)
	{
		double resultado = 2 * raio * 3.14159;
		
		return resultado;
	}
	
//############################################################################################################
	//Métodos get/set
	
	private void setRaio(int raio)
	{
		if (raio >= 0)
		{
			this.raio = raio;
		}
	}
	public int getRaio ()
	{return this.raio;}
	
	private void setP(Ponto p)
	{
		this.p = p;
	}
	public Ponto getP()
	{return p;}
}
