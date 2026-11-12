package FINALPOO_DESPACHOS.enums;

public enum Servicios {
    ESTANDAR(0),EXPRESS(0.5),FRAGIL(5000);

    private final double ajuste;
    Servicios(double ajuste){this.ajuste=ajuste;}

    public double getAjuste(){return ajuste;}
}
