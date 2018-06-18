/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana05.exemplosaula.bicicleta;

/**
 *
 * @author Rafael
 */
public class Bicicleta {

    private int marcha=1;
    private int velocidade;
    private int rpm;

    public Bicicleta(int velocidade, int marcha, int rpm) throws MarchaException,RpmException,VelocidadeException{
        setMarcha(marcha);
        setVelocidade(velocidade);
        setRpm(rpm);
    }

    public String toString(){
        return "Bicicleta\n"+
                "\tVelocidade="+this.getVelocidade()+"\n"+
                "\tMarcha="+this.getMarcha()+"\n"+
                "\tRpm="+this.getRpm();
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) throws MarchaException {
        if ((marcha >= 1 && marcha <= 24) && ((this.marcha + 1) == marcha || (this.marcha - 1) == marcha)) {
            this.marcha = marcha;
        } else {
            throw new MarchaException();
        }
    }

    public int getRpm(){
        return this.rpm;
    }

    public void setRpm(int rpm) throws RpmException {
        if(rpm>=0){
            this.rpm=rpm;
        } else {
            throw new RpmException();
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) throws VelocidadeException {
        if (velocidade >= 0 && velocidade <= 300) {
            this.velocidade = velocidade;
        } else {
            throw new VelocidadeException();
        }

    }
    /**
     * Método que produz um hashCode igual para bicicletas iguais.
     * @return Inteiro que representa o hashCode do objeto
     */
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.marcha;
        hash = 71 * hash + this.velocidade;
        hash = 71 * hash + this.rpm;
        return hash;
    }
    /**
     * Método que compara duas bicicletas pelo seu conteúdo
     * @return booleano: Verndadeiro se igual, falso, caso contrário.
     */
    @Override
    public boolean equals(Object obj){
        
        if(obj == null){
            return false;
        }
        if(!obj.getClass().equals(this.getClass()) )
            return false;

        Bicicleta objBicicleta = (Bicicleta)obj;
        if(objBicicleta.getMarcha()!=this.getMarcha() || objBicicleta.getRpm()!=this.getRpm() || objBicicleta.getVelocidade()!=this.getVelocidade())
            return false;

        return true;
    }
}
