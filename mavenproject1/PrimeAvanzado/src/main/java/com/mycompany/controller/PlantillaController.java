
package com.mycompany.controller;

import com.mycompany.model.Usuario;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PlantillaController implements Serializable{
    
    
    public void verificarSesion(){
        try{
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario us = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
            
            if(us==null){
               context.getCurrentInstance().getExternalContext().redirect("./../permisos.xthml");
                
            }
        }catch(Exception e){
            //log para guardaar algun registro de un eerror
            
        }
        
    }
}
