/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana05.exemplosaula;

import exerciciosloo.Bicicleta;

/**
 *
 * @author Rafael
 */
public class MontainBike extends Bicicleta {

    public MontainBike(int velocidade, int rpm, int marcha, int tipoAmortecedor){
        super(marcha,velocidade,rpm);
        this.tipoAmortecedor = tipoAmortecedor;
        this.marcha = marcha;
    }

    public MontainBike clone(){
        return new MontainBike(this.getVelocidade(),this.getRPM(),this.getMarcha(),this.getTipoAmortecedor());
    }
    private int tipoAmortecedor;
    private int marcha;

    public int getTipoAmortecedor(){
        getRPM();
        return this.tipoAmortecedor;
    }



    public void setTipoAmortecedor(int tipoAmortecedor){
        this.tipoAmortecedor = tipoAmortecedor;
    }

    public void setMarcha(int marcha){
        this.marcha = marcha;
    }

    public int getMarcha(){
        super.setVelocidade(5);
        return this.marcha;
    }

    public void setVelocidade(int vel){
        super.setVelocidade(vel);
    }

}
