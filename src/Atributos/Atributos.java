
package Atributos;

import proyectof.Metodos;

public class Atributos {
    
    String Id, Entidad,Natributo,TipoDato,Longitud;

    public Atributos(String Id, String Entidad, String Natributo, String TipoDato, String Longitud) {
        this.Id=Id;
        this.Entidad = Entidad;
        this.Natributo = Natributo;
        this.TipoDato = TipoDato;
        this.Longitud = Longitud;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getEntidad() {
        return Entidad;
    }

    public void setEntidad(String Entidad) {
        this.Entidad = Entidad;
    }

    public String getNatributo() {
        return Natributo;
    }

    public void setNatributo(String Atributo) {
        this.Natributo = Atributo;
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
