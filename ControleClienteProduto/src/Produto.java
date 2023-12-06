
import javax.swing.JOptionPane;


public class Produto {
    private int Id;
    private String Descricao;
    private int EstoqueDisponivel;
    private double PrecoUnitario;

    public Produto() {
        this(0,"",0,0.0);
    }

    public Produto(int Id, String Descricao, int EstoqueDisponivel, double PrecoUnitario) {
        this.Id = Id;
        this.Descricao = Descricao;
        this.EstoqueDisponivel = EstoqueDisponivel;
        this.PrecoUnitario = PrecoUnitario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getEstoqueDisponivel() {
        return EstoqueDisponivel;
    }

    public void setEstoqueDisponivel(int EstoqueDisponivel) {
        this.EstoqueDisponivel = EstoqueDisponivel;
    }

    public double getPrecoUnitario() {
        return PrecoUnitario;
    }

    public void setPrecoUnitario(double PrecoUnitario) {
        this.PrecoUnitario = PrecoUnitario;
    }
    
    public void CadastrarProduto(){
     setId(Integer.parseInt(JOptionPane.showInputDialog("Insira seu Id:")));
     setDescricao(JOptionPane.showInputDialog("Insira Descricao Produto:"));
     setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Insira Quantida Estoque:")));
     setPrecoUnitario(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor Unitario:")));
    }
    public void ListarProduto(){
    JOptionPane.showMessageDialog(null,"\n Seu Id:"+ getId()+"\n Descricao Produto:"+getDescricao()+"\n Estoque Disponivel:"+getEstoqueDisponivel()+"\n Preco Unitario:"+getPrecoUnitario());
    }
    
    public double Pedido(int qtde){
        double valor;
        valor = (this.getPrecoUnitario()*qtde);
        return valor;
    }
    
    public void Vender(int qtde){
    this.setEstoqueDisponivel(this.getEstoqueDisponivel()-qtde);
    JOptionPane.showMessageDialog(null, "Venda Realizada");
    }
     

 
    
}
