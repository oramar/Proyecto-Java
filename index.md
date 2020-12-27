# Este es un titulo h1
## Este es un titulo h2
### Este es un titulo h3

*formato en cursiva*

**/ formato en negrita**

~~Este es un texto tachado~~

# Crearemos listas desorganizadas con ul #

* Lunes
    * Lunes de comienzo de semana
* Marte
    * De todo un poco
* Miercoles
* Jueves
* VIernes
* Sabado
* Domingo

# Creamos lista organizada con ol #

1. Enero
    1. Inicio de año
2. Febrero
3. Marzo
4. Abril

# vamos a generar un enlaces

[TItulo del enlace](https://github.com/oramar/Proyecto-Java.git)


# vamos a generar un enlaces con titulo al pasar el mause

[TItulo del enlace](https://github.com/oramar/Proyecto-Java.git "Este es un enlace al gitHub")

# Este es una cita #
> Este es una cita

# Lineas separadoras #

___

# Pegar multiples lineas, especificando a que lenguaje pertenece

```java
package arrays;

import java.text.NumberFormat;
import java.util.Locale;


public class ArrayEjercicios {
    public static void main(String[] args) {
        double acumulado;
        double interes = 0.10;
        double[][] saldo = new double[6][5];
        for(int i = 0;i<6;i++){
            saldo[i][0]=10000;
            acumulado = 10000;
            for(int j=1;j<5;j++){
                acumulado+=(acumulado*interes);
                saldo[i][j] = acumulado;
            }
            interes +=0.01;
        }
        
        for(double[] fila: saldo){
            for(double z:fila){
                NumberFormat formatoNumero = NumberFormat.getCurrencyInstance(Locale.US);
                System.out.print(formatoNumero.format(z) + "   ");
               // System.out.printf("%1.0f",z );
                //System.out.print("   ");
            }
            System.out.println("");
        }
    }
}
```

# Creando tablas

|titulo 1  | Titulo 2  |
|--------- |---------  |
|contenido1|Contenido 2|
|Contenido3|Contenido 4|
|Contenido5|Contenido 6|

# Cargando imagenes Desde la web

![Visual estudio code](https://cdn.worldvectorlogo.com/logos/visual-studio-code.svg)

# Cargando imagen de local
![Visual estudio code](visual-studio-code.svg "Imagen de Visual Strudio code")

# Regla con Github #

## checlist ##

* [x] Tarea 1

# Para Indicar los Imojis

[Emojis de GitHub](https://gist.github.com/rxaviers/7360908)



