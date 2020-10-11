package ejercicios1_servicios;


public class computador extends producto implements interface1{
    
    String sistemaOperativo;
    
    @Override
    public void getMaxCorriente(){
    
    }
    @Override
    public void getVoltajeOperacion(){
    
    }
    public computador (){
 
    }                 //  String identificador, String titulo, String descripcion, double precio,int estado, boolean esNuevo
    public computador (String identificador, String titulo, String descripcion, double precio,int estado, boolean esNuevo,String sistemaOperativo){
     super("123456", "hp", "que le importa", 1.0, 45, false);
   // super (identificador = "123", titulo = "a", descripcion = "b", precio = 1.9, estado = 4, esNuevo = true);
     this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo; 
    }
    
    
    
 
}
