package formularios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MarcoCentrado extends JFrame {

    private int ancho;
    private int alto;    
    //Con toolkit y el metodo getDefaulToolkit() obtenemos acceso a nuestro sistema huespede
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = miPantalla.getScreenSize();

    public MarcoCentrado() {
        miPantalla.beep();
        Image imagen = miPantalla.getImage("src/swing/img/usuario.png");
        setIconImage(imagen);

    }

    public void anchoAlto(int ancho, int alto) {
        //me da la resolucion en pixeles
        this.ancho = tamanoPantalla.width;
        this.alto = tamanoPantalla.height;

        //obtengo el ancho y alto formulario en pixels
        double anchoDecimal = (double) this.ancho / 100 * ancho;
        double altoDecimal = (double) this.alto / 100 * alto;

        this.alto = (int) altoDecimal;
        this.ancho = (int) anchoDecimal;

    }

    public void crearFormulario(String Titulo) {
        setVisible(true);        
        //setBounds(posicionAncho,posicionAlto,ancho,alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Titulo);
        setResizable(false);
        setSize(ancho, alto);
        setLocationRelativeTo(null);
    }
}

class probando {

    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        marco.anchoAlto(50, 50);
        marco.crearFormulario("probando marco centrado");
    }
}
