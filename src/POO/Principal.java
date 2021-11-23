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
public class Principal {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        carro.setCor("Vermelho");
        carro.setNumPortas(4);
        carro.setPlaca("MPO-6598");
        carro.setTipo("Fusca");
       
       // carro.imprimeDadosCarro();
        
        double a=3;
        System.out.println("Quadrado de "+a+" "
                + "é: "+Calculo.elevar(a));
        
        
        
    }
    
}
