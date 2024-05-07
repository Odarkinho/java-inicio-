package sistema;
import javax.swing.JOptionPane;


public class empresa {
 public static void main(String[] args) {
     
     Produto produto = Produto.criarProduto();
     Funcionario funcionario = Funcionario.criarFuncionario();
     Cliente cliente = Cliente.criarCliente();
     Fornecedor fornecedor = Fornecedor.criarFornecedor();

     
     JOptionPane.showMessageDialog(null, "Informações do Produto:\n" + produto.toString());
     JOptionPane.showMessageDialog(null, "Informações do Funcionário:\n" + funcionario.toString());
     JOptionPane.showMessageDialog(null, "Informações do Cliente:\n" + cliente.toString());
     JOptionPane.showMessageDialog(null, "Informações do Fornecedor:\n" + fornecedor.toString());
 }
}


class Produto {
 private String nome;
 private double preco;
 private String categoria;


 public Produto(String nome, double preco, String categoria) {
     this.nome = nome;
     this.preco = preco;
     this.categoria = categoria;
 }


 public static Produto criarProduto() {
     String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
     double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
     String categoria = JOptionPane.showInputDialog("Digite a categoria do produto:");
     return new Produto(nome, preco, categoria);
 }


 public String toString() {
     return "Nome: " + nome + "\nPreço: R$" + preco + "\nCategoria: " + categoria;
 }
}


class Funcionario {
 private String nome;
 private int idade;
 private String cargo;

 
 public Funcionario(String nome, int idade, String cargo) {
     this.nome = nome;
     this.idade = idade;
     this.cargo = cargo;
 }


 public static Funcionario criarFuncionario() {
     String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
     int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário:"));
     String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário:");
     return new Funcionario(nome, idade, cargo);
 }


 public String toString() {
     return "Nome: " + nome + "\nIdade: " + idade + "\nCargo: " + cargo;
 }
}


class Cliente {
 private String nome;
 private String email;
 private String telefone;

 
 public Cliente(String nome, String email, String telefone) {
     this.nome = nome;
     this.email = email;
     this.telefone = telefone;
 }

 
 public static Cliente criarCliente() {
     String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
     String email = JOptionPane.showInputDialog("Digite o email do cliente:");
     String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
     return new Cliente(nome, email, telefone);
 }


 public String toString() {
     return "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone;
 }
}


class Fornecedor {
 private String nome;
 private String email;
 private String endereco;


 public Fornecedor(String nome, String email, String endereco) {
     this.nome = nome;
     this.email = email;
     this.endereco = endereco;
 }


 public static Fornecedor criarFornecedor() {
     String nome = JOptionPane.showInputDialog("Digite o nome do fornecedor:");
     String email = JOptionPane.showInputDialog("Digite o email do fornecedor:");
     String endereco = JOptionPane.showInputDialog("Digite o endereço do fornecedor:");
     return new Fornecedor(nome, email, endereco);
 }


 public String toString() {
     return "Nome: " + nome + "\nEmail: " + email + "\nEndereço: " + endereco;
 }
}
