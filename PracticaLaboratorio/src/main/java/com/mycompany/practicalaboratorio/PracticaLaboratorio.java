/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicalaboratorio;
import java.util.Scanner;
/**
 *
 * @author UFG
 */
public class PracticaLaboratorio {

    public static void main(String[] args) {
        double nota1,nota2,nota3,promedio,pago;
        double mensualidad = 500;
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("Ingrese la Primer nota: ");
        nota1 = data.nextDouble();
        System.out.println("Ingrese la Segunda nota: ");
        nota2 = data.nextDouble();
        System.out.println("Ingrese la Tercer nota: ");
        nota3 = data.nextDouble();
        
        promedio = (nota1+nota2+nota3)/3;
        
        if(promedio >= 8.5){
            pago = mensualidad-(mensualidad*0.3);
            System.out.println("Gracias a que su promedio es de: "+promedio+" Se le hara un descuento del 30% al pago de su mensualidad\nEl total a pagar es de: $"+pago);
        }
        else{
            pago = mensualidad+(mensualidad*0.13);
            System.out.println("Gracias a que su promedio es de: "+promedio+" No se le hara un descuento en cambio se le cobrara el precio normal más el IVA\nEl total a pagar es de: $"+pago);
        }
        
    }
}
