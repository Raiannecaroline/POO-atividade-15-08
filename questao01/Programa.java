import java.util.Date;

public class Programa {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Raiane",
                3000, 160, new Date());

        funcionario.getNome();
        funcionario.getSalarioBase();
        funcionario.getHorasTrabalhadas();

        Calculo calculo = new Calculo();

        calculo.calculaSalario(160, 2000);
    }
}
