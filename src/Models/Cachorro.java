package Models;

import enums.*;

import java.util.Date;
import java.util.List;

/**
 * @author CrisMoura on 16/01/2023
 */
public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(String nome, Date nascimento, String raca, Porte porte, Double peso, EstadoAnimal estado, List<EsquemaVacinal> vacinas, String observacoes) {
        super(nome, nascimento, raca, porte, peso, estado, vacinas, observacoes);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Date getNascimento() {
        return super.getNascimento();
    }

    @Override
    public void setNascimento(Date nascimento) {
        super.setNascimento(nascimento);
    }

    @Override
    public String getRaca() {
        return super.getRaca();
    }

    @Override
    public void setRaca(String raca) {
        super.setRaca(raca);
    }

    @Override
    public Porte getPorte() {
        return super.getPorte();
    }

    @Override
    public void setPorte(Porte porte) {
        super.setPorte(porte);
    }

    @Override
    public Double getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(Double peso) {
        super.setPeso(peso);
    }

    @Override
    public EstadoAnimal getEstado() {
        return super.getEstado();
    }

    @Override
    public void setEstado(EstadoAnimal estado) {
        super.setEstado(estado);
    }

    @Override
    public List<EsquemaVacinal> getVacinas() {
        return super.getVacinas();
    }

    @Override
    public void setVacinas(List<EsquemaVacinal> vacinas) {
        super.setVacinas(vacinas);
    }

    @Override
    public String getObservacoes() {
        return super.getObservacoes();
    }

    @Override
    public void setObservacoes(String observacoes) {
        super.setObservacoes(observacoes);
    }

    @Override
    public String toString() {
        return "Cachorro{}";
    }
}
