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
public class PuntoUno {
    
    private String input;
    
    public PuntoUno(String input) {
        
        this.input = input;
    }
    
    public boolean validar(){
        
        int size = input.length();
        int index = 0;
        boolean AQ2 = false;
        boolean EstadoAceptacion = true;
        
        // Arranca en Q0
        if(index < size && input.charAt(index) == '0'){
            // Pasa a Q1
            EstadoAceptacion = false;
            index++;
            while(index < size && input.charAt(index) == '0'){
                index++;
            }
            if(index < size && input.charAt(index) == '1'){
                // Pasa a Q2
                AQ2 = true;
            }
        }
        if((index < size && input.charAt(index) == '1') || AQ2 == true){
            // Pasa a Q2
            EstadoAceptacion = true;
            index++;
            
            while(index < size && input.charAt(index) == '0'){
                index++;
                EstadoAceptacion = false;
                // Pasa a Q3
                while(index < size && input.charAt(index) == '0'){
                    // Sigue en Q3
                    index++;
                }
                if(index < size && input.charAt(index) == '1'){
                    // Pasa a Q0,Q2
                    index++;
                    EstadoAceptacion = true;
                    
                    while((index < size && input.charAt(index) == '0')){
                        // Pasa a Q1,Q3
                        index++;
                        EstadoAceptacion = false;
                        
                        while(index < size && input.charAt(index) == '0'){
                            // Sigue en Q1,Q3
                            index++;
                        }
                        if(index < size && input.charAt(index) == '1'){
                            // Pasa a Q0,Q2
                            index++;
                            EstadoAceptacion = true;
                        }
                    }
                    if(index < size && input.charAt(index) == '1'){
                        // Pasa a Q2
                        index++;
                        EstadoAceptacion = true;
                    }
                }
            }
            if(index < size && input.charAt(index) == '1'){
                // Pasa a vacio
                EstadoAceptacion = false;
            }
        }
        
        return EstadoAceptacion;
    }
}
