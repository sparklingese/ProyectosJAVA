/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicalaboratorio;
import java.util.Scanner;
/**
 *
 * @author UFG
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        int confirmacion;
        double venta, descuento, iva, total;
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("¿Se realizaron mas de 3 compras?\nSi = 1 / No = 0");
        confirmacion = data.nextInt();
        
        if(confirmacion == 1){
            System.out.println("Cuanto es el valor total de la venta: ");
            venta = data.nextDouble();
            
            if(venta > 0 && venta <10000){
                iva = venta + (venta*0.13);
                descuento = venta - (venta*0.025);
                total = descuento + (descuento*0.13);
                
                System.out.println("Ya que la compra fue menor a $10,000 los datos quedan asi:\nTotal de la Venta: $"+venta+"\nTotal de la Venta con IVA: $"+iva+"\nVenta con descuento 2.5%: $"+descuento+"\nVenta con descuento e IVA: $"+total);
            }
            else if(venta > 10000 && venta < 19999){
                iva = venta + (venta*0.13);
                descuento = venta - (venta*0.04);
                total = descuento + (descuento*0.13);
                
                System.out.println("Ya que la compra fue mayor a $10,000y menor que $19,999 los datos quedan asi:\nTotal de la Venta: $"+venta+"\nTotal de la Venta con IVA: $"+iva+"\nVenta con descuento 4%: $"+descuento+"\nVenta con descuento e IVA: $"+total);
            }
            else if(venta > 20000 && venta < 40000){
                iva = venta + (venta*0.13);
                descuento = venta - (venta*0.07);
                total = descuento + (descuento*0.13);
                
                System.out.println("Ya que la compra fue mayor a $20,000 y menor que $40,000 los datos quedan asi:\nTotal de la Venta: $"+venta+"\nTotal de la Venta con IVA: $"+iva+"\nVenta con descuento 7%: $"+descuento+"\nVenta con descuento e IVA: $"+total);
            }
            else{
                iva = venta + (venta*0.13);
                descuento = venta - (venta*0.1);
                total = descuento + (descuento*0.13);
                
                System.out.println("Ya que la compra fue mayor a $40,000 los datos quedan asi:\nTotal de la Venta: $"+venta+"\nTotal de la Venta con IVA: $"+iva+"\nVenta con descuento 10%: $"+descuento+"\nVenta con descuento e IVA: $"+total);
            }
        }
        else{
            System.out.println("El usuario no forma parte de un descuento");
        }
    }
}
