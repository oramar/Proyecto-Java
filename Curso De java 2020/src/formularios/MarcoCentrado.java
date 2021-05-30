package formularios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MarcoCentrado extends JFrame {

    private int ancho;

    public int getAncho() {
        return ancho;
    }
    private int alto; 

    public int getAlto() {
        return alto;
    }
    private int posicionAncho;
    private int posicionAlto;
    //Con toolkit y el metodo getDefaulToolkit() obtenemos acceso a nuestro sistema huespede
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = miPantalla.getScreenSize();

    public MarcoCentrado() {
        miPantalla.beep();
        Image imagen = miPantalla.getImage("src/swing/img/usuario.png");
        setIconImage(imagen);

    }

    public void anchoAlto(int ancho, int alto) {

        this.ancho = tamanoPantalla.width;
        this.alto = tamanoPantalla.height;
        double anchoDecimal = (double) this.ancho / 100 * ancho;
        double altoDecimal = (double) this.alto / 100 * alto;
        this.posicionAncho = (int) ((this.ancho - anchoDecimal) / 2);
        this.posicionAlto = (int) ((this.alto - altoDecimal) / 2);

        this.alto = (int) altoDecimal;
        this.ancho = (int) anchoDecimal;

    }

    public void crearFormulario(String Titulo) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Titulo);
        setResizable(false);
        setBounds(posicionAncho, posicionAlto, ancho, alto);
        //Otra forma de centrarlo es
        //setSize(ancho,alto);
        //setLocationRelativeTo(null);

    }
}

