import java.util.Scanner;

public class Main {
    private static String[] nomes;
    private static int[] n1;
    private static int[] n2;
    private static final int size = 100;

    private static void relatorioAluno(int id){
        String situacao;
        double media = (n1[id] + n2[id]) / 2;
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media < 4 ) {
            situacao = "Reprovado";
        }
        else {
            situacao = "Prova Final";
        }
        System.out.println("Aluno: " + nomes[id] +" | Codigo: " + id + " | Nota AV1: " + n1[id] +" | Nota AV2: " + n2[id] + " | Media Final: " + media + " | Situação: " + situacao);
    }

    private static void relatorioGeral(){
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i] != null) {
                relatorioAluno(i);
            }
        }
    }

    public static void main(String[] args) {

        String opcao = "0";
        Scanner in = new Scanner(System.in);
        int pos = 0;
        nomes = new String[size];
        n1 = new int[size];
        n2 = new int[size];

        do{
            System.out.println("[1] Registrar as notas de um novo aluno.");
            System.out.println("[2] Consultar boletim de um aluno.");
            System.out.println("[3] Consultar notas da turma.");
            System.out.println("[4] Sair");

            System.out.print("Informe a opção desejada: ");
            opcao = in.next();

            switch (opcao) {
                case "1":
                    System.out.print("Insira o nome do Aluno: ");
                    nomes[pos] = in.next();
                    System.out.print("Insira a primeira nota do Aluno: ");
                    n1[pos] = in.nextInt();
                    System.out.print("Insira a Segunda nota do Aluno: ");
                    n2[pos] = in.nextInt();
                    System.out.println("Notas Registradas, o código do Aluno é: " + pos);
                    pos++;
                    break;
                case "2":
                    System.out.print("Insira o codigo do aluno: ");
                    int id = in.nextInt();

                    if(id >= 0 && id < pos) {
                        relatorioAluno(id);
                    }
                    else {
                        System.out.println("Código invalido");
                    }
                    break;

                case "3":
                    System.out.println("Relatorio de notas da turma.");
                    relatorioGeral();
                    break;

                case "4":
                    System.out.println("Fim do relatorio");
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }while (!"4".equalsIgnoreCase(opcao));
    }
}

