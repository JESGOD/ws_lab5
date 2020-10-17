/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.MongoQueryException;
import com.mongodb.MongoSecurityException;
import com.mongodb.MongoSocketOpenException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Aggregates.sort;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Sorts;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


public class ws_logica_tienda {
    
    public String consultarPrimerCliente(){
        // creando cliente para la coneccion al servidor remoto
        try {
            MongoClient cliente;
            MongoClientURI uri = new MongoClientURI("mongodb://userLab5:passworduserLab5@93.188.167.110:27017/?authSource=lab5RR");
            cliente = new MongoClient(uri);
            MongoDatabase db;
            db = cliente.getDatabase("lab5");
            MongoCollection<Document> coleccionTienda = db.getCollection("clientes");
         
            return coleccionTienda.find().first().toJson();
        }catch(Exception e){
            String cadena;
            cadena  = String.valueOf(e);
            if ( cadena == "MongoSecurityException"){
                return "error al intentar conectarse al servidor";
            }else {
                if (cadena == "java.lang.NullPointerException"){
                    return "error al intentar encontrar la coleccion";
                }
            }
            return cadena;
        }
         
 
    }
    
    
    ///////////////////////////////////////////////////7///
    
    public String consultarUltimoCliente(){  
        // creando cliente para la coneccion al servidor remoto
        MongoClient cliente;
        // la URI es una ruta la cual contiene datos para conectarse  en este caso al servidor 
        MongoClientURI uri = new MongoClientURI("mongodb://userLab5:passworduserLab5@93.188.167.110:27017/?authSource=lab5");
        cliente = new MongoClient(uri);
        // creamos objeto tipo MongoDatabase para conectarse y obtener la informacion de la base de datos que se encuentra en el servidor
        MongoDatabase db;
        db = cliente.getDatabase("lab5");
        // obtenemos la collecion y retornamos el la coleccion clientes
        MongoCollection<Document> coleccionTienda = db.getCollection("clientes");
        //coleccionTienda.find(sort(Sorts.descending("codigo")));
        
         return coleccionTienda.find().sort(Sorts.descending("_id")).first().toJson();

    }
    
    ////////////////////////////////////////////
    
    public String eliminarUnDocumento( String id){
 
        MongoClient cliente; 
        MongoClientURI uri = new MongoClientURI("mongodb://userLab5:passworduserLab5@93.188.167.110:27017/?authSource=lab5");
        cliente = new MongoClient(uri);
    
        MongoDatabase db;
        db = cliente.getDatabase("lab5");
        MongoCollection<Document> coleccionTienda = db.getCollection("masVendidos");
        coleccionTienda.deleteOne(eq("_id", new ObjectId(id))); 
        
        return "";
    }
    
    
    public String actualizarUnDocumento( String id, String nombre, String correo){
 
        MongoClient cliente; 
        MongoClientURI uri = new MongoClientURI("mongodb://userLab5:passworduserLab5@93.188.167.110:27017/?authSource=lab5");
        cliente = new MongoClient(uri);
    
        MongoDatabase db;
        db = cliente.getDatabase("lab5");
        MongoCollection<Document> coleccionTienda = db.getCollection("clientes");
        coleccionTienda.updateOne(eq("_id", new ObjectId(id)), combine(set("nombre", nombre), set("correo", correo)));
        
        
        return "";
    }
    public String consultarLosUltimos5Documentos (){
    
        MongoClient cliente;
        MongoClientURI uri = new MongoClientURI("mongodb://userLab5:passworduserLab5@93.188.167.110:27017/?authSource=lab5");
        cliente = new MongoClient(uri);
        
        MongoDatabase db;
        db = cliente.getDatabase("lab5");
         MongoCollection<Document> coleccionTienda = db.getCollection("clientes");
         
        
        
        return coleccionTienda.find().toString();


    }
}    


  
    
   

    