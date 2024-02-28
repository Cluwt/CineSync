/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cinesync.project.Controllers;

import br.com.cinesync.project.DAO.LoginDAO;
import java.sql.SQLException;

/**
 *
 * @author Csarp
 */
public class LoginController {
    private LoginDAO loginDAO;

    public LoginController() throws SQLException {
        this.loginDAO = new LoginDAO();
    }

    public boolean verificarCredenciais(String nomeUsuario, String senha) {
        return loginDAO.verificarCredenciais(nomeUsuario, senha);
    }
}
