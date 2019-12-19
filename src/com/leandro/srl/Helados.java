package com.leandro.srl;

public class Helados {

    private String primerSabor;
    private String segundoSabor;
    private String tercerSabor;
    private String cuartoSabor;

    public Helados(){

    }

    public String getPrimerSabor(){
        return primerSabor;
    }

    public void setPrimerSabor(String primerSabor){
        this.primerSabor = primerSabor;
    }

    public String getSegundoSabor(){
        return segundoSabor;
    }

    public void setSegundoSabor(String segundoSabor){
        this.segundoSabor = segundoSabor;
    }

    public String getTercerSabor(){
        return tercerSabor;
    }

    public void setTercerSabor(String tercerSabor){
        this.tercerSabor = tercerSabor;
    }

    public String getCuartoSabor(){
        return cuartoSabor;
    }

    public void setCuartoSabor(String cuartoSabor){
        this.cuartoSabor=cuartoSabor;
    }

    public String toString() {
        return "Helados{" +
                "saborUno='" + this.primerSabor + '\'' +
                ", saborDos='" + this.segundoSabor + '\'' +
                ", saborTres='" + this.tercerSabor + '\'' +
                ", saborCuatro='" + this.cuartoSabor + '\'' +
                '}';
    }
}
