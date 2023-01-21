package Models;

import enums.*;
import java.util.Date;
import java.util.List;

/**
 * @author CrisMoura on 13/01/2023
 */
public abstract class Animal {

    private String nome;
    private Date Nascimento;
    private String raca;
    private Porte porte;
    private Double peso;
    private EstadoAnimal estado;
    private List<EsquemaVacinal> vacinas;
    private String observacoes;

    public Animal() {
    }

    public Animal(String nome, Date nascimento, String raca, Porte porte, Double peso, EstadoAnimal estado, List<EsquemaVacinal> vacinas, String observacoes) {
        this.nome = nome;
        Nascimento = nascimento;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.estado = estado;
        this.vacinas = vacinas;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date nascimento) {
        Nascimento = nascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public List<EsquemaVacinal> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<EsquemaVacinal> vacinas) {
        this.vacinas = vacinas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Animal\n" +
                "\nnome= " + nome +
                "\nNascimento=" + Nascimento +
                "\nraça= " + raca +
                "\nporte= " + porte +
                "\npeso= " + peso +
                "\nestado= " + estado +
                "\nvacinas= " + vacinas +
                "\nobservacoes= " + observacoes;
    }
}
