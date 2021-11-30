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
        carro.setCor("Preto");
        carro.setTipo("Fusca");
        carro.setNumPortas(2);
        carro.setPlaca("ASPaASD956");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz");
        pessoa.setCorDoCabelo("Castanho");
        pessoa.setBioTipo("Atlético");
        pessoa.setIdade(17);
        carro.setDono(pessoa);
        
        pessoa.setCarro(carro);
        pessoa.ligarCarro();
        pessoa.setCambioMarcha(1);
        pessoa.acelerarCarro();
        pessoa.setCambioMarcha(2);
        pessoa.acelerarCarro();
        pessoa.setCambioMarcha(3);
        pessoa.acelerarCarro();
        pessoa.setCambioMarcha(4);
        System.out.println("");
        
        pessoa.getCarro().getCambio();
               

        carro.imprimeDadosCarro();
        pessoa.imprimeDadosPessoa();

    }

}
