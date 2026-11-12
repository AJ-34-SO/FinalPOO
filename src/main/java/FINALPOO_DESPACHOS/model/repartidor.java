package FINALPOO_DESPACHOS.model;

import FINALPOO_DESPACHOS.exception.MasDE0kgException;
import FINALPOO_DESPACHOS.exception.MenosDE30KGException;

public class repartidor {
    private final int id_repartidor;
    private final String nombre;
    private final double pesototal;

    public repartidor(int id_repartidor,String nombre,double pesototal){
        if(pesototal<30)throw new MenosDE30KGException("El peso maximo debe ser menor a 30kg");
        this.id_repartidor=id_repartidor;
        this.nombre=nombre;
        this.pesototal=pesototal;
    }
    public String getNombre() { return nombre; }
    public int getId_repartidor() { return id_repartidor; }
    public double getPesototal() { return pesototal; }

}
