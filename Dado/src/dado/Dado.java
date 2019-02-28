
package dado;

public class Dado {
    private Integer dado1;
   private Integer dado2;
   private Integer dado3;
   private Integer dado4;
   private Integer dado5;
  
   public Dado(Integer dado,Integer cubilete){
        this.dado1=dado;
        this.dado2=dado2;
        this.dado3=dado3;
        this.dado4=dado4;
        this.dado5=dado5;
     }
    public Integer getdado1(){
        return dado1;
    }
    public void setdado1(Integer dado1){
        this.dado1=dado1;
    }
    public Integer getdado2(){
        return dado2;
    }
    public void setdado2(Integer dado2){
        this.dado2=dado2;
    } public Integer getdado3(){
        return dado3;
    }
    public void setdado3(Integer dado3){
        this.dado3=dado3;
    } public Integer getdado4(){
        return dado4;
    }
    public void setdado4(Integer dado4){
        this.dado4=dado4;
    } public Integer getdado5(){
        return dado5;
    }
    public void setdado5(Integer dado5){
        this.dado5=dado5;
    }
    @Override
    public String toString(){
        return String.format("tu primer dado es: %d tu segundo dado es: %d tu tercer dado es: %d tu cuarto dado es: %d y el quinto dado es: %d",dado1,dado2,dado3,dado4,dado5);
       
    }
} 
   
    

