package com.corenetworks.presentacion;

import com.corenotworks.modelo.Empleado;

import java.util.HashSet;
import java.util.Set;

public class InterfaceSet {
    public static void main(String[] args) {
        //probar la interface Set
        HashSet conjuntos=new HashSet();//sin polimorfismo

        Set conjunto1= new HashSet<>();//Recomendable utilizar polimorfismo
        System.out.println("Está vacio? "+conjunto1.isEmpty());
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1);
        conjunto1.add("jardin");
        System.out.println(conjunto1);

        System.out.println("la coleccion contiene el elemento casa? " + conjunto1.contains("casa"));
        System.out.println("numero de elementos "+ conjunto1.size());
        conjunto1.add("silla");
        conjunto1.add("mesa");

        conjunto1.add(5);
        System.out.println(conjunto1);

        Empleado e1=new Empleado(1);
        conjunto1.add(e1);
        System.out.println(conjunto1);
        System.out.println(conjunto1.remove(e1));
        System.out.println(conjunto1);

    }
}
