package Círculo_e_Ponto;

import java.lang.Math;

public class Ponto 
{
	double x;
	double y;
	
	public Ponto() {}
	public Ponto(double x, double y)
	{
		setX(x);
		setY(y);
	}


	public double calcularDistancia (Ponto p1, Ponto p2)
	{
		if (p1 != null && p2 != null)
		{
			double resultado, xf, yf;
		
			//Cálculos
			xf = p2.x - p1.x;
			xf = Math.pow(xf, 2.0);
			
			yf = p2.y - p1.y;
			yf = Math.pow(yf, 2);
		
			resultado = xf + yf;
			resultado = Math.sqrt(resultado);
		
			
			return resultado;
		}
		else
		{
			System.out.println ("É necessário que ambos os pontos estejam definidos");
			return 0.0;
		}
	}
	
//############################################################################################################
	//Métodos get/set
	
	protected void setX (double x)
	{this.x = x;}
		public double getX()
		{return this.x;}
	
	
	protected void setY (double y)
	{this.y = y;}
		public double getY()
		{return this.y;}
}

