import java.util.Date;

public class Funcionario {

    private String nome;
    private String cpf;
    private String rg;
    private int matricula;
    private float salario;
    private Date dataContratacao;
    private float salarioBase;
    private int horasTrabalhadas;

    static int geraMatricula = 0;

    public Funcionario(String nome, float salarioBase,
                       int horasTrabalhadas, Date dataContratacao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = dataContratacao;
        matricula = geraMatricula + 1;
    }

    public void calculaSalario() {
        Calculo calculo = new Calculo();

        calculo.calculaSalario(horasTrabalhadas, salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String imprimeDados() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                ", dataContratacao=" + dataContratacao +
                ", salarioBase=" + salarioBase +
                ", horasTrabalhadas=" + horasTrabalhadas +
                '}';
    }
}
