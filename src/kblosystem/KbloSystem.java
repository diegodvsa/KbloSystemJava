/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kblosystem;
import Telas.*;

/**
 *
 * @author ddevesa
 */
public class KbloSystem {

    
    public static void main(String[] args) {
        Login lg = new Login();
        lg.setVisible(true);
    }
    
    public static void setOpcao(boolean opt){
        opcao = opt;
    }
    
    public static boolean opcao;
    public static String pergunta = "Deseja realmente sair do programa?";
    
    public static void sairDoPrograma(String pergunta)
    {
        Telas.Dialogo dg = new Telas.Dialogo(pergunta);
        dg.setVisible(true);
        
        sair();
    }
    
    private static void sair()
    {
        if(opcao)
            System.exit(0);
    }
    
    public static void sairDoPrograma()
    {
        Telas.Dialogo dg = new Telas.Dialogo(pergunta);
        dg.setVisible(true);
        
        if(opcao)
            System.exit(0);        
    }
}
