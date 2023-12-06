
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Produto prod = new Produto();
        
 
           
 int op;
      double a,b;
      
      do{
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao \n" + "\n 1- Cadastar Cliente \n 2- Listar Cliente \n 3- Cadastrar Produto \n 4- Listar Produto \n 5- Vender \n 0- Sair" ));

          switch (op)
          {
            case 1:
              cli.CadastrarCliente();
              break;
            case 2:
              cli.ListarCliente();
              break;
            case 3:
                prod.CadastrarProduto();
                break;
             case 4:
                prod.ListarProduto();
                break;
            case 5:
             double Vender;
            
              int qtde=Integer.parseInt(JOptionPane.showInputDialog("Digite A Quantidade:"));
              if (prod.getEstoqueDisponivel()>=qtde){
              prod.Pedido(qtde);
              }
              else
              {
              JOptionPane.showMessageDialog(null, "Estoque Indsponivel");
              }
            case 0:
             JOptionPane.showMessageDialog(null,"A Finalizar Programa");
              break;
              default:
              JOptionPane.showMessageDialog(null,"Opcao Invalida");
              break;
          }
      } while(op!=0);
    }
    
}