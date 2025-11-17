public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String cpf, int idade, double salario, String cargo, String departamento) {
        super(nome, cpf, idade, salario, cargo); // chamando o construtor de Funcionario
        this.departamento = departamento;
    }

    @Override
    public void exibirDadosBasicos() {
        super.exibirDadosBasicos(); // chamando método da superclasse (Pessoa)
        System.out.println("Cargo: " + getCargo());
        System.out.println("Departamento: " + departamento);
    }
}
