
package appmenu_checklist;

/**
 * comentario aqui
 * @author Alunos
 */
public class Pessoa {
  private String Name;
  private int idade;
  private double altura;
  
       public Pessoa(String Name, int idade, double altura){
           this.Name=Name;
           this.idade=idade;
           this.altura=altura;
       }
       
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
       
}