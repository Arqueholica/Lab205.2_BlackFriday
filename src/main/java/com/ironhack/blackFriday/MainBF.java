package com.ironhack.blackFriday;

public class MainBF {
    public static void main(String[] args) {

/*
(medio) Llega Black Friday en tu tienda online de teléfonos móviles
y decides ofrecer un 20% de descuento en todos tus productos.

Instancia algunos móviles para probar.

El descuento se aplica en todos, (static) así que debes poder mostrar el precio antiguo
y el precio con descuento.

+EXTRA: posibilidad de anular el descuento a todos los productos después del Black Friday,
mediante méthod a tal propósito
 */

        Mobilephone mobile1 = new Mobilephone("Apple","27.5", 12560, true);
        Mobilephone mobile2 = new Mobilephone("Motorla","Hello Moto", 12, false);
        Mobilephone mobile3 = new Mobilephone("Nokia","3310", 30, false);
        Mobilephone mobile4 = new Mobilephone("Oppo","Find X", 1851, true);

        System.out.println("Mobile Phone: " + mobile1.getMarca() + " " + mobile1.getModelo() + "\n" + Mobilephone.descuento(mobile1.getPrice()) + "\n");
        System.out.println("Mobile Phone: " + mobile2.getMarca() + " " + mobile2.getModelo() + "\n" + Mobilephone.descuento(mobile2.getPrice()) + "\n");
        System.out.println("Mobile Phone: " + mobile3.getMarca() + " " + mobile3.getModelo() + "\n" + Mobilephone.descuento(mobile3.getPrice()) + "\n");
        System.out.println("Mobile Phone: " + mobile4.getMarca() + " " + mobile4.getModelo() + "\n" + Mobilephone.descuento(mobile4.getPrice()) + "\n");





    }
}
