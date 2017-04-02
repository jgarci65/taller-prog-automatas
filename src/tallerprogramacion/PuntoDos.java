/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacion;

/**
 *
 * @author Administrador
 */
public class PuntoDos {

    private String input;
    
    public PuntoDos(String input) {
        
        this.input = input;
    }
    
    public boolean validar(){
        
        int size = input.length();
        int index = 0;
        boolean EstadoAceptacion = true;
        
        if(index < size && input.charAt(index) == 'b'){
            // Para a Q4
            index++;
            if(index < size && input.charAt(index) == 'b'){
                // Para a Q3
                while(index < size && input.charAt(index) == 'b'){
                    index++;
                }
                if(index < size && input.charAt(index) == 'a'){
                    // Pasa a Q1
                    index++;
                    if(index < size && input.charAt(index) == 'a'){
                        // Pasa a Q2
                        while(index < size && (input.charAt(index) == 'a' || input.charAt(index) == 'b')){
                            index++;
                        }
                    }
                    else if(index < size){
                        // Pasa a vacio
                        EstadoAceptacion = false;
                    }
                }
            }
            else if(index < size && input.charAt(index) == 'a'){
                // Pasa a Q2
                while(index < size && (input.charAt(index) == 'a' || input.charAt(index) == 'b')){
                    index++;
                }
            }
            
            if(index != size){
                EstadoAceptacion = false;
            }
        }
        else{
            // Pasa a vacio
            EstadoAceptacion = false;
        }
        return EstadoAceptacion;
    }
}
