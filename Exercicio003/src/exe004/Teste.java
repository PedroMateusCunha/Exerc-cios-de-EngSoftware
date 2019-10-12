package exe004;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		List<Funcionario> administrativo = new ArrayList<>();
		List<Funcionario> empresarial = new ArrayList<>();
		List<Funcionario> executivo = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();

		Funcionario funcionario = new Funcionario("Joao", "200.000.000-22", TipoFuncionario.EXECUTIVO);
		executivo.add(funcionario);
		funcionarios.add(funcionario);

		funcionario = new Funcionario("Jose", "110.111.010-21", TipoFuncionario.EXECUTIVO);
		executivo.add(funcionario);
		funcionarios.add(funcionario);

		funcionario = new Funcionario("Patricia", "222.21.012-22", TipoFuncionario.EMPRESARIAL);
		empresarial.add(funcionario);
		funcionarios.add(funcionario);

		funcionario = new Funcionario("Maria", "330.311.330-33", TipoFuncionario.EMPRESARIAL);
		empresarial.add(funcionario);
		funcionarios.add(funcionario);

		funcionario = new Funcionario("Maria", "434.414.344-34", TipoFuncionario.ADMINISTRATIVO);
		administrativo.add(funcionario);
		funcionarios.add(funcionario);

		funcionario = new Funcionario("Maria", "736.511.550-35", TipoFuncionario.ADMINISTRATIVO);
		administrativo.add(funcionario);
		funcionarios.add(funcionario);
	}
}
