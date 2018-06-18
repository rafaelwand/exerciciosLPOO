
package aulas.semana05.exemplosaula.bicicleta;

public class MontainBike extends Bicicleta {

    public MontainBike(int velocidade, int rpm, int marcha, int tipoAmortecedor) throws MarchaException, RpmException, VelocidadeException {
        super(marcha, velocidade, rpm);
        this.tipoAmortecedor = tipoAmortecedor;
        this.marcha = marcha;
    }

    public MontainBike clone() {
        try {
            return new MontainBike(this.getVelocidade(), this.getRpm(), this.getMarcha(), this.getTipoAmortecedor());
        } catch (MarchaException ex) {
            ex.printStackTrace();
        } catch (RpmException ex) {
            ex.printStackTrace();
        } catch (VelocidadeException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    private int tipoAmortecedor;
    private int marcha;

    public int getTipoAmortecedor() {
        return this.tipoAmortecedor;
    }

    public void setTipoAmortecedor(int tipoAmortecedor) {
        this.tipoAmortecedor = tipoAmortecedor;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getMarcha() {
        return this.marcha;
    }

    public void setVelocidade(int velocidade) throws VelocidadeException {
        super.setVelocidade(velocidade * 2);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MontainBike other = (MontainBike) obj;
        if (this.tipoAmortecedor != other.tipoAmortecedor) {
            return false;
        }
        if (this.marcha != other.marcha) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.tipoAmortecedor;
        hash = 41 * hash + this.marcha;
        return hash;
    }
    

}
