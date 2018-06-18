/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana05.exemplosaula.funcionario;

/**
 *
 * @author Rafael
 */
public class MainTeste {
    public static void main(String[] args){
        Funcionario funcionarios[] = new Funcionario[3];
       
        funcionarios[0] = new Analista(1500.00,"Joao",111,222,"Rua X,10");
        funcionarios[1] = new Analista(1200.00,"Paulo",333,444,"Rua Y,20");
        funcionarios[2] = new Analista(1100.00,"Pedro",555,666,"Rua Z,30");
        String[] sistemasAut = {"RH","Financeiro"};
        Gerente gerente = new Gerente(sistemasAut,funcionarios,10000.00,"Ricao",777,777,"Rua Rica,1000");
        
        Funcionario funcionariosRelatorio[] = new Funcionario[4];
        for(int i=0;i<funcionarios.length;i++){
            funcionariosRelatorio[i] = funcionarios[i];
        }
        funcionariosRelatorio[3] = gerente;
        imprimeRelatorioFuncionarios(funcionariosRelatorio);
        autenticarRH(gerente);

        
        
    }
    
    public static void imprimeRelatorioFuncionarios(Funcionario funcionarios[]){
        for(Funcionario funcionario:funcionarios)
            System.out.println("Nome:"+funcionario.getNome()+"  Salario:"+funcionario.getSalario());
    }
    
    public static void autenticarRH(Autenticavel autenticavel){
        if(autenticavel.autenticar("RH")){
            System.out.println("Usuario autenticado");
        }else
            System.out.println("Usuario nao autenticado.");
    }
    
}
