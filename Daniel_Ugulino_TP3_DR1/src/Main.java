import domain.Aluno;
import domain.Pessoa;
import domain.Professor;
import exceptions.NameExceptions;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Pessoa[] Lista;
    private static final int size = 100;

    public static void main(String[] args) {

        String opcao = "0";
        Scanner in = new Scanner(System.in);
        int pos = 0;
        Lista = new Pessoa[size];

        String nome;
        Integer idade;

        do{
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Cadastrar professor");
            System.out.println("[3] Consultar situação de um docente/discente.");
            System.out.println("[4] Sair");

            System.out.print("Informe a opção desejada: ");
            opcao = in.next();

            switch (opcao) {
                case "1":
                    try {
                        System.out.print("Insira o nome do Aluno: ");
                        nome = in.next();

                        System.out.print("Insira a idade do Aluno: ");
                        idade = in.nextInt();

                        System.out.print("Insira o Periodo do Aluno: ");
                        String periodo = in.next();

                        System.out.print("Insira a primeira nota do Aluno: ");
                        Integer nota1 = in.nextInt();

                        System.out.print("Insira a Segunda nota do Aluno: ");
                        Integer nota2 = in.nextInt();


                        Lista[pos] = new Pessoa();

                        Aluno cadAluno = new Aluno(nome, idade);
                        cadAluno.setNota1(nota1);
                        cadAluno.setNota2(nota2);
                        cadAluno.setPeriodo(periodo);
                        cadAluno.setMatricula(pos);
                        cadAluno.getMedia();

                        Lista[pos].setAluno(cadAluno);

                        System.out.print("Aluno Cadastrado\nMatricula numero: " + pos + "\n");

                        pos++;
                    }
                    catch (Exception e){
                        System.out.println("Não foi possivel concluir o cadastro\n");
                        break;
                    }
                    opcao = "0";
                    break;

                case "2":
                    try {

                        System.out.print("Insira o nome do Professor: ");
                        nome = in.next();

                        System.out.print("Insira a idade do Professor: ");
                        idade = in.nextInt();

                        System.out.print("Insira a turma do professor : ");
                        String turma = in.next();

                        System.out.print("Insira o salario do professor: ");
                        Float salario = in.nextFloat();

                        System.out.print("Insira a materia que será lecionada: ");
                        String materia = in.next();

                        Lista[pos] = new Pessoa();

                        Professor cadProf = new Professor(nome,idade);
                        cadProf.setTurma(turma);
                        cadProf.setSalario(salario);
                        cadProf.setMateria(materia);
                        cadProf.setMatricula(pos);

                        Lista[pos].setProfessor(cadProf);

                        System.out.print("Professor Cadastrado\nMatricula numero: " + pos+ "\n");
                        pos++;
                    }
                    catch (Exception e){
                        System.out.println("Não foi possivel concluir o cadastro\n");
                        System.out.println(e.toString());
                    }
                    opcao = "0";

                    break;

                case "3":
                    try {
                        System.out.print("Deseja procurar por Aluno ou Professor: ");
                        String op2 = in.next();
                        System.out.print("Insira a matricula:");
                        int id = in.nextInt();
                        System.out.println(Lista[id].consultarSituacao(op2));
                    }
                    catch (Exception e){
                        System.out.println("Não foi Realizar a pesquisa\n");
                    }

                    opcao = "0";
                    break;

                case "4":
                    System.out.println("Fim do relatorio");
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }
        while (!"4".equalsIgnoreCase(opcao));
    }
}
