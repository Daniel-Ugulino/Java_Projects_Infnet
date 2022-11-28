package domain;

import exceptions.NameExceptions;

import java.security.PublicKey;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private Aluno aluno;
    private Professor professor;

    public Pessoa(){}

    public Pessoa(String nome, int idade) throws NameExceptions {
        String nome_split[] = nome.split("_");
        if(nome_split.length <= 0){
            throw new NameExceptions("O preenchimento do campo 'nome' est� incorreto");
        }
        else{
            int primeironome = nome.indexOf("_");
            int nomefinal = nome.lastIndexOf("_");

            this.nome = nome.substring(0, primeironome);
            this.sobrenome = nome.substring(nomefinal).replace("_","");
            this.idade = idade;

            //this.nome = nome_split[0];
            //this.sobrenome = nome_split[1];
            //this.idade = idade;
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ");
        sb.append(this.nome);
        sb.append(" | Sobrenome:");
        sb.append(this.sobrenome);
        sb.append(" | Idade:");
        sb.append(this.idade);

        return sb.toString();
    }

    public String consultarSituacao(String tipo){
        if(tipo.equalsIgnoreCase("aluno")){
            return aluno.toString();
        }
        else {
            return professor.toString();
        }
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Aluno getAluno(){return this.aluno;}

    public Professor getProfessor(){return this.professor;}

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
