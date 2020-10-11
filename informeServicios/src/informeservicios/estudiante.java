package informeservicios;


public class estudiante extends persona {
    float nota1, nota2, nota3, suma, notaTotal;

    public estudiante() {
    }

    
    
    

    public estudiante(String nombre, String apellido, int cedula, float nota1, float nota2, float nota3, float notaTotal) {
       super(nombre, apellido, cedula);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaTotal = notaTotal;
    }

   
    
    
}
