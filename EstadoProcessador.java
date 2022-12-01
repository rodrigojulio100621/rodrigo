/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoprocessador;

import java.util.ArrayList;
import java.util.Random;

/**
 *  
 * @author rodri
 */ 
public class EstadoProcessador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Verificacoes v = new Verificacoes();
        ValorProcesso[] processos = new ValorProcesso[10];
        int tx[] = {
            10000,
            5000,
            7000,
            3000,
            3000,
            8000,
            2000,
            5000,
            4000,
            10000};
        
        ArrayList<ValorProcesso> listProcessos = new ArrayList<ValorProcesso>();
        Random sort = new Random();
        
        int x =0;
        
        for(int i : tx){
          processos[x] = new ValorProcesso(x, 0, 0, null, 0, 0, i);
          x++;
        }
        
        while(true){
        
             for(ValorProcesso processo: processos){
             
                 int entradaSaida = 0;
                 
                 System.out.println(processo.EP + "------ EXECUTANDO------");
                 processo.EP = "EXECUTANDO";
                 
                 
                 listProcessos.add(processo);
                 
                 
                 if(processo.TP < processo.lIP){
                 
                     processo.TP += 1000;
                     processo.CP = processo.TP + 1;
                     
                 
                 }
                 
                 
                 for(int h=0; h<1000;h++){
                     
                     if(processo.TP < processo.lIP){
                     
                         processo.TP += 1;
                         
                         
                         processo.CP = processo.TP + 1;
                     }else{
                     
                         System.out.println(processo.EP + "------ Pronto------");;
                         processo.EP = "PRONTO";
                         break;
                     
                     }
                     
                     if(sort.nextInt(100) + 1 <= 5){
                     
                         if(processo.EP == "BLOQUEADO"){
                             
                             
                             if(sort.nextInt(100) + 1 <= 30){
                             
                             System.out.println(processo.EP + "------ PRONTO------");
                             processo.EP = "PRONTO";
                             listProcessos.add(processo);
                             
                             
                             }
                     
                        }
                         
                     
                     entradaSaida++;
                     v.entradaSaida(processo);
                     listProcessos.add(processo);
                 
                         
                         
                     }
                     
                 }
                 
                 if(entradaSaida != 0){
                     System.out.println(processo.EP + "------ PRONTO------");
                     processo.EP = "PRONTO";
                     listProcessos.add(processo);
                 }
                 
                 
                 if(processo.EP == "EXECUTANDO"){
                     System.out.println(processo.EP + "------ BLOQUEDO------");
                     
                     processo.EP = "BLOQUEADO";
                 }
                 
                  System.out.printf("%-5s", "PID");
                  System.out.printf("%10s", "IP");
                  System.out.printf("%10s", "CP");
                  System.out.printf("%12s", "EP");
                  System.out.printf("%5s", "NES");
                  System.out.printf("%7s%n", "N_CPU");
                  System.out.printf("%-5s", processo.PID);
                  System.out.printf("%10s", processo.TP);
                  System.out.printf("%10s", processo.CP);
                  System.out.printf("%12s", processo.EP);
                  System.out.printf("%5s", processo.NES);
                  System.out.printf("%7s%n", processo.N_CPU);
                  
                  
             }
             
             
             if(v.verifica(processos)){
              break;
             }
             
           }
        System.out.printf("%-5s", "PID");
        System.out.printf("%10s", "TP");
        System.out.printf("%10s", "CP");
        System.out.printf("%12s", "EP");
        System.out.printf("%5s", "NES");
        System.out.printf("%7s%n", "N_CPU");
        
        for(ValorProcesso vp : processos){
        System.out.printf("%-5s", vp.PID);
        System.out.printf("%10s", vp.TP);
        System.out.printf("%10s", vp.CP);
        System.out.printf("%12s", vp.EP);
        System.out.printf("%5s", vp.NES);
        System.out.printf("%7s%n", vp.N_CPU);
        
        }
        
    }


    
    
}
