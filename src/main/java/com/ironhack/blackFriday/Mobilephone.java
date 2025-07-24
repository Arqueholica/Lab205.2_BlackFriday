package com.ironhack.blackFriday;

public class Mobilephone {
    private String marca;
    private String modelo;
    private int price;
    private boolean hasAI;

    public Mobilephone(String marca, String modelo, int price, boolean hasAI) {
        this.marca = marca;
        this.modelo = modelo;
        this.price = price;
        this.hasAI = hasAI;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHasAI() {
        return hasAI;
    }

    public void setHasAI(boolean hasAI) {
        this.hasAI = hasAI;
    }

    public static String descuento(int precio){
        double desc = (double)precio * 0.20;
        double precioConDesc = precio - desc;

        return "El precio anterior era de " + precio + "\n" + "El precio actual es de " + precioConDesc + "\n";
    }

    @Override
    public String toString() {
        return "MOBILEPHONE" + "\n" +
                "brand: " + marca + "\n" +
                "model: " + modelo + "\n" +
                "price: " + price + "\n" +
                "has Ai? " + hasAI + "\n";
    }
}
