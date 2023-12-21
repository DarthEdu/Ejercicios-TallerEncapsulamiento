public class Usuarios {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona usuario_1 = new Persona("Juan", "1234567890");

        // Mostrar información del usuario_1
        System.out.println("Hola, el nombre es: " + usuario_1.getNombre() +
                ". Mi número de tarjeta es: " + usuario_1.getNumTarjetaBanco());
    }
}