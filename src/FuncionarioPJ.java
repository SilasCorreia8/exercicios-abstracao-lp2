
public class FuncionarioPJ extends Funcionario{
    
    private String cnpj;
    private double valorContrato;
    
    public FuncionarioPJ(String nome, String matricula, String cnpj, double valorContrato) {
        
        super(nome, matricula, valorContrato);
        this.cnpj = cnpj;
        this.valorContrato = valorContrato;
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
    
    @Override
    public double calculaSalario() {
        return valorContrato;
    }
    
    @Override
    public String getBeneficios() {
        return "Não possui beneficios";
    }
    
}
