package Empresa_e_Sistema;

public class Sistema 
{
	public static void main (String args[])
	{
		Funcionario a = new Funcionario("João", "123.456.789-24", 100.0);
		Funcionario b = new Funcionario("André", "321.654.987-42", 200.0);
		Funcionario c = new Funcionario("Maria", "156.438.196-43", 300.0);
		Funcionario d = new Funcionario("Angela", "985.674.136-75", 400.0);
		Funcionario e = new Funcionario("Gabriel", "584.375.774-64", 500.0);
		Gerente f = new Gerente("Fabricio", "trem", "865.653.574-51", 600.0);
		
		Empresa Samsung = new Empresa(a, b, c, d, e, f);
		
		System.out.println("Gerente: \n" + Samsung.printGerente() +"Funcionario 1: \n" + 
				Samsung.printFuncionario(0) + "Funcionário 2: \n" + Samsung.printFuncionario(1) + 
				"Funcionario 3: \n" + Samsung.printFuncionario(2) + "Funcionario 4: \n" + 
				Samsung.printFuncionario(3) + "Funcionario 5: \n" + Samsung.printFuncionario(4));	
	}
}
