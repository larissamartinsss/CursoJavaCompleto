package br.com.introduçãojava.javacore.introducaoclasses.DominioTest;

import br.com.introduçãojava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Onix";
        carro1.modelo = "Premier";
        carro1.ano = 2021;

        System.out.println("----------------------------");
        carro2.nome = "FORD";
        carro2.modelo = "FORD KA ";
        carro2.ano = 2022;

        System.out.println("Nome do carro --> " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);

        System.out.println("Nome do carro --> " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }


}
