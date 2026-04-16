/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeveiculos;

/**
 *
 * @author blacklegen
 */
public class Garagem {
    private Veiculo[] veiculos;

    public Garagem(int tamanho) {
        veiculos = new Veiculo[tamanho];
    }

    public void estacionar(Carro c) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                veiculos[i] = c;
                System.out.println("Carro estacionado!");
                return;
            }
        }
        System.out.println("Garagem cheia!");
    }

    public void estacionar(Moto m) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                veiculos[i] = m;
                System.out.println("Moto estacionada!");
                return;
            }
        }
        System.out.println("Garagem cheia!");
    }

    public void listarVeiculos() {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                System.out.println("-------------------");
                veiculos[i].exibirStatus();
            }
        }
    }
}   
