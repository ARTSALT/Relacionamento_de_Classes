package Empresa_e_Sistema;

public class Empresa
{
	private Funcionario f[] = new Funcionario[5]; 
	private Gerente g;
	
	public Empresa(){}
	public Empresa(Funcionario f1, Funcionario f2, Funcionario f3, Funcionario f4, Funcionario f5, Gerente g)
	{
		this.f[0] = f1;
		this.f[1] = f2;
		this.f[2] = f3;
		this.f[3] = f4;
		this.f[4] = f5;
		this.g = g;
	}
	
	public String printFuncionario (int num)
	{
		return (" Nome: " + f[num].getNome() + "\n Cpf: " + f[num].getCpf() + "\n Salário: " + 
				f[num].getSalario() + "\n\n");
	}
	
	public String printGerente()
	{
		return (" Nome: " + g.getNome() + "\n Senha: " + g.getSenha() + "\n Cpf: " + g.getCpf() + 
				"\n Salário: " + g.getSalario() + "\n\n");
	}
}
