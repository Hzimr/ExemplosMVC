package com.mvc.modelo;

/**
 *
 * @author HzimR
 */
public class Modelo {
    private String usuario ="dellead";
    private String senha = "123456";
    public boolean validarLogin(String usuario, String senha) {
        return this.usuario.equalsIgnoreCase(usuario) && this.senha.equalsIgnoreCase(senha)? true : false;
    }
}
