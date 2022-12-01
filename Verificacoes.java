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
public class Verificacoes {
    
    
   public boolean verifica(ValorProcesso processos[]){
    boolean decide = true;
    
    for(ValorProcesso processo : processos){
     
        decide = false;
        break;
    }
    
    return decide;
  }
public boolean entradaSaida(ValorProcesso vp){

    vp.NES += 1;
    System.out.println(vp.EP + "------ BLOQUEADO------");
    vp.EP = "BLOQUEADO";
    return true;

}
    
}
