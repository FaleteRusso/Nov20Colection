package com.corenetworks.presentacion;

import com.corenotworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarList {
    public static void main(String[] args) {
        List lista = new ArrayList();
        System.out.println("Numero de elementos-> " + lista.size());
        System.out.println("está vacia la lista -> " + lista.isEmpty());
        lista.add("casa");
        lista.add("casa");
        System.out.println(lista);
        System.out.println("contiene el String casa? ->" + lista.contains("casa"));
        lista.add(7);
        System.out.println("Obtener el elemento 0 -> " + lista.get(0));
        lista.set(0, "piso");
        System.out.println(lista);
        lista.set(0, "adosado");
        System.out.println(lista);
        System.out.println("posicion del elemento numerico 7 -> " + lista.indexOf(7));
        lista.remove("adosado");
        System.out.println(lista);

        Empleado e1 = new Empleado(6);
        lista.add(e1);
        System.out.println(lista);
        System.out.println("Recorrer con un bucle");

        for (Object elemento : lista
        ) {
            System.out.println(elemento.toString());
        }
        System.out.println("Recorrer con un bucle");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //declarar un Array de 5 elementos y recorrerlo
        int[] miArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }


            //Declarar un Arraylist de 5 elementos y recorrerlo
            ArrayList miArrayList = new ArrayList<>();
            miArrayList.add("c");
            miArrayList.add("b");
            miArrayList.add("d");
            miArrayList.add("j");
            miArrayList.add("z");

            for (int i = 0; i < miArrayList.size(); i++) {
                System.out.println(miArrayList.get(i));


            }
        }
    }


