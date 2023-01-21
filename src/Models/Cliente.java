package Models;

import java.util.*;

/**
 * @author CrisMoura on 13/01/2023
 */
public class Cliente extends Pessoa{
    private int id;
    private List<Animal> pets;

   //Construtor
    public Cliente(){};

    public Cliente(int id, List<Animal> pets) {
        this.id = id;
        this.pets = pets;
    }

    public Cliente(String nome, String cpf, String email, Endereco endereco, String telefone, int id, List<Animal> pets) {
        super(nome, cpf, email, endereco, telefone);
        this.id = id;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", pets=" + pets.get(0).getNome()+
                '}';
    }
}
