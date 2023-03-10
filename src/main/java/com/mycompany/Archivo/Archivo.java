package com.mycompany.Archivo;

import com.mycompany.LibroDiario.LibroDiario;
import com.mycompany.LibroMayor.LibroMayor;
import com.mycompany.MenuPrincipal.MenuPrincipal;

import java.lang.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aspxe
 */
public class Archivo {

    RandomAccessFile file;

    //Agregar libro diario
    public void agregarLibroDiario(String nombreArchivo, LibroDiario ld) {

        try {

            //Creamos un objeto del tipo file
            this.file = new RandomAccessFile(nombreArchivo, "rw");
            this.file.seek(file.length());//Posicionamos el puntero al final del archivo
            ld.getCuentaNum();
            ld.getChequeNum();
            ld.getFecha();
            ld.getDescripcion();
            ld.getCargoOAbono();
            ld.grabarLibroDiario(file);
            /*
            Por alguna razon al tratar de recuperar variables que pertenecen a MenuPrincipal
            mediante un metodo get, este no regresa el valor de dichas variables, sino
            0, 0.0 o null. Crearer una clase exclusiva para que almacene de manera temporal
            los valores que necesito que se escriban para agregarLibroDiario
            */
            
            /*
            ACTUALIZACION: Resolví el problema agregando como parámetro el objeto del tipo
            LibroDiario que estoy manipulando en la clase MenuPrincipal. De manera que en MenuPrincipal
            hago los "set" de la informacion y en este metodo, el "get".
            */
            file.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e);
        }
    }
    
    //Agrega informacion al libro mayor
    public void agregarAlLibroMayor(String nombreArchivo, LibroDiario ld, LibroMayor lm, MenuPrincipal mp) throws IOException{
        
        this.file = new RandomAccessFile(nombreArchivo, "rw");
        this.file.seek(this.file.length());
        ld.getCuentaNum();
        lm.getTituloCuenta();
        lm.getMes();
        ld.getCargoOAbono();
        lm.grabarLibroMayor(file);
        file.close();
        
    }
    
    //Leer informacion de un archivo de libro mayor
    public void reporteLibroMayor(String nombreArchivo) throws IOException{
        file = new RandomAccessFile(nombreArchivo, "r");
        LibroMayor lm = new LibroMayor();
        
        String mensaje = "";
        
        while(file.getFilePointer()<file.length()){
            lm.leerLibroMayor(file);
            mensaje = mensaje + " " + lm.getCuentaNum() + " " + lm.getTituloCuenta() + " " + lm.getMes() + " " + lm.getMontoMes() +"\n";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
        file.close();
    }

    //Leer informacion de un archivo de libro diario
    public void reporteLibroDiario(String nombreArchivo) throws IOException {
        file = new RandomAccessFile(nombreArchivo, "r");
        LibroDiario ld = new LibroDiario();

        String mensaje = "";

        //Recorrer el archivo
        while (file.getFilePointer() < file.length()) {//mientras no llegue al fineal
            ld.leerLibroDiario(file);
            mensaje = mensaje + " " + ld.getCuentaNum() + " " + ld.getChequeNum() + " " + ld.getFecha() + " " + ld.getDescripcion() + " " + ld.getCargoOAbono() + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
        file.close();
    }
    
    public void actualizarLibroDiario(String nombreArchivo, LibroDiario ld) throws IOException{
        
    }

}
