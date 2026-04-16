/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeveiculos;

/**
 *
 * @author blacklegen
 */
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", "ABC-1234", 0, 4);
        Moto moto1 = new Moto("Honda", "CG 160", "DEF-5678", 0, 160);
        Caminhao caminhao1 = new Caminhao("Volvo", "FH", "GHI-9999", 0, 8000);

        SimuladorDeTrafego simulador = new SimuladorDeTrafego(5);

        simulador.adicionarVeiculo(carro1);
        simulador.adicionarVeiculo(moto1);
        simulador.adicionarVeiculo(caminhao1);

        System.out.println();

        carro1.ligar();
        carro1.ligar("Esportivo");
        carro1.acelerar();
        carro1.abastecer(20);
        carro1.abastecer(10, "Gasolina");

        System.out.println();

        moto1.ligar();
        moto1.ligar("Econômico");
        moto1.acelerar();
        moto1.abastecer(8, "Gasolina");

        System.out.println();

        caminhao1.ligar();
        caminhao1.ligar("Carga pesada");
        caminhao1.acelerar();
        caminhao1.abastecer(100, "Diesel");

        System.out.println();

        System.out.println("Consumo do carro: " + carro1.calcularConsumo() + " km/l");
        System.out.println("Consumo da moto: " + moto1.calcularConsumo() + " km/l");
        System.out.println("Consumo do caminhão: " + caminhao1.calcularConsumo() + " km/l");

        System.out.println();

        simulador.simularInteracao(0, 2);

        System.out.println();
        simulador.listarVeiculos();

        System.out.println();

        Carro carro2 = new Carro("Ford", "Focus", "ABC-1234", 0, 4);

        if (carro1.equals(carro2)) {
            System.out.println("Os veículos são iguais, pois possuem a mesma placa.");
        } else {
            System.out.println("Os veículos são diferentes.");
        }
    }
}