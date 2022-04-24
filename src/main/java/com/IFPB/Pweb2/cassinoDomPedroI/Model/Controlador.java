package com.IFPB.Pweb2.cassinoDomPedroI.Model;

import java.util.List;

public class Controlador {

  private List<Sorteio> Historicos;
  private List<Cliente> Clientes;

  public List<Cliente> getClientes() {
    return Clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    Clientes = clientes;
  }

  public List<Sorteio> getHistoricos() {
    return Historicos;
  }

  public void setHistoricos(List<Sorteio> historicos) {
    Historicos = historicos;
  }
}
//Nome (String) Data nascimento (java.util.Date) CPF (com ou sem dígitos e traços, vocês decidem) Apostas favoritas