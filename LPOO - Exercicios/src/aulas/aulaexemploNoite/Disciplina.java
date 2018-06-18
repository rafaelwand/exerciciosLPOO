/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.aulaexemploNoite;

/**
 *
 * @author Rafael
 */
public class Disciplina {
    String nome;
    int horasAula;

    public Disciplina(String nome, int horasAula) {
        this.nome = nome;
        this.horasAula = horasAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
    
    
}
