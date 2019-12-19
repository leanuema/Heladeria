package com.leandro.srl;

public class helado {

    private String primerSabor;
    private String segundoSabor;
    private String tercerSabor;
    private String cuartoSabor;

    public helado() {

    }

    public String getPrimerSaborDeseado() {
        return primerSabor;
    }

    public void setPrimerSaborDeseado(String primerSabor) {
        this.primerSabor = primerSabor;
    }

    public String getSegundoSaborDeseado() {
        return segundoSabor;
    }

    public void setSegundoSaborDeseado(String segundoSabor) {
        this.segundoSabor = segundoSabor;
    }

    public String getTercerSaborDeseado() {
        return tercerSabor;
    }

    public void setTercerSaborDeseado(String tercerSabor) {
        this.tercerSabor = tercerSabor;
    }

    public String getCuartoSaborDeseado() {
        return cuartoSabor;
    }

    public void setCuartoSaborDeseado(String cuartoSabor) {
        this.cuartoSabor = cuartoSabor;
    }

    public String toString() {
        return "con sabores de {" +
                "primerSabor='" + primerSabor + '\'' +
                ", segundoSabor='" + segundoSabor + '\'' +
                ", tercerSabor='" + tercerSabor + '\'' +
                ", cuartoSabor='" + cuartoSabor + '\'' +
                '}';
    }
}


