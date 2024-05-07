package sistema;

import javax.swing.JOptionPane;

public class faculdade {
 public static void main(String[] args) {
     
     Aluno aluno = Aluno.criarAluno();
     Professor professor = Professor.criarProfessor();
     Disciplina disciplina = Disciplina.criarDisciplina();
     Funcionario funcionario = Funcionario.criarFuncionario();

     
     JOptionPane.showMessageDialog(null, "Informações do Aluno:\n" + aluno.toString());
     JOptionPane.showMessageDialog(null, "Informações do Professor:\n" + professor.toString());
     JOptionPane.showMessageDialog(null, "Informações da Disciplina:\n" + disciplina.toString());
     JOptionPane.showMessageDialog(null, "Informações do Funcionário:\n" + funcionario.toString());
 }
}


class Aluno {
 private String nome;
 private String matricula;
 private String curso;


 public Aluno(String nome, String matricula, String curso) {
     this.nome = nome;
     this.matricula = matricula;
     this.curso = curso;
 }


 public static Aluno criarAluno() {
     String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
     String matricula = JOptionPane.showInputDialog("Digite a matrícula do aluno:");
     String curso = JOptionPane.showInputDialog("Digite o curso do aluno:");
     return new Aluno(nome, matricula, curso);
 }


 public String toString() {
     return "Nome: " + nome + "\nMatrícula: " + matricula + "\nCurso: " + curso;
 }
}



class Professor {
 private String nome;
 private String departamento;
 private int cargaHoraria;

 
 public Professor(String nome, String departamento, int cargaHoraria) {
     this.nome = nome;
     this.departamento = departamento;
     this.cargaHoraria = cargaHoraria;
 }


 public static Professor criarProfessor() {
     String nome = JOptionPane.showInputDialog("Digite o nome do professor:");
     String departamento = JOptionPane.showInputDialog("Digite o departamento do professor:");
     int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária do professor:"));
     return new Professor(nome, departamento, cargaHoraria);
 }

 
 public String toString() {
     return "Nome: " + nome + "\nDepartamento: " + departamento + "\nCarga Horária: " + cargaHoraria;
 }
}


class Disciplina {
 private String nome;
 private String codigo;
 private int creditos;


 public Disciplina(String nome, String codigo, int creditos) {
     this.nome = nome;
     this.codigo = codigo;
     this.creditos = creditos;
 }

 
 public static Disciplina criarDisciplina() {
     String nome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
     String codigo = JOptionPane.showInputDialog("Digite o código da disciplina:");
     int creditos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de créditos da disciplina:"));
     return new Disciplina(nome, codigo, creditos);
 }

 
 public String toString() {
     return "Nome: " + nome + "\nCódigo: " + codigo + "\nCréditos: " + creditos;
 }
}


class Funcionariox {
 private String nome;
 private String cargo;
 private double salario;


 public Funcionariox(String nome, String cargo, double salario) {
     this.nome = nome;
     this.cargo = cargo;
     this.salario = salario;
 }


 public static Funcionariox criarFuncionario() {
     String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
     String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário:");
     double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
     return new Funcionariox(nome, cargo, salario);
 }


 public String toString() {
     return "Nome: " + nome + "\nCargo: " + cargo + "\nSalário: R$" + salario;
 }
}

