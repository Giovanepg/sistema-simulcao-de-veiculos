/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeveiculos;
/**
 *
 * @author blacklegen
 */
public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, String placa) {
        super(marca, modelo, placa, 0);
        this.capacidadeCarga = 5000;
    }

    public Caminhao(String marca, String modelo, String placa, int velocidade, double capacidadeCarga) {
        super(marca, modelo, placa, velocidade);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void acelerar() {
        setVelocidade(getVelocidade() + 8);
    }

    public void acelerar(int incremento) {
        setVelocidade(getVelocidade() + incremento);
    }

    public void frear() {
        int novaVelocidade = getVelocidade() - 8;
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
        System.out.println("Caminhão ligado no modo " + modo + ".");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Caminhão: " + getMarca() + " " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Velocidade: " + getVelocidade() + " km/h");
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
        System.out.println("Combustível: " + getCombustivel() + " litros");
    }

    @Override
    public double calcularConsumo() {
        return 4.0;
    }

    @Override
    public String toString() {
        return "Caminhão: " + getMarca() + " " + getModelo() +
               " - Velocidade: " + getVelocidade() + " km/h";
    }
}