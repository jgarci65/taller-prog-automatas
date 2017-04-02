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
public class PuntoTres {

    private String input;
    private int index;
    private int size;
    private boolean EstadoAceptacion = false;
    
    public PuntoTres(String input) {
        this.input = input;
    }
    
    public boolean validar(){
        
        size = input.length();
        index = 0;
        
        // Arranca en Q0
        if(index < size && input.charAt(index) == '0'){
            // Pasa a Q2,Q3
            Q2Q3();
        }
        if(index < size && input.charAt(index) == '1'){
            // Pasa a Q1,Q4
            Q1Q4();
        }
        return EstadoAceptacion;
    }
    
    public void Q2Q3(){
        
        index++;
        EstadoAceptacion = true;
        if(index < size && input.charAt(index) == '1'){
            // Pasa a Q2,Q4
            Q2Q4();
        }
        if(index < size && input.charAt(index) == '0'){
            // Pasa a Q1,Q3
            Q1Q3();
        }
    }
    
    public void Q1Q4(){
        
        index++;
        EstadoAceptacion = true;
        if(index < size && input.charAt(index) == '1'){
            // Pasa a Q1,Q3
            Q1Q3();
        }
        if(index < size && input.charAt(index) == '0'){
            // Pasa a Q2,Q4
            Q2Q4();
        }
    }
    
    public void Q2Q4(){
        
        index++;
        EstadoAceptacion = false;
        
        if(index < size && input.charAt(index) == '0'){
            // Pasa a Q1,Q4
            Q1Q4();
        }
        else if(index < size && input.charAt(index) == '1'){
            // Pasa a Q2,Q3
            Q2Q3();
        }
    }
    
    public void Q1Q3(){
        
        EstadoAceptacion = true;
        index++;
        if(index < size && input.charAt(index) == '1'){
            // Pasa a Q1,Q4
            Q1Q4();
        }
        else if(index < size && input.charAt(index) == '0'){
            // Pasa a Q2,Q3
            Q2Q3();
        }
    }
}
