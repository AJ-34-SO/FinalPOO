package FINALPOO_DESPACHOS.model;

import FINALPOO_DESPACHOS.enums.Servicios;
import FINALPOO_DESPACHOS.enums.Zonas;
import FINALPOO_DESPACHOS.exception.MasDE0kgException;
import FINALPOO_DESPACHOS.exception.MenosDe20KGException;

import java.util.Objects;

public class paquete {
    private final String guia;
    private final double pesoKG;
    private final Zonas Zonas;
    private final Servicios Servicios;

    public paquete(String guia, double pesoKG, double preciobase, Zonas zonas,Servicios Servicios){
        if(pesoKG<=0)throw new MasDE0kgException("El peso debe ser mayor a 0 kg");
        if(pesoKG>20)throw new MenosDe20KGException("El peso debe ser menos a 20 kg, si se quiere llevar en moto");
        this.guia=guia;
        this.pesoKG=pesoKG;
        this.Zonas=zonas;
        this.Servicios=Servicios;
    }

    public Zonas getZonas(){ return Zonas; }

    public Servicios getServicios(){return Servicios;}

    public double getPesoKG() { return pesoKG; }

    @Override public double costoenvioparte1() {
        return getZonas() + pesoKG * 1000;
    }
    @Override public double costoenvio() {
        return costoenvioparte1()+costoenvioparte1()*0.5 ;
    }
    public String getGuia() { return guia; }
}
