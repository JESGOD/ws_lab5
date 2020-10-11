package ejercicios1_servicios;

public class Electrodomesticos extends producto implements interface1 {
    String clasificacionEnergia;
    
     @Override
    public void getMaxCorriente(){
    
    }
    @Override
    public void getVoltajeOperacion(){
    
    }
    
     public Electrodomesticos (){
 
 }
     
      public Electrodomesticos (String clasificacionEnergia ){
          super("123456", "hp", "que le importa", 1.0, 1, false);
          this.clasificacionEnergia = clasificacionEnergia;
 }
}
