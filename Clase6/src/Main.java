public class Main {
    public static void main(String[] args) {
        //Clase 6: Testing

        //https://www.jetbrains.com/help/idea/junit.html

        //Como el tipo de proyecto es diferente, vamos a crear un nuevo proyecto.
        //Vamos a elegir Maven como BuildSystem.

        //En el nuevo proyecto, vamos a crear una clase Calculator con exactamente el siguiente codigo

        /*
        package org.example;

        import java.util.stream.DoubleStream;

        public class Calculator {

            static double add(double... operands) {
                return DoubleStream.of(operands)
                        .sum();
            }

            static double multiply(double... operands) {
                return DoubleStream.of(operands)
                        .reduce(1, (a, b) -> a * b);
            }
        }*/

        //Eso hecho, vamos a entrar al menu contextual sobre public class Calculator
        //y entrar a la opcion de Create Tests
        //En la nueva ventana, solo vamos a elegir los Metodos en la parte inferior

        //Esto nos va a crear una nueva clase de testing
        //Si nos esta faltando una dependencia vamos a tener errores ahora en el compilador
        //De vuelta, seleccionen el simbolo que el compilador no comprenda (posiblemente junit)
        //y entremos a su menu contextual, donde vamos a poder importar las dependencias

        //Vamos a modificar ahora y agregar este codigo a la funcion add
        //        assertEquals(4, Calculator.add(2, 2));

        //En la funcion multiply, vamos a añadir este codigo:
        /*
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));

         */



    }
}