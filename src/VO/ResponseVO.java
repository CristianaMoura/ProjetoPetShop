package VO;

import Models.*;
import enums.*;

import java.math.BigDecimal;

/**
 * @author CrisMoura on 16/01/2023
 */
public class ResponseVO {
    private int id;
    private Servicos servico;
    private BigDecimal valor;
    private Cliente cliente;

    public ResponseVO(){};

    public ResponseVO(int id, Servicos servico, BigDecimal valor, Cliente cliente) {
        this.id = 1;
        this.servico = servico;
        this.valor = new BigDecimal(29.90);
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return "ResponseVO\n" +
                "\nid= " + id +
                "\nservico= " + servico +
                "\nvalor= " + valor +
                "\ncliente= " + cliente;
    }
}
