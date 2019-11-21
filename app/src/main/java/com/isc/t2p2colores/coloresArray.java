package com.isc.t2p2colores;
import java.util.ArrayList;
public class coloresArray {
    public static ArrayList<String> listaColores=new ArrayList<>();
    public static void agregar(String name){listaColores.add(name);}
    public static ArrayList<String>mostrar(){return listaColores;}
}
