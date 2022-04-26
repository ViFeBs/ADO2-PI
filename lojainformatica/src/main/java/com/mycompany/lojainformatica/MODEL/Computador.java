package com.mycompany.lojainformatica.MODEL;

/**
 *
 * @author bruno.vrufino
 */
public class Computador {
    private int id;
    static private String Marca = "Bruno Viana";
    private String Hd;
    private String Processador;
    
    public Computador(){
    
    }

    public int getId() {
        return id;
    }
    
    public static String getMarca() {
        return Marca;
    }

    public String getHd() {
        return Hd;
    }

    public String getProcessador() {
        return Processador;
    }

    public static void setMarca(String Marca) {
        Computador.Marca = Marca;
    }

    public void setHd(String Hd) {
        this.Hd = Hd;
    }

    public void setProcessador(String Processador) {
        this.Processador = Processador;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
