package aulas.semana09.prova;
public class Pessoa {
    private int idade;
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        //try {
            p1.setIdade(Integer.parseInt(args[0]));
        //} catch (Exception ex) {
        //    System.out.println(ex.getMessage());
        //}
    }
    public void setIdade(int idade) {
        if(idade<0 || idade>200)
            throw new RuntimeException("Idade Inválida");
        this.idade = idade;
    }
}
