package com.IFPB.Pweb2.cassinoDomPedroI.Model;

import java.util.Date;
import java.util.List;

public class Sorteio {
    private double ValorAcumulado;
    private Date DataSorteio;
    private List<Aposta> Apostas;

    public Date getDataSorteio() {
        return DataSorteio;
    }

    public void setDataSorteio(Date dataSorteio) {
        DataSorteio = dataSorteio;
    }

    public List<Aposta> getApostas() {
        return Apostas;
    }

    public void setApostas(List<Aposta> apostas) {
        Apostas = apostas;
    }

    public double getValorAcumulado() {
        return ValorAcumulado;
    }

    public void setValorAcumulado(double valorAcumulado) {
        ValorAcumulado = valorAcumulado;
    }

}
