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
    ws_logica_tienda miTienda = new ws_logica_tienda();
    @Context
    private UriInfo context;

    public Ws_tienda() {
        
    }
    
    @GET
    @Path("consultarClientes")
    @Produces({"applicaction/json"})
    
    public String consultarClientes(){
        
        return miTienda.consultarClientes();
       
    }
    
    @DELETE
    @Path("eliminarUnDocumento/_id/{_id}")
    //@Produces({"applicaction/json"})
    public void eliminarUnDocumento(@PathParam("_id") String _id){
        miTienda.eliminarUnDocumento("ObjectId(\"5f78a32887ce07f587cbbaa4\")");
       // ObjectId("5f78a32887ce07f587cbbaa4")
    }
}
