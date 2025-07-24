package com.ironhack.cacatua;



public class MainCacatua {
    public static void main(String[] args) {
        /*

Tu amiga cacatúa está de vuelta!
Tienes la clase Cacatua con un méthod static que cuando le llamas dice "Cacatúa cacahuete!".
También tiene una variable estatica: cantidadMinimaCacahuetes = 100;
Mostrar en un system.out lo siguiente:
"la cacatúa se llama X (su nombre), dice 'Cacatúa cacahuete!'
y lo mínimo para que se calle son 100 cacahuetes"
         */
Cacatua josefa = new Cacatua("Josefa");
//        System.out.println(josefa.getName());
//        josefa.feed();

       while(josefa.getBuche() != Cacatua.getCantidadMinimaCacahuetes()){

          System.out.println(Cacatua.pedir());
           josefa.feed();
       };


    }
}
