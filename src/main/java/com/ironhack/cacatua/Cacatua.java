package com.ironhack.cacatua;

import java.util.Scanner;

public class Cacatua {
    private static String message;
    private String name;

    private static int cantidadMinimaCacahuetes = 100;
    private int buche;

    public Cacatua(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCantidadMinimaCacahuetes() {
        return cantidadMinimaCacahuetes;
    }

    public static void setCantidadMinimaCacahuetes(int cantidadMinimaCacahuetes) {
        Cacatua.cantidadMinimaCacahuetes = cantidadMinimaCacahuetes;
    }
    public int getBuche() {
        return buche;
    }

    public void setBuche(int buche) {
        this.buche = buche;
    }

    public static String pedir(){
        message = "🐦 ¡Cacatúa cacahuetes! 🐦";
       return message;
    };

    public void feed(){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos cacahuetes quieres darle a " + getName() + "?");
        int cacahuetes = sc.nextInt();
        sc.nextLine();

        buche = cacahuetes;

        if(buche == cantidadMinimaCacahuetes){
            System.out.println(getName() + " está satisfecha 🥜");
        }else{
            System.out.println("Cuando " + getName() + " dice '¡Cacatúa cacahuetes!' lo mínimo para que se calle son 100 cacahuetes");
        }
    }




}
