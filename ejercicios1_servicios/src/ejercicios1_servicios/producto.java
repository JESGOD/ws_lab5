package ejercicios1_servicios;


public class producto  {
    
    String identificador, titulo, descripcion;
    double precio;
    int estado;
    boolean esNuevo;

    
   public void cambiarPrecio(){
    }
    
    public void cambiarEstado ( int nuevoEstado){
    
    }
    
    public void editarDescripcion( String nuevaDescripcion){
       
    }
 //   public int getEstado(){
     //    return estado;
    
   // }
    //public void getPrecio(){
    
   // }
    public producto(){
    
    }
    public producto(String identificador, String titulo, String descripcion, double precio,int estado, boolean esNuevo ){
        
    this.descripcion = descripcion;
    this.esNuevo = esNuevo;
    this.estado = estado;
    this.identificador = identificador;
    this.precio = precio;
    this.titulo = titulo;
    }
    /////////////////////////////////get
    public String getIdentificador() {
        return identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getEstado() {
        return estado;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }
 
    //////////////////////////
    
}
