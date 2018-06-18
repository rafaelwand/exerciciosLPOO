package aulas.semana07.exemplosaula;
public class UsaThread {
    public static void main(String args[]){
        A objeto1 = new A(){
            public void run(){System.out.println("Rodou A");}
            public String getOla(){return "Ola";}
            public String getOi(){return "Ola";}
        };

        C objC = new C();
        objC.start();
        objC.getOla();
        
        Runnable objeto2 = new Runnable(){
            public void run(){System.out.println("Rodou B");}
        };

        objeto1.start();
        //objeto1.getOla();
         objeto2.run();

    }
}
