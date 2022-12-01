/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoprocessador;

/**
 *
 * @author rodri
 */
public class ValorProcesso {
     
      int PID,TP,CP,NES,N_CPU,lIP;
      String EP;
    
    
    ValorProcesso(int PID,int TP,int CP,String EP,int NES,int N_CPU,int lIP){
    
        this.PID = PID;
        this.TP = TP;
        this.CP = CP;
        this.EP = EP;
        this.NES = NES;
        this.N_CPU = N_CPU;
        this.lIP = lIP;
        
    }
    
}
