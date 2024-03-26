
package appmenu_checklist;

import java.util.Scanner;
/**
 * comentario novo
 * @author Alunos
 */
public class v1 {
    Scanner sca=new Scanner(System.in);
    int num;
   double vetor[]=new double[5];
        public  void ve(ES se){
            for(int cont=0;cont<=5;cont++){
               se.LerInteiro("Digite um numero: ");
                vetor[cont]=num;
            }
        }
        public void exibir(ES se){
            for(int cont=0;cont<5;cont++){
               se.exibir(vetor[cont]);
        }
        }
      
}
