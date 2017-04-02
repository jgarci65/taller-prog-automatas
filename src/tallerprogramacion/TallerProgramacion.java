/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Administrador
 */
public class TallerProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        
        try {
            bw.write("Ingrese el punto a validar (1-4): \n");
            bw.flush();
            String punto = br.readLine();
            
            bw.write("Ingrese la cadena a validar: \n");
            bw.flush();
            String input = br.readLine();
            boolean Resultado = false;
            
            switch(punto){
                case "1":
                    PuntoUno PUno = new PuntoUno(input);
                    Resultado = PUno.validar();
                    break;
                case "2":
                    PuntoDos PDos = new PuntoDos(input);
                    Resultado = PDos.validar();
                    break;
                case "3":
                    PuntoTres PTres = new PuntoTres(input);
                    Resultado = PTres.validar();
                    break;
                case "4":
                    PuntoCuatro PCuatro = new PuntoCuatro(input);
                    Resultado = PCuatro.validar();
                    break;
                default:
                    bw.write("El punto ingresado no existe.\n");
                    bw.flush();
                    break;
                    
            }
            
            if(Resultado == true){
                bw.write("Cadena aceptada\n");
            }
            else{
                bw.write("Cadena rechazada\n");
            }
            bw.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
