
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class Funcionario {
    
    private String nome;
    private String matricula;
    private LocalDate dataAdmissao;
    private double salarioBase;

    //Constructor
    public Funcionario(String nome, String matricula, double salarioBase) {
        
        this.nome = nome;
        this.matricula = matricula;
        setSalarioBase(salarioBase);
        this.dataAdmissao = LocalDate.now();
    }

    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase < 0 ) ? 0: salarioBase;
    }
    
    //Metodo Abstrato - Cada tipo calcula diferente
    public abstract double calculaSalario();
    
    //Metodo Abstrato - Cada tipo calcula diferente
    public abstract String getBeneficios();
    
    //Metodo Concreto
    public String getInfoGeral() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s: %s \n%s: %s \n%s: %s", 
                "Nome", nome,
                "Matricula", matricula,
                "Data de Admissao", dataAdmissao.format(formatter));
    }
    
    
    
}
