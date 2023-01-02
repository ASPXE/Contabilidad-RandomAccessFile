package com.mycompany.LibroMayor;

import com.mycompany.LibroDiario.LibroDiario;
import com.mycompany.MenuPrincipal.MenuPrincipal;
import java.io.*;

/**
 *
 * @author aspxe
 */
public class LibroMayor {

    public int cuentaNum;
    public String tituloCuenta;
    public String mes;
    public double montoMes;

    //Constructor vacio
    public LibroMayor() {

    }

    //Constructor con todas las variables
    public LibroMayor(int cuentaNum, String tituloCuenta, String mes, double montoMes) {
        this.cuentaNum = cuentaNum;
        this.tituloCuenta = tituloCuenta;
        this.mes = mes;
        this.montoMes = montoMes;
    }

    //Metodo grabar, recibe como parametro el archivo en el que vamos a escribir los datos
    public void grabarLibroMayor(RandomAccessFile file) throws IOException{
        /**
         * El orden para grabar el registro es el mismo orden que estan
         * declarados Registro de longitud fija Campos de longitud fija
         *
         */
        
        //Escribimos cuentaNum
        file.writeInt(this.cuentaNum);
        
        //Solo el string lo convertimos a bytes. Escribimos tituloCuenta
        byte tituloCuentaBytes[] = new byte[30];//La longitud fija sera de 30.
        this.tituloCuenta.getBytes(0, this.tituloCuenta.length(), tituloCuentaBytes, 0);
        file.write(tituloCuentaBytes);
        
        //Escribimos mes
        byte mesBytes[] = new byte[30];
        this.mes.getBytes(0, this.mes.length(), mesBytes, 0);
        file.write(mesBytes);
        
        //Escribimos montoMes
        file.writeDouble(this.montoMes);

    }
    
    //Metodo leer, recibe como parametro el archivo que se va a leer.
    public void leerLibroMayor(RandomAccessFile file) throws IOException{
        /*
        Al igual que en el metodo grabar es importante respetar el orden de como
        se declararon los atributos de la clase para ser escritos, para este metodo
        leer es importante leer el contenido en el mismo orden que los atributos fueron
        escritos.
        */
        
        //Leemos cuentaNum
        this.cuentaNum = file.readInt();
        
        //Reconstruimos el string apartir de los bytes. Leemos tituloCuenta
        byte tituloCuentaByte[] = new byte[30]; //Importante que el arreglo de bytes sea de la misma longitud que el del metodo grabar.
        file.readFully(tituloCuentaByte);
        this.tituloCuenta = new String(tituloCuentaByte);
        
        //Reconstruimos el string a partir de los bytes. Leemos mes
        byte mesByte[] = new byte[30];
        file.readFully(mesByte);
        this.mes = new String(mesByte);
        
        //Leemos montoMes
        this.montoMes = file.readDouble();
        
    }

    //Metodos get y set de las variables de la clase
    public int getCuentaNum() {
        return this.cuentaNum;
    }

    public void setCuentaNum(int cuentaNum) {
        this.cuentaNum = cuentaNum;
    }

    public String getTituloCuenta() {
        return this.tituloCuenta;
    }

    public void setTituloCuenta(String tituloCuenta) {
        this.tituloCuenta = tituloCuenta;
    }

    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getMontoMes() {
        return this.montoMes;
    }

    public void setMontoMes(double montoMes) {
        this.montoMes = montoMes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroMayor{");
        sb.append("cuentaNum=").append(this.cuentaNum);
        sb.append(", tituloCuenta=").append(this.tituloCuenta);
        sb.append(", mes=").append(this.mes);
        sb.append(", montoMes=").append(this.montoMes);
        sb.append('}');
        return sb.toString();
    }

}
