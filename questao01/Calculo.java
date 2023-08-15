public class Calculo {

    private float totalSalario;
    private int horasTrabalhadas;
    private float salarioBase;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Método
    public void calculaSalario(int horasTrabalhadas, float salarioBase) {
        totalSalario = salarioBase * horasTrabalhadas;
    }

    public float getTotalSalario() {
        return this.totalSalario;
    }
}
