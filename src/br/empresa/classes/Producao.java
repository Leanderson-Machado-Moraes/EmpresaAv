package br.empresa.classes;

public class Producao {

    private String peca;
    private int segundos;
    private int hora;
    private int minuto;
    private int segundo;

    public Producao() {
        this.peca = "Teclado";
        this.segundos = 100;
        this.hora = hora;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        if (this.segundos < 0) {
            this.segundos = 100;

        } else {
            this.segundos = segundos;

        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void calcularHMS() {
        int ssegundos;
        ssegundos = 0;
        this.hora = segundos / 3600;
        ssegundos = segundos% 3600;
        this.minuto = ssegundos / 60;
        ssegundos %= 60;
        segundo = ssegundos;
        
        
    }

    @Override
    public String toString() {
        return " Produção:" + " peça: " + this.getPeca()
                + " levou " + segundos + " segundos " + " levou um total de "
                + this.getHora() + ":" + this.getMinuto()
                + ":" + this.getSegundo() + " para ficar pronta!! ";
    }
}
