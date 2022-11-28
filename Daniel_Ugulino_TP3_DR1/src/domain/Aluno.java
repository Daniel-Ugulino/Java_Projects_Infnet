package domain;

import exceptions.NameExceptions;

public class Aluno extends Pessoa {
    private Integer nota1;
    private Integer nota2;
    private Integer matricula;
    private Double media;
    private String periodo;


    public Aluno(String nome,Integer idade) throws NameExceptions {
        super(nome,idade);
    }

    public Double getMedia(){
        try {
            this.media = Double.valueOf((this.nota1 + this.nota2) / 2);
        }catch (Exception e){
            System.out.println("Valores invalidos");
        }
        return media;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("ALUNO\n");
        sb.append(super.toString());
        sb.append("\nMatricula: ");
        sb.append(this.matricula);
        sb.append(" | Periodo: ");
        sb.append(this.periodo);
        sb.append(" | Nota 1: ");
        sb.append(this.nota1);
        sb.append(" | Nota 2: ");
        sb.append(this.nota2);
        sb.append(" | Media: ");
        sb.append(this.media);

        return sb.toString();
    }

    public void setNota1(Integer nota1){
        this.nota1 = nota1;
    }

    public void setNota2(Integer nota2){
        this.nota2 = nota2;
    }
    public void setMatricula(Integer matricula){this.matricula = matricula;}
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    public Integer getNota1(Integer nota1){
        return this.nota1;
    }

    public Integer getNota2(Integer nota2){
        return this.nota2;
    }

    public String getPeriodo(String periodo){
        return this.periodo;
    }

}
