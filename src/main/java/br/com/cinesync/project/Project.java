/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.cinesync.project;

import br.com.cinesync.project.Utils.Conexao;
import br.com.cinesync.project.Views.SplashScreenView;
import java.sql.SQLException;

/**
 *
 * @author Csarp
 */
public class Project {

    public static void main(String[] args) throws SQLException {
        System.out.println("Este é o início do Sistema CineSync! Feito exclusivamente por César Rodrigues Ribeiro - @Cluwt no GitHub");
        System.out.println("--------------------------------------------------------------------------------------------------------");
                
        // Teste de conexão com o banco de dados:
        Conexao.obterConexao();
        
        // Abertura no main para abrir o SplashScreen e iniciar o sistema em si:
        SplashScreenView SplashScreenView = new SplashScreenView();
        SplashScreenView.setVisible(true);
        
        
    }
}
