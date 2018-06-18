package aulas.semana09.prova;
public interface Automovel {
     /*
     * Este método deve ser implementado para dividir a distancia
     * (em kilometros) pelo tempo (em horas) e setar a variavael
     * velocidade da classe implementada com o resultado.
     */
    public void setVelocidade(double distancia,double tempo);
     /*
     * Este método deve retornar o valor da variável velocidade
     * da classe implementada. O valor da variável velocidade
     * deve ser inicializado com 0(zero)
     */
    public double getVelocidade();
    /*
     * Este método deve alterar a velocidade
     * do objeto com o parâmetro passado no argumento.
     */
    public void setVelocidade(double velocidade);
}

