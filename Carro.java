/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadeveiculos;

/**
 *
 * @author blacklegen
 */
public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, String placa) {
        super(marca, modelo, placa, 0);
        this.numeroPortas = 4;
    }

    public Carro(String marca, String modelo, String placa, int velocidade, int numeroPortas) {
        super(marca, modelo, placa, velocidade);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
    }

    public void acelerar(int incremento) {
        setVelocidade(getVelocidade() + incremento);
    }

    public void frear() {
        int novaVelocidade = getVelocidade() - 10;
        if (novaVelocidade < 0) {
            novaVelocidade = 0;
        }
        setVelocidade(novaVelocidade);
    }

    public void frear(int decremento) {
        int novaVelocidade = getVelocidade() - decremento;
        if (novaVelocidade < 0) {
            novaVelocidade = 0;
        }
        setVelocidade(novaVelocidade);
    }

    public void ligar(String modo) {
        System.out.println("Carro ligado no modo " + modo + ".");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Carro: " + getMarca() + " " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Velocidade: " + getVelocidade() + " km/h");
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("Combustível: " + getCombustivel() + " litros");
    }

    @Override
    public double calcularConsumo() {
        return 12.0;
    }

    @Override
    public String toString() {
        return "Carro: " + getMarca() + " " + getModelo() +
               " - Velocidade: " + getVelocidade() + " km/h";
    }
}
