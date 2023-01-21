import Models.*;
import VO.*;
import enums.*;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author CrisMoura on 13/01/2023
 */
public class Petshop {
    private String cnpj;
    private Endereco endereco;

    //static List<Remedio> = criarListaRemedios;
    public Petshop() {
    }

    public Petshop(String cnpj, Endereco endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    ResponseVO higienizar(Cliente cliente, List<Animal> animais, Higiene higiene, String observacao){
        ResponseVO responseVO = new ResponseVO();

        for (int i = 0; i < animais.size(); i++){
            if (higiene.equals(Higiene.BANHO)){
                animais.get(i).setEstado(EstadoAnimal.LIMPO);
            }else if (higiene.equals(Higiene.TOSA)){
                animais.get(i).setEstado(EstadoAnimal.TOSADO);
            }else if(higiene.equals(Higiene.BANHO_E_TOSA)){
                animais.get(i).setEstado(EstadoAnimal.LIMPO_E_TOSADO);
            }else {
                animais.get(i).setEstado(EstadoAnimal.NORMAL);
            }
        }

        responseVO.setCliente(cliente);
        responseVO.setValor(new BigDecimal(60));
        responseVO.setServico(Servicos.HIGIENIZAR);
        responseVO.setId(1);

        return responseVO;
    }
    ResponseVO atendimentoClinico(Cliente cliente, List<Animal> animais, String observacao){
        ResponseVO responseVO = new ResponseVO();

        for (int i = 0; i < animais.size(); i++){
            animais.get(i).setObservacoes(observacao);
        }

        responseVO.setCliente(cliente);
        responseVO.setId(2);
        responseVO.setServico(Servicos.ATENDIMENTO_CLINICO);
        responseVO.setValor(new BigDecimal("20.00"));

        return responseVO;
    }
    ResponseVO vacinacao(Cliente cliente, List<Animal> animais,  List<Vacinas> vacina, String observacao){
        ResponseVO responseVO = new ResponseVO();
        List<EsquemaVacinal> vacinas = new ArrayList<>();

        for (int i = 0 ; i < animais.size(); i++){

            Animal animal = animais.get(i);

            switch (animal.getObservacoes()){
                case "VACINA_1":
                    animal.getVacinas().add(new EsquemaVacinal(new Date(), Vacinas.VACINA_1, observacao));
                    break;
                case "VACINA_2":
                    animal.getVacinas().add(new EsquemaVacinal(new Date(), Vacinas.VACINA_2, observacao));
                    break;
                case "VACINA_3":
                    animal.getVacinas().add(new EsquemaVacinal(new Date(), Vacinas.VACINA_3, observacao));
                    break;
                case "VACINA_4":
                    animal.getVacinas().add(new EsquemaVacinal(new Date(), Vacinas.VACINA_4, observacao));
                    break;
                case "VACINA_5":
                    animal.getVacinas().add(new EsquemaVacinal(new Date(), Vacinas.VACINA_5, observacao));
                    break;

            }
        }

        responseVO.setCliente(cliente);
        responseVO.setId(3);
        responseVO.setServico(Servicos.VACINACAO);
        responseVO.setValor(new BigDecimal(50.00));


        return responseVO;
    }


    public void verAlimentos(){
        List<Alimentos> listaAlimentos = new ArrayList<>();


        listaAlimentos.add(new Alimentos(1,"Ração Saco 2.5kg Gato", new BigDecimal(90.00)));
        listaAlimentos.add(new Alimentos(2,"Ração Saco 2.5kg Cachorro", new BigDecimal(90.00)));
        listaAlimentos.add(new Alimentos(3,"Petisco Gato 100g", new BigDecimal(26.00)));
        listaAlimentos.add(new Alimentos(4,"Petisco Cachorro 100g", new BigDecimal(26.00)));


        System.out.println("\n***************-ALIMENTOS-***************");

        for (int i = 0; i < listaAlimentos.size(); i++){
            System.out.println(listaAlimentos.get(i).toString());
        }

        System.out.println("***************************************\n");


    };

    public void verRemedios(){

        List<Remedio> listaRemedios = new ArrayList<>();

        listaRemedios.add(new Remedio(1,"Antipulgas e Carrapatos 200mg Gotas", new BigDecimal(90.00)));
        listaRemedios.add(new Remedio(2,"Vermífugo  Cachorro 700mg Comprimido", new BigDecimal(90.00)));
        listaRemedios.add(new Remedio(3,"Anti-inflamatório 17,5ml", new BigDecimal(26.00)));
        listaRemedios.add(new Remedio(4,"Suplemento Alimentar 14g", new BigDecimal(26.00)));

        System.out.println("***************-REMEDIOS-***************");

        for (int i = 0; i < listaRemedios.size(); i++){
            System.out.println(listaRemedios.get(i).toString());
        }

        System.out.println("************************************\n");

    };

    public void pagamento (List<Integer> itens){

    };



}


