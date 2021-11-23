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
       
        System.out.println("---------CARRO---------");
        System.out.println("Cor do carro: "+carro.getCor());
        System.out.println("Numero de portas: "+carro.getNumPortas());
        System.out.println("Placa do carro: "+carro.getPlaca());
        System.out.println("Modelo do carro: "+carro.getTipo());
        
        
    }
    
}
