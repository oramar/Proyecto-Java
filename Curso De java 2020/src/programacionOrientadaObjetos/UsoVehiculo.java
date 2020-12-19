
package programacionOrientadaObjetos;


public class UsoVehiculo {
    public static void main(String[] args) {
        Coche miCoche1  = new Coche();
        Furgoneta miFurgoneta1 = new Furgoneta(25,50);
        miFurgoneta1.SetEstablecerValores("Rojo");
        miFurgoneta1.setConfiguraAsiento("si");
        miFurgoneta1.setConfiguraClimatizador("si");
        System.out.println(miFurgoneta1.toString()+" "+miFurgoneta1.getDimedatosFurgoneta());
        System.out.println(miCoche1.toString());
    }
}
