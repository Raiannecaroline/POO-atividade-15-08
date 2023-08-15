import java.util.Date;

public class Programa {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Raiane",
                3000, 160, new Date());

        funcionario1.setRg("12345678");
        funcionario1.setCpf("123456789101");
        funcionario1.setSalario(2000);
        funcionario1.setMatricula(123);
        funcionario1.calculaSalario();
        funcionario1.imprimeDados();

        Funcionario funcionario2 = new Funcionario("Elvis",
                4000, 170, new Date());

        funcionario2.setRg("12345678");
        funcionario2.setCpf("123456789101");
        funcionario2.calculaSalario();
        funcionario2.imprimeDados();

        Calculo calculo = new Calculo();

        calculo.calculaSalario(160, 2000);
    }

    /**
     * a)	O que acontece quando a ação da linha 5 é executada?
     * R: Está criando um objeto e colocando os valores nos parâmetros que são o mesmo do construtor.
     *
     * b)	Porque construção das linhas 7 e 8 é permitida?
     * R: Porque está instanciando os atributos e “setando” valores para as instâncias.
     *
     * c)	Nas linhas 9 e 10, acessamos os atributos salário e matrícula do funcionário. Essa construção implementada nas linhas 9 e 10 é permitida pelo objeto funcionário? Justifique a sua resposta.
     * R: Sim, pois está acessando esses atributos através encapsulamento.
     */
}
