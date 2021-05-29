
package ejerciciosDelCurso.Practica1;

//Aqui iniciamos el proyecto


import formularios.MarcoCentrado;

public class InicioProyecto {
    //metod principal
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado();
        LaminaPrincipal lamina = new LaminaPrincipal();
        
        marco.add(lamina);
        marco.anchoAlto(45, 55);
        marco.crearFormulario("Ejercicio Pratico Dialagos");
        //Video 126

    }
}
