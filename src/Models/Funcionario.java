package Models;

import enums.Cargo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author CrisMoura on 16/01/2023
 */
public class Funcionario extends Pessoa{
    private int id;
    private Cargo cargo;
    private BigDecimal salario;
    private Date admissao;
    private Date desligamento;

    public Funcionario(){};
    public Funcionario(int id, Cargo cargo, BigDecimal salario, Date admissao, Date desligamento) {
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.admissao = admissao;
        this.desligamento = desligamento;
    }

    public Funcionario(String nome, String cpf, String email, Endereco endereco, String telefone, int id, Cargo cargo, BigDecimal salario, Date admissao, Date desligamento) {
        super(nome, cpf, email, endereco, telefone);
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.admissao = admissao;
        this.desligamento = desligamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public Date getDesligamento() {
        return desligamento;
    }

    public void setDesligamento(Date desligamento) {
        this.desligamento = desligamento;
    }
}
