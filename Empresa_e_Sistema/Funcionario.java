package Empresa_e_Sistema;

public class Funcionario 
{
	String nome;
	String cpf;
	double salario;
	
	public Funcionario (){}
	public Funcionario (String nome, String cpf, double salario)
	{
		setNome(nome);
		//setCargo(cargo);
		setCpf(cpf);
		setSalario(salario);
	}
	
//############################################################################################################
	//Métodos get/set
	
	private void setNome(String nome)
	{
		if (nome != null && nome != "")
		{
			this.nome = nome;
    	}
		else
    	{
			System.out.println("Nome inválido, deve conter caractere");
    	}
	}

	public String getNome()
		{return this.nome;}
	
	
	
/*	private void setCargo (String cargo)
	{
		if (cargo != null && cargo != "")
		{
			this.cargo = cargo;
		}
		else
		{
			System.out.println("Cargo inválido, deve conter um caractere");
		}
	}
	
	public String getCargo() 
	{return this.cargo;} */
	
	
	
	private void setCpf(String cpf)
	{
		if ((cpf.length() == 14 || cpf.length() == 11) && (cpf != null && cpf != ""))
		{
			this.cpf = cpf;
		}
		else
		{
			System.out.println ("Valor de Cpf Inválido");
		}
	}
	
	public String getCpf()
		{return this.cpf;}
	
	
	
	private void setSalario(double salario)
	{
		if (salario > 0)
		{
			this.salario = salario;
		}
		else
		{
			System.out.println("Insira um valor válido para o salário, por favor");
		}
	}
	
	public double getSalario()
	{return this.salario;}
}
