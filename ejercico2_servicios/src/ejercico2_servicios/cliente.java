package ejercico2_servicios;

import java.util.Scanner;


public class cliente extends persona {
    String numCuenta, tipoDeIdentificacion, numIdentificacion;
    String tipoDeCliente;
    
////////////////////////////// constructor ///////////////////

    public cliente(String nombre, String apellido, String genero, String edad) {
        super(nombre, apellido, genero, edad);
    }

    
    public cliente(String numCuenta, String tipoDeIdentificacion, String numIdentificacion, String tipoDeCliente, String nombre, String apellido, String genero, String edad) {
        super(nombre, apellido, genero, edad);
        this.numCuenta = numCuenta;
        this.tipoDeIdentificacion = tipoDeIdentificacion;
        this.numIdentificacion = numIdentificacion;
        this.tipoDeCliente = tipoDeCliente;
    }
    
////////////////////////// fin constructor inicio get and set //////////////////////////////

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoDeIdentificacion() {
        return tipoDeIdentificacion;
    }

    public void setTipoDeIdentificacion(String tipoDeIdentificacion) {
        this.tipoDeIdentificacion = tipoDeIdentificacion;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getTipoDeCliente() {
        return tipoDeCliente;
    }

    public void setTipoDeCliente(String tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
    }
    
    ////////////// fin sett and gett //////////////////////7
    
    public String defineTipoCliente(){
        int option;
        String tipo;
        Scanner entrada1 = new Scanner(System.in);
        
       // do{
            option = entrada1.nextInt();
            switch (option){
                case 1: 
                    
                   tipoDeIdentificacion = "cedula";
                   tipo = "persona natural";
                    return tipo;
                    //break;
                case 2: 
            
                    tipoDeIdentificacion = "nit";
                    tipo = "persona empresa"; 
                    return tipo;
       
                    //break;
                case 3:
            
                    tipoDeIdentificacion = "identificador de sociedad";
                    tipo = "persona en sociedad";
                    return tipo;
        
                    //break;
            } 
       
       // }while(option != 4);
        return null;
    }
}
