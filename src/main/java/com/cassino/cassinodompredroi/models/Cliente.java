package com.cassino.cassinodompredroi.models;

import java.util.Date;
import java.util.List;

public class Cliente {
  
  private String Nome;
  private Date DataDeNascimento;
  private String Cpf;
  private List<Aposta> Favoritos;

  public String getNome() {
    return Nome;
  }

  public void setNome(String nome) {
    Nome = nome;
  }

  public List<Aposta> getFavoritos() {
    return Favoritos;
  }

  public void setFavoritos(List<Aposta> favoritos) {
    Favoritos = favoritos;
  }

  public Date getDataDeNascimento() {
    return DataDeNascimento;
  }

  public void setDataDeNascimento(Date dataDeNascimento) {
    DataDeNascimento = dataDeNascimento;
  }

  public String getCpf() {
    return Cpf;
  }
  public void setCpf(String cpf) {
    Cpf = cpf;
  }
}
