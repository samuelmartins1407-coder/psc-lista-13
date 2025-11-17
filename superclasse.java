public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void exibirDadosBasicos() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
       
        Pessoa pessoa1 = new Pessoa("Alice", "123.456.789-00", 30);

        
        pessoa1.exibirDadosBasicos();

        System.out.println("\n--- Outra Pessoa ---");
        Pessoa pessoa2 = new Pessoa("Bob", "987.654.321-11", 25);
        pessoa2.exibirDadosBasicos();
    }
}
