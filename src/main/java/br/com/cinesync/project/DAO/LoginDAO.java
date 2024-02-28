/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cinesync.project.DAO;

import br.com.cinesync.project.Utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private Connection conexao;

    public LoginDAO() throws SQLException {
        this.conexao = Conexao.obterConexao();
    }

    public boolean verificarCredenciais(String nomeUsuario, String senha) {
        // Início do método para verificar as credênciais:
        boolean credenciaisValidas = false;
        
        // Comando sql para fazer o SELECT:
        String sql = "SELECT * FROM Usuarios WHERE Nome = ? AND Senha = ?";

        // Try-catch ára 
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nomeUsuario);
            ps.setString(2, senha);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Se houver resultados, as credenciais são válidas
                    credenciaisValidas = true;
                    
                    // Abrir a view depois de login (implementar depois):
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Retornar o verdadeiro caso o usuário e senha sejam compativeis e gerem uma linha:
        return credenciaisValidas;
    }
}
