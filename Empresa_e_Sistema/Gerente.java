package Empresa_e_Sistema;

public class Gerente 
{
	String nome;
	String cpf;
	String senha;
	double salario;
	
	public Gerente (){}
	public Gerente(String nome, String senha, String cpf, double salario)
	{
		setNome(nome);
		setCpf(cpf);
		setSenha(senha);
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
	
	
	private void setSenha(String senha)
	{
		if (senha.length() > 3)
		{
			this.senha = senha;
		}
	}
	
	public String getSenha()
		{return this.senha;}
	
	
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
