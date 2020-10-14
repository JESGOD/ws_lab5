/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ws_logica_tienda;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.bson.conversions.Bson;

/**
 * REST Web Service
 *
 * @author zambo
 */
@Path("ws_tienda")
public class Ws_tienda {
    
    @Context
    private UriInfo context;

    public Ws_tienda() {
        
    }
    
    @GET
    @Path("consultarPrimerCliente")
    @Produces({"applicaction/json"})
    
    public String consultarPrimerCliente(){
        ws_logica_tienda miTienda = new ws_logica_tienda();
        return miTienda.consultarPrimerCliente();
       
    }
    
    /////////////////////////////////////
    
    @GET
    @Path("consultarUltimoCliente")
    @Produces({"applicaction/json"})
    
    public String consultarUltimoCliente(){
        ws_logica_tienda miTienda = new ws_logica_tienda();
        return miTienda.consultarUltimoCliente();
       
    }
    
    //////////////////////////////////////////
    @GET
    @Path("consultarUltimos5Clientes")
    @Produces({"applicaction/json"})
    
    public String consultarUltimos5Clientes(){
        ws_logica_tienda miTienda = new ws_logica_tienda();
        return miTienda.consultarLosUltimos5Documentos();
       
    }
    
    
    
    @GET
    @Path("eliminarUnDocumento/id/{id}")
    @Produces({"applicaction/json"})
    public void eliminarUnDocumento(@PathParam("id") String id){
        ws_logica_tienda miTienda = new ws_logica_tienda();
        miTienda.eliminarUnDocumento(id);
       // ObjectId("5f78a32887ce07f587cbbaa4")
    }
    
    @GET
    @Path("actualizarUnDocumento/id/{id}/nombre/{nombre}/correo/{correo}")
    @Produces({"applicaction/json"})
    public void actualizarUnDocumento(@PathParam("id") String id, @PathParam("nombre") String nombre, @PathParam("correo") String correo ){
        ws_logica_tienda miTienda = new ws_logica_tienda();
        miTienda.actualizarUnDocumento(id, nombre, correo);
       // 5f789cbd87ce07f587cbba96   
    }
}
