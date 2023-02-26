/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class archivo {
    File archivo;
    ventanaContactos ventana;
    
    public void crearArchivo(){
        archivo = new File("datos.txt");
        if(archivo.exists()){
        
        }else{
            try {
                if(archivo.createNewFile()){
                    
                }
            } catch (IOException ex) {
                System.out.println("No se ha podido crear el archivo "+ex);
            }
        }
        
    }
    
    public void guardarTexto(String nombre, String correo, String numero){
        String nombreContacto=nombre, correoContacto=correo, numeroContacto=numero;
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.write(nombreContacto+"%"+correoContacto+"%"+numeroContacto+"\r\n");
            escritor.close();
        } catch (IOException ex) {
            System.out.println("No se pudo escribir en el documento"+ex);     
        }
    }
    
    
    
    

    
}
