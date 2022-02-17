package classes;
/**
 * Importación de libreria JOptionPane, muestra cuadros de dialogo para interactuar con el usuario. 
 */
import javax.swing.JOptionPane;

/**
 * Representa la clase abstracta del paquete classes. Define características de otras clases.
 * Contiene métodos abstractos que comparte con las demás.
 *
 * @version 1.0.0 2021-17-02, La clase corresponde a la versión 1 del sistema
 *       
 * @author Mauro Villada Villada - mauro1040@gmail.com
 *         Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public abstract class MusicLibrary {
    /**
     * Método abstracto para ir desde las otras clases a la biblioteca de canciones o vector.
     * @param songs 
     */
    abstract public void GoLibrary(Songs[] songs);
    /**
     * Método para acceder a cada objeto del vector.
     * @param songs 
     */
    public void AccessToLibrary(Songs[] songs) {
        /**
         * Inicialización de variables para recorrer bucles y tener opciones de selección del programa.
         * @throws Se utiliza la excepción, para que el programa le informe al usuario que digitó una opción no valida.
         */
        int flag = 0;
        int option = 0;

        do {
            do {
                try {
                    option = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de la opción que desea hacer en la Biblioteca de Música" + "\n"
                            + "1. Crear Lista de Reproducción" + "\n"
                            + "2. Filtrar Canciones" + "\n"
                            + "3. Ordenar Canciones" + "\n"
                            + "4. Salir"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "El valor de ingresado contiene caracteres no numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    flag = 0;
                    option = 0;
                }
                if (option >= 1 && option <= 4) {
                    flag = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no disponible, vuelva a intentar", "Alerta", JOptionPane.WARNING_MESSAGE);
                }

            } while (flag == 0);

            switch (option) {
                case 1:
                    MusicLibrary courier1 = new PlayList();
                    courier1.GoLibrary(songs);
                    break;
                case 2:
                    MusicLibrary courier2 = new FilterSong();
                    courier2.GoLibrary(songs);
                    break;
                case 3:
                    MusicLibrary courier3 = new OrganizeSongs();
                    courier3.GoLibrary(songs);
                    break;
                case 4:
                    System.out.println("-----------------------------------------------");
                    System.out.println("¡Disfruta la música que elegiste vuelve pronto!");
                    System.out.println("-----------------------------------------------");
                    flag = 2;
                    break;
                default:
                    break;
            }
        } while (flag != 2);

    }
}
