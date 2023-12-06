
import javax.swing.JOptionPane;


public class Cliente {
    private int Id;
    private String Nome;
    private String Endereco;
    private String Email;
    private double RendaMensal;
    private double LimiteCredito;

    public Cliente() {
        this(0,"","","",0.0,0.0);
    }

    public Cliente(int Id, String Nome, String Endereco, String Email, double RendaMensal, double LimiteCredito) {
        this.Id = Id;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Email = Email;
        this.RendaMensal = RendaMensal;
        this.LimiteCredito = LimiteCredito;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getRendaMensal() {
        return RendaMensal;
    }

    public void setRendaMensal(double RendaMensal) {
        this.RendaMensal = RendaMensal;
    }

    public double getLimiteCredito() {
        return LimiteCredito;
    }

    public void setLimiteCredito(double LimiteCredito) {
        this.LimiteCredito = LimiteCredito;
    }
    
    public void CadastrarCliente(){
        setId(Integer.parseInt(JOptionPane.showInputDialog("Insira seu Id:")));
        setNome(JOptionPane.showInputDialog("Insira Seu nome:"));
        setEndereco(JOptionPane.showInputDialog("Digite seu Endereco:"));
        setEmail(JOptionPane.showInputDialog("Digite seu Email:"));
        setRendaMensal(Double.parseDouble(JOptionPane.showInputDialog("Digite sua Renda Mensal:")));
        setLimiteCredito(Double.parseDouble(JOptionPane.showInputDialog("Seu Limite Credito:")));
    }
    public void ListarCliente(){
    JOptionPane.showMessageDialog(null,"\nSeu Id:"+ getId()+"\nSeu Nome:"+getNome()+"\nSeu Endereco :"+getEndereco()+"\nEmail:"+getEmail()+"\nRenda Mensal:R$"+getRendaMensal()+"\nLimite Credito:R$"+getLimiteCredito());
    }
}
