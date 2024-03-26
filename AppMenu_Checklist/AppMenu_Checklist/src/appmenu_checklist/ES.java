
package appmenu_checklist;
import javax.swing.JOptionPane;
/**
 * outro coment
 * @author Alunos
 */

public class ES {
    public void exibir(Object obj){
           JOptionPane.showMessageDialog(null,obj);
                }
        public String LerTexto(String msg){
          return JOptionPane.showInputDialog(msg);
        }
        public int LerInteiro(String msg){
            return Integer.parseInt(JOptionPane.showInputDialog(msg));
        }
        public double LerReal(String msg){
            return Double.parseDouble(JOptionPane.showInputDialog(msg));
        }
}
