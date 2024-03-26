/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenu_checklist;


import javax.swing.JOptionPane;
/**
 * comentario nosso
 * @author Alunos
 */
public class vou {
    double vetor[]=new double[6];
    public void v1(){
        for(int cont=0;cont<5;cont++){
            vetor[cont]=cont*3;
}
    }
    public void exibir(){
      for(int cont=0;cont<5;cont++){
          JOptionPane.showMessageDialog(null,vetor[cont]);
      }  
    }

}