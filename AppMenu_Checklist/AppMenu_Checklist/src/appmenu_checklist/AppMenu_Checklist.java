
package appmenu_checklist;
/**
 * comentario aqui
 */

import java.util.Scanner;
/**
 * Comentario aqui
 * @author Alunos
 */
public class AppMenu_Checklist {

    public static void main(String[] args) {
        ES se=new ES();
        Scanner sca=new Scanner(System.in);
        int sel=0;
        while(sel!=9){
            sel=se.LerInteiro("Selecione uma opção: \n"
                    + "\n 1-FOR:Contagem de 0 até o Numero digitado!"
                    + "\n 2-P.O.O:Retangulo de lados fixos!"
                    + "\n 3-Metodo Construtor: Classe com 3 metodos e 3 atributos"
                    + "\n 4-Metodo de Ação e Retorno: Dois Valores "
                    + "\n 5-Getters/setter: Produto"
                    + "\n 6-Joption Pane: Classe com 3 metodos e 3 atributos"
                    + "\n 7-Vetores: De zero até o numero digitado"
                    + "\n 8-Vetores de Objetos: 5 pessoas"
                    + "\n 9-Sair do Programa");
            switch(sel){
                case 1:
                    int num; 
                    int acum=1;
                    num=se.LerInteiro("Digite um Valor: ");
                    for(int cont=1;cont<=num;cont++){
                    acum=acum*cont;
                    se.exibir(acum);
                    }  
                    break;
                case 2:
                    
                     retangulo puxa=new retangulo();
                     puxa.start();
                    break;
                    
                case 3:
                    bike auto=new bike("Raiada","curto","Forte",3);
                    se.exibir("Raio: "+auto.roda+
                            "\n Guidão: "+auto.guidao+
                            "\n Suspensão: "+auto.suspensao+
                            "\n Farol: "+auto.farol);
                    
                    break;
                    
                case 4:
                     prod p1=new prod();
                     p1.exibir();
                     
                    break;
                case 5:
                     product prod=new product("Indefinido",0,0,0);
        prod.setNome(se.LerTexto("Digite o Nome do produto: "));
        prod.setCodigo(se.LerInteiro("Digite o Codigo do Produto: "));
        prod.setQtde(se.LerInteiro("Digite a quantidade do Produto: "));
        prod.setValorun(se.LerReal("Digite o Valor por Unidade: "));
        double valor=(prod.getValorun()*prod.getQtde());
        se.exibir("Nome do produto: "+prod.getNome()+
                    "\n Codigo do Produto: "+prod.getCodigo()+
                    "\n Quantidade de Produto: "+prod.getQtde()+
                    "\n Valor por Unidade: "+prod.getValorun()+
                    "\n Valor total: "+valor);
                    break;
                case 6:
                  vou valo=new vou();
                  valo.v1();
                  valo.exibir();
                   
                    break;
                case 7:
                    v1 value=new v1();
                    value.ve(se);
                    value.exibir(se);
                    break;
                case 8:
                    VetorPessoa Vpn=new VetorPessoa();
                    Vpn.LerPessoa(se);
                    Vpn.exibirPessoa(se);
                    break;
                            
                default:
                    se.exibir("Programa fechado");
                    break;
                    
            }
        }
    }
    
}
