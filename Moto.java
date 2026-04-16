/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeveiculos;

/**
 *
 * @author blacklegen
 */
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, String placa) {
        super(marca, modelo, placa, 0);
        this.cilindradas = 160;
    }

    public Moto(String marca, String modelo, String placa, int velocidade, int cilindradas) {
        super(marca, modelo, placa, velocidade);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
    }

    public void acelerar(int incremento) {
        setVelocidade(getVelocidade() + incremento);
    }

    public void frear() {
        int novaVelocidade = getVelocidade() - 15;
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
        System.out.println("Moto ligada no modo " + modo + ".");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Moto: " + getMarca() + " " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Velocidade: " + getVelocidade() + " km/h");
        System.out.println("Cilindradas: " + cilindradas + "cc");
        System.out.println("Combustível: " + getCombustivel() + " litros");
    }

    @Override
    public double calcularConsumo() {
        return 25.0;
    }

    @Override
    public String toString() {
        return "Moto: " + getMarca() + " " + getModelo() +
               " - Velocidade: " + getVelocidade() + " km/h";
    }
}