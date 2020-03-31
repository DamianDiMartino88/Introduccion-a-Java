package com.Mes;

public class Mes {
    private String Mes;
    private int DiasDelMes;
    private int NumeroDeMes;

    public Mes(){
        this.Mes="";
        this.DiasDelMes=0;
        this.NumeroDeMes=0;
    }

    public Mes(String mes, int diasDelMes, int numeroDeMes){
        this.Mes=mes;
        this.DiasDelMes=diasDelMes;
        this.NumeroDeMes=numeroDeMes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public void setDiasDelMes(int diasDelMes) {
        DiasDelMes = diasDelMes;
    }

    public void setNumeroDeMes(int numeroDeMes) {
        NumeroDeMes = numeroDeMes;
    }

    public String getMes() {
        return Mes;
    }

    public int getDiasDelMes() {
        return DiasDelMes;
    }

    public int getNumeroDeMes() {
        return NumeroDeMes;
    }

    public void verMes(int mes){

    }
}
