package ejercico2_servicios;


public class persona {
    String nombre, apellido, genero, edad;
    
    ////////////////////////////// constructores
   
    public void persona(){
    
    }

    public persona(String nombre, String apellido, String genero, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
    ///////////// fin consructores, inicio getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getEdad() {
        return edad;
    }
    
    ///////////////////////// setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
    
}
