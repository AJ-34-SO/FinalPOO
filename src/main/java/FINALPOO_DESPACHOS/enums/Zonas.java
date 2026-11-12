package FINALPOO_DESPACHOS.enums;

public enum Zonas {
    CENTRO(6000),NORTE(8000),SUR(8000),ORIENTE(15000);

    private final double tarifa;

    Zonas(double tarifa){this.tarifa=tarifa;}

    public double getTarifa(){return tarifa;}


}
