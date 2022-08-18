package Televisao;

public class Tv {
    private String modelo;
    private String tamanho;
    private String cor;
    private String marca;

    public Tv(String modelo, String tamanho, String cor, String marca) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
