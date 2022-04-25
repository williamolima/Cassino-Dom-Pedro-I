package com.cassino.cassinodompredroi.services;

public class Auth {
    private String login;
    private String senha;



    public Boolean Authenticate(){
        // Logica de autenticação aqui... (ainda nao implementado por falta do banco de dados)
        return false;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
