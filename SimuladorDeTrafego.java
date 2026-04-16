/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeveiculos;

/**
 *
 * @author blacklegen
 */
public class SimuladorDeTrafego {
    private Veiculo[] pista;

    public SimuladorDeTrafego(int tamanho) {
        pista = new Veiculo[tamanho];
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        for (int i = 0; i < pista.length; i++) {
            if (pista[i] == null) {
                pista[i] = veiculo;
                System.out.println(veiculo.getModelo() + " entrou na pista.");
                return;
            }
        }

        System.out.println("A pista está cheia.");
    }

    public void listarVeiculos() {
        for (int i = 0; i < pista.length; i++) {
            if (pista[i] != null) {
                System.out.println("----------------------");
                pista[i].exibirStatus();
            }
        }
    }

    public void simularInteracao(int pos1, int pos2) {
        if (pos1 >= 0 && pos1 < pista.length &&
            pos2 >= 0 && pos2 < pista.length &&
            pista[pos1] != null && pista[pos2] != null) {

            Veiculo v1 = pista[pos1];
            Veiculo v2 = pista[pos2];

            v1.interagir(v2);

            if (v2 instanceof Caminhao) {
                v1.interagir((Caminhao) v2);
            }
        } else {
            System.out.println("Interação inválida.");
        }
    }
}