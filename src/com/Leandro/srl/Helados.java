package com.Leandro.srl;

public class Helados {

    private String saborUno;
    private String saborDos;
    private String saborTres;
    private String saborCuatro;

    public Helados(){

    }

    public String getSaborUno(String saborUno){
        this.saborUno=saborUno;
        return saborUno;
    }

    public void setSaborUno(String saborUno){
        this.saborUno=saborUno;
    }

    public String getSaborDos(String saborDos){
        this.saborDos=saborDos;
        return saborDos;
    }

    public void setSaborDos(String saborDos){
        this.saborDos=saborDos;
    }

    public String getSaborTres(String saborTres){
        this.saborTres=saborTres;
        return saborTres;
    }

    public void setSaborTres(String saborTres){
        this.saborTres=saborTres;
    }

    public String getSaborCuatro(String saborCuatro){
        this.saborCuatro=saborCuatro;
        return saborCuatro;
    }

    public void setSaborCuatro(String saborCuatro){
        this.saborCuatro=saborCuatro;
    }

    @Override
    public String toString() {
        return "Helados{" +
                "saborUno='" + this.saborUno + '\'' +
                ", saborDos='" + this.saborDos + '\'' +
                ", saborTres='" + this.saborTres + '\'' +
                ", saborCuatro='" + this.saborCuatro + '\'' +
                '}';
    }
}
