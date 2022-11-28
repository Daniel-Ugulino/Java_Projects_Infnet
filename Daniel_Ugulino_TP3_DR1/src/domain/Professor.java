package domain;

import exceptions.NameExceptions;

public class Professor extends Pessoa {

    private String turma;
    private Float salario;
    private String materia;

    private Integer matricula;



    public Professor(String nome, Integer idade) throws NameExceptions {
        super(nome,idade);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("PROFESSOR\n");
        sb.append(super.toString());
        sb.append("\nMatricula: ");
        sb.append(this.matricula);
        sb.append("\nTurma: ");
        sb.append(this.turma);
        sb.append(" | Salario: ");
        sb.append(this.salario);
        sb.append(" | Materia: ");
        sb.append(this.materia);

        return sb.toString();
    }


    public String getTurma(String turma){
        return this.turma;
    }

    public Float getSalario(Float salario){
        return this.salario;
    }

    public String getMateria(String Materia){
        return this.materia;
    }


    public void setMateria(String materia){
        this.materia = materia;
    }

    public void setSalario(Float salario){
        this.salario = salario;
    }

    public void setTurma(String turma){
       this.turma = turma;
    }

    public void setMatricula(Integer matricula){this.matricula = matricula;}

}
