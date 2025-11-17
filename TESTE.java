public class TesteHeranca {
    public static void main(String[] args) {

        // 1. Instância de Pessoa
        Pessoa p = new Pessoa("Ana Silva", "111.222.333-44", 30);
        System.out.println("--- Dados da Pessoa ---");
        p.exibirDadosBasicos();

        // 2. Instância de Funcionario
        Funcionario f = new Funcionario("Carlos Gomes", "222.333.444-55", 40, 3500.00, "Analista");
        System.out.println("\n--- Dados do Funcionário ---");
        f.exibirDadosBasicos();
        System.out.println("Salário Anual: " + f.calcularSalarioAnual());

        // 3. Instância de Gerente
        Gerente g = new Gerente("Fernanda Lima", "333.444.555-66", 45, 8000.00, "Gerente de Projetos", "Tecnologia");
        System.out.println("\n--- Dados do Gerente ---");
        g.exibirDadosBasicos();
        System.out.println("Salário Anual: " + g.calcularSalarioAnual());
    }
}
