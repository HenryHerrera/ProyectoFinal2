/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectof;

/**
 *
 * @author HENRY HERRERA
 */
public class Atributos {
    int id;
    String Entidad,Atributo,TipoDato,Longitud;

    public Atributos(String Entidad, String Atributo, String TipoDato, String Longitud) {
        this.Entidad = Entidad;
        this.Atributo = Atributo;
        this.TipoDato = TipoDato;
        this.Longitud = Longitud;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntidad() {
        return Entidad;
    }

    public void setEntidad(String Entidad) {
        this.Entidad = Entidad;
    }

    public String getAtributo() {
        return Atributo;
    }

    public void setAtributo(String Atributo) {
        this.Atributo = Atributo;
    }

    public String getTipoDato() {
        return TipoDato;
    }

    public void setTipoDato(String TipoDato) {
        this.TipoDato = TipoDato;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }
    
}
