/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeveiculos;

/**
 *
 * @author blacklegen
 */
import java.util.Objects;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int velocidade;
    private double combustivel;

    public Veiculo(String marca, String modelo, String placa, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = velocidade;
        this.combustivel = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void ligar() {
        System.out.println("Veículo ligado.");
    }

    public void exibirStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Combustível: " + combustivel + " litros");
    }

    public void interagir(Veiculo outro) {
        System.out.println(modelo + " interagiu com " + outro.getModelo() + ".");
    }

    public void interagir(Caminhao c) {
        System.out.println(modelo + " reduziu a velocidade ao se aproximar do caminhão " + c.getModelo() + ".");
    }

    public void abastecer(double litros) {
        combustivel += litros;
        System.out.println(modelo + " abasteceu " + litros + " litros.");
    }

    public void abastecer(double litros, String tipoCombustivel) {
        combustivel += litros;
        System.out.println(modelo + " abasteceu " + litros + " litros de " + tipoCombustivel + ".");
    }

    public double calcularConsumo() {
        return 10.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Veiculo outro = (Veiculo) obj;
        return Objects.equals(this.placa, outro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
}