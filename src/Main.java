import Models.Animal;
import Models.Cachorro;
import Models.Cliente;
import Models.EsquemaVacinal;
import VO.ResponseVO;
import enums.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author CrisMoura on ${DATE}
 */
public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {

        Petshop petshop = new Petshop();

        List<Animal> animal1 = new ArrayList<>();
        animal1.add(new Cachorro("Zion", new Date(), "shitzu", Porte.PEQUENO, 8.97, EstadoAnimal.LIMPO, new ArrayList<EsquemaVacinal>(), ""));

        List<Animal> animal2 = new ArrayList<>();
        animal2.add(new Cachorro());
        animal2.add(new Cachorro());
        animal2.add(new Cachorro());

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Moises");
        cliente1.setPets(animal1);

        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Samir");
        cliente2.setPets(animal2);

        ResponseVO responseVOAtendimentoClinico = petshop.atendimentoClinico(cliente1, cliente1.getPets(), Vacinas.VACINA_2.toString());
       //Teste Case 1 - PARTE 1
        System.out.println("*****Teste Case 1 - PARTE 1*****\n");
        System.out.println(responseVOAtendimentoClinico.getServico() + "\n" + responseVOAtendimentoClinico.getCliente().getPets().get(0).getObservacoes());

        boolean isIdValido = responseVOAtendimentoClinico.getId() > 0;
        boolean isServicoValido = responseVOAtendimentoClinico.getServico().equals(Servicos.ATENDIMENTO_CLINICO);
        boolean isValorValido = responseVOAtendimentoClinico.getValor() != null;
        boolean isPossuiObservacao = responseVOAtendimentoClinico.getCliente().getPets().get(0).getObservacoes().contains(Vacinas.VACINA_2.toString());

        mostraResultadoTestes(isIdValido, isServicoValido, isValorValido, isPossuiObservacao, "atendimento Clinico");

        System.out.println("\n*****Teste Case 1 - PARTE 2*****\n");

        ResponseVO responseVOVacinacao = petshop.vacinacao(cliente1,cliente1.getPets(),new ArrayList<Vacinas>(),"Vacina Tomada!");

        boolean isIdValidoVacinacao = responseVOVacinacao.getId() > 0;
        boolean isServicoValidoVacinacao = responseVOVacinacao.getServico().equals(Servicos.VACINACAO);
        boolean isValorValidoVacinacao = responseVOVacinacao.getValor() != null;
        boolean isPossuiObservacaoVacinacao = responseVOVacinacao.getCliente().getPets().get(0).getObservacoes().contains(Vacinas.VACINA_2.toString());

        mostraResultadoTestes(isIdValidoVacinacao, isServicoValidoVacinacao, isValorValidoVacinacao, isPossuiObservacaoVacinacao, "vacinação");

        //Teste Case 1 - PARTE 4
        System.out.println("\n*****Teste Case 1 - PARTE 3*****\n");
        ResponseVO responseVOHigienizacao = petshop.higienizar(cliente1,cliente1.getPets(), Higiene.BANHO,"Banho Tomado!");

        boolean isIdValidoHigienizacao = responseVOHigienizacao.getId() > 0;
        boolean isServicoValidoHigienizacao = responseVOHigienizacao.getServico().equals(Servicos.HIGIENIZAR);
        boolean isValorValidoHigienizacao = responseVOHigienizacao.getValor() != null;
        boolean isPossuiObservacaoHigienizacao = responseVOHigienizacao.getCliente().getPets().get(0).getEstado().equals(EstadoAnimal.LIMPO);

        mostraResultadoTestes(isIdValidoHigienizacao, isServicoValidoHigienizacao, isValorValidoHigienizacao, isPossuiObservacaoHigienizacao, "higienização");

        //Teste Case 1 - PARTE 5
        System.out.println("\n*****Teste Case 1 - PARTE 4*****\n");

        petshop.verAlimentos();
        petshop.verRemedios();

        System.out.println("\n*****Teste Case 1 - PARTE 5*****\n");

        petshop.verAlimentos();
        petshop.verRemedios();

        ResponseVO responseVO = new ResponseVO();

        System.out.println(responseVO.toString());
    }

    private static void mostraResultadoTestes(boolean isIdValido, boolean isServicoValido, boolean isValorValido, boolean isPossuiObservacao, String tipoTeste) {
        System.out.println("Id valido "+tipoTeste+" : " + isIdValido);
        System.out.println("Servico valido "+tipoTeste+" : " + isServicoValido);
        System.out.println("Valor valido "+tipoTeste+" : " + isValorValido);
        System.out.println("Possui Observacao "+tipoTeste+" : " + isPossuiObservacao);

        if (isIdValido && isServicoValido && isValorValido && isPossuiObservacao){
            System.out.println("\nTeste de "+tipoTeste+" Concluido com Sucesso !!!");
        }else{
            System.out.println("\nTestes de "+tipoTeste+" não validos, Por favor verifique os logs de cada teste acima");
        }
    }
}