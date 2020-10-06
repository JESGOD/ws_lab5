/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


public class ws_logica_tienda {
    public String consultarClientes(){
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
        return coleccionTienda.find().first().toJson();
 //("mongodb://usuario:password@93.188.167.110:27017/?authSource=nombre_bd");
    }
    public void eliminarUnDocumento( String _id){
 
        MongoClient cliente; 
        MongoClientURI uri = new MongoClientURI("mongodb://userLab5:passworduserLab5@93.188.167.110:27017/?authSource=lab5");
        cliente = new MongoClient(uri);
    
        MongoDatabase db;
        db = cliente.getDatabase("lab5");
        
        MongoCollection<Document> coleccionTienda = db.getCollection("categorias");
        coleccionTienda.deleteOne(eq("_id", new ObjectId("5f78a32887ce07f587cbbaa4")));
        
       
    }
}
