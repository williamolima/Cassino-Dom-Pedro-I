package com.cassino.cassinodompredroi.services;

import com.cassino.cassinodompredroi.models.Cliente;

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
    public Cliente  getClienteLogado(){
        // O que eu pensei nesse metodo era retornar o cliente logado, esse metodo pesquisaria no banco e retornava o cliente pelo login e senha dele
        // com esse metodo poderiamos ter uma instancia de um cliente logado, para todas as vezes que alternar entre as paginas
        // conseguiriamos fazer o controller checar esse cliente para renderizar a pagina de acordo com essa instacia do cliente logado

        // a função ta incompleta mas a ideia é que caso o usuário seja null, a gente meio que 
        // consegue NÂO retornar as paginas nos controllers, e sempre dar redirect para /login
        Cliente usuario = null;
        return usuario;
    }
}
