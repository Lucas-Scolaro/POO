/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Carro {

    String tipo;
    String cor;
    String placa;
    int numPortas;
    int cambio;

    public int getCambio() {
        System.out.println("Marcha: "+this.cambio);
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    Pessoa dono;
    
    void ligar(){
        System.out.println("Ligando Carro");
    }
    void desligar(){
        System.out.println("Desligando Carro");
    }
    void acelerar(){
        System.out.println("Acelerando Carro");
    }
    void frear(){
        System.out.println("Freando carro");
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    public Carro(){
        
    }
        
    public Carro(String tipo, String cor, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;

    }

    {

    }

    void imprimeDadosCarro() {
        System.out.println("---------CARRO---------");
        System.out.println("Cor do carro: " + cor);
        System.out.println("Numero de portas: " + numPortas);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Modelo do carro: " + tipo);
        System.out.println("Dono: "+dono.nome);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
