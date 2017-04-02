/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacion;

/**
 *
 * @author javierg.garcia
 */
public class PuntoCuatro {

    private String input;
    
    public PuntoCuatro(String input) {
        this.input = input;
    }
    
    public boolean validar(){
        
        int size = input.length();
        int index = 0;
        boolean EstadoAceptacion = false;
        
        // Arranca en Q0
        if(index < size && input.charAt(index) == 'b'){
            // Pasa a Q1
            index++;
            while(index < size && input.charAt(index) == 'a'){
                // Siguie en Q1
                index++;
            }
            if(index < size && input.charAt(index) == 'b'){
                // Pasa a Q2
                index++;
                EstadoAceptacion = true;
                if(index < size && input.charAt(index) == 'b'){
                    // Pasa a Q4,Q2,Q3
                    index++;
                    while(index < size && input.charAt(index) == 'b'){
                        // Sigue en Q4,Q2,Q3
                        index++;
                    }
                    if(index < size && input.charAt(index) == 'a'){
                        // Pasa a vacio
                        index++;
                        EstadoAceptacion = false;
                    }
                }
                else if(index < size && input.charAt(index) == 'a'){
                    // Pasa a vacio
                    index++;
                    EstadoAceptacion = false;
                }
            }    
        }
        return EstadoAceptacion;
    }
}
