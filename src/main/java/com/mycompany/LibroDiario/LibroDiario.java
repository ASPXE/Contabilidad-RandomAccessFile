package com.mycompany.LibroDiario;

import com.mycompany.ActualizarLibroDiario.ActualizarLibroDiario;
import com.mycompany.MenuPrincipal.MenuPrincipal;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aspxe
 */
public class LibroDiario{
    
    public int cuentaNum;
    public int chequeNum;
    public String fecha;
    public String descripcion;
    public double cargoOAbono;
    
    /*
    LibroMayor y LibroDiario comparten un atributo, el cual es "cuentaNum", pero al ser
    solo uno he decidido que LibroDiario no será una clase hija de LibroMayor porque los demás
    atributos no van a ser de ninguna utilidad. Solucionaré el posible error de 
    que "cuentaNum" pueda no existir en alguna instancia de ambas clases obligando
    al usuario a que ingrese "cuentaNum". Si que si, educando al usuario XD.
    */
    
    //Constructor vacio
    public LibroDiario(){
        
    }
    
    //Constructor con todas las variables
    public LibroDiario(int cuentaNum, int chequeNum, String fecha, String descripcion, double cargoOAbono){
        this.cuentaNum = cuentaNum;
        this.chequeNum = chequeNum;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cargoOAbono = cargoOAbono;
    }
    
    //Metodo grabar, recibe como parametro el archivo en el que se va a escribir
    public void grabarLibroDiario(RandomAccessFile file) throws IOException{
        /**
         * El orden para grabar el registro es el mismo orden que estan
         * declarados Registro de longitud fija Campos de longitud fija
         *
         */
        //Escribimos cuentaNum
        file.writeInt(this.cuentaNum);
        
        //Escribimos chequeNum
        file.writeInt(this.chequeNum);
        
        //Escribimos la fecha. Convertimos el string a bytes
        byte fechaBytes[] = new byte[30]; //30 será la longitud fija
        this.fecha.getBytes(0, this.fecha.length(), fechaBytes, 0);
        file.write(fechaBytes);
        
        //Escribimos la descripcion. Convertimos el string a bytes
        byte descripcionBytes[] = new byte[30];
        this.descripcion.getBytes(0, this.descripcion.length(), descripcionBytes, 0);
        file.write(descripcionBytes);
        
        //Escribimos cargoOAbono
        file.writeDouble(this.cargoOAbono);
    }
    
    //Metodo leer, recibe como parametro el archivo que se va a leer
    public void leerLibroDiario(RandomAccessFile file) throws IOException{
        /*
        Es importante leer el archivo en el mismo orden que declaramos las variables de la clase
        */
        
        //Leemos cuentaNum
        this.cuentaNum = file.readInt();
        
        //Leemos chequeNum
        this.chequeNum = file.readInt();
        
        //Leemos fecha, reconstruimos el string a partir de los bytes
        byte fechaByte[] = new byte[30]; //Importante que sea de la misma longitud fija
        file.readFully(fechaByte);
        this.fecha = new String(fechaByte);
        
        //Leemos descripcion
        byte descripcionByte[] = new byte[30];
        file.readFully(descripcionByte);
        this.descripcion = new String(descripcionByte);
        
        //Leemos cargoOAbono
        this.cargoOAbono = file.readDouble();
        
    }
    
    //Metodo para validar que existe un libro diario de un año especifico
    public boolean libroDiarioExiste(String nombreArchivo, ActualizarLibroDiario ald){
        
        if(nombreArchivo.contains(ald.getYear())){
            return true;
        }else{
            return false;
        }
        
    }
    
    //Metodo que actualiza la informacion de un libro existente
    public void actualizarLibroDiario(RandomAccessFile file) throws IOException{
        
    }
    
    public int getCuentaNum(){
        return this.cuentaNum;
    }
    
    public void setCuentaNum(int cuentaNum){
        this.cuentaNum = cuentaNum;
    }

    public int getChequeNum() {
        return this.chequeNum;
    }

    public void setChequeNum(int chequeNum) {
        this.chequeNum = chequeNum;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCargoOAbono() {
        return this.cargoOAbono;
    }

    public void setCargoOAbono(double cargoOAbono) {
        this.cargoOAbono = cargoOAbono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroDiario{");
        sb.append("cuentaNum=").append(this.cuentaNum);
        sb.append(", chequeNum=").append(this.chequeNum);
        sb.append(", fecha=").append(this.fecha);
        sb.append(", descripcion=").append(this.descripcion);
        sb.append(", cargoOAbono=").append(this.cargoOAbono);
        sb.append('}');
        return sb.toString();
    }

     
}
