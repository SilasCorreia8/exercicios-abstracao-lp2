
public class FuncionarioCLT extends Funcionario{
    
    private int horaExtra;
    private double valorHoraExtra;
    
    //Constructos
    public FuncionarioCLT(String nome, String matricula, double salarioBase) {
        
        super(nome, matricula, salarioBase);
        this.horaExtra = horaExtra;
        this.valorHoraExtra = salarioBase / 160 * 1.5; //~50%
        
    }

    //Metodos abstratos
    @Override
    public double calculaSalario() {
        return getSalarioBase() + (horaExtra * valorHoraExtra);
    }
    
    @Override
    public String getBeneficios() {
        return "VT, VR, plano de saude, ferias, decimo terceiro.";
    }

    //Metodos
    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = ( horaExtra < 0 || horaExtra > 30 ) ? 0: horaExtra;
    }
    
    
}
