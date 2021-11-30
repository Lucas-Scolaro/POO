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
public class Pessoa {
    String nome;
    String corDoCabelo;
    String bioTipo;
    int idade;
    Carro carro;
    
    
    void ligarCarro(){
        carro.ligar();
    }
    void desligarCarro(){
        carro.desligar();
    }
    void acelerarCarro(){
        carro.acelerar();
    }
    void frearCarro(){
        carro.frear();
    }
    void setCambioMarcha(int marcha){
        carro.setCambio(marcha);
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    void imprimeDadosPessoa(){
        System.out.println();
        System.out.println("---------PESSOA---------");
        System.out.println("Nome: " + nome);
        System.out.println("Cor cabelo: " + corDoCabelo);
        System.out.println("Idade: " + bioTipo);
        System.out.println("Idade: " + idade);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getBioTipo() {
        return bioTipo;
    }

    public void setBioTipo(String bioTipo) {
        this.bioTipo = bioTipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
  
}
