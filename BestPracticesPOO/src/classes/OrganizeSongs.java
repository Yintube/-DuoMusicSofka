package classes;
/**
 * Importación de libreria JOptionPane, muestra cuadros de dialogo para interactuar con el usuario. 
 */
import javax.swing.JOptionPane;

/**
 * Representa la clase OrganizaSongs del paquete classes, Ordena las canciones por año o duración, mostrando la selección de canciones por el usuario.
 * Se hace uso de algoritmo de burbuja para reordenar.
 * 
 * @version 1.0.0 2021-17-02, La clase corresponde a la versión 1 del sistema
 *       
 * @author Mauro Villada Villada - mauro1040@gmail.com
 *         Yineth Vargas Guerrero - yvargas703@misena.edu.co  
 */
public class OrganizeSongs extends MusicLibrary implements IPlayer {
    /**
     * Método heredado de la clase abstracta MusicLibrary. 
     * Con la propiedad sobre escritura.
     * 
     * @param songs 
     */
    @Override
    public void GoLibrary(Songs[] songs) {
        /**
         * Inicialización de variables para recorrer bucles y tener opciones de selección del programa.
         * @throws Se utiliza la excepción, para que el programa le informe al usuario que digitó una opción no valida.
         */ 
        int flag = 0;
        int option = 0;

        do {
            do {
                try {
                    option = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de la opción deseada" + "\n"
                            + "1. Por fecha" + "\n"
                            + "2. Duración" + "\n"
                            + "3. Menú anterior" + "\n"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "El valor de tipo String contiene caracteres no numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    flag = 0;
                    option = 0;
                }

                if (option >= 1 && option <= 3) {
                    flag = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no disponible, vuelva a intentar", "Alerta", JOptionPane.WARNING_MESSAGE);
                }

            } while (flag == 0);

            switch (option) {
                case 1:
                    NewArrayDate(songs);
                    break;
                case 2:
                    NewArrayTime(songs);
                    break;
                case 3:
                    flag = 2;
                    break;
                default:
                    break;
            }
        } while (flag != 2);

    }

    /**
     * Método para reordenar arreglo por fecha, se usa algoritmo de burbuja para lograr el objetivo.
     *
     * @param songs
     */
    public void NewArrayDate(Songs[] songs) {
        int optionPlay = 0;
        Songs newSongList[] = new Songs[20];
        newSongList = songs;
        Songs assistant = new Songs(0, 0, 0, "", "", "", "");
        for (int i = 0; i < newSongList.length - 1; i++) {
            for (int j = 0; j < newSongList.length - 1; j++) {
                if (newSongList[j].getYear() > newSongList[j + 1].getYear()) {
                    assistant = newSongList[j];
                    newSongList[j] = newSongList[j + 1];
                    newSongList[j + 1] = assistant;
                }
            }
        }
        System.out.println(" La lista de canciones ordenadas por año es:");
        for (int i = 0; i <= newSongList.length - 1; i++) {
            System.out.println("");
            System.out.println(newSongList[i].getIdentifier() + ". " + newSongList[i].getTitle()
                    + "  Año: " + newSongList[i].getYear());
        }
        if (JOptionPane.showConfirmDialog(null, "Desea reproducir Lista", "PREGUNTA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            toPlay();

        }
    }

    /**
     * Método para reordenar arreglo por duración, se usa algoritmo de burbuja para lograr el objetivo.
     *
     * @param songs
     */
    public void NewArrayTime(Songs[] songs) {
        int optionPlay = 0;
        Songs newSongList[] = new Songs[20];
        newSongList = songs;
        Songs assistant = new Songs(0, 0, 0, "", "", "", "");
        for (int i = 0; i < newSongList.length - 1; i++) {
            for (int j = 0; j < newSongList.length - 1; j++) {
                if (newSongList[j].getDuration() > newSongList[j + 1].getDuration()) {
                    assistant = newSongList[j];
                    newSongList[j] = newSongList[j + 1];
                    newSongList[j + 1] = assistant;
                }
            }
        }
        System.out.println(" La lista de canciones ordenadas por duración es:");
        for (int i = 0; i <= newSongList.length - 1; i++) {
            System.out.println("");
            System.out.println(newSongList[i].getIdentifier() + ". " + newSongList[i].getTitle()
                    + "  Duración: " + newSongList[i].getDuration() + " Seg.");
        }
        if (JOptionPane.showConfirmDialog(null, "Desea reproducir Lista", "PREGUNTA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            toPlay();

        }
    }
    /**
     * Método implementado de la interfaz IPlayer, reproduce el listado de canciones.
     */
    @Override
    public void toPlay() {
        JOptionPane.showMessageDialog(null, "Reproduciendo Música", "Play", JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Método implementado de la interfaz IPlayer, detiene la reproducción de canciones.
     */
    @Override
    public void toStop() {
        JOptionPane.showMessageDialog(null, "Reproducción detenida", "Play", JOptionPane.INFORMATION_MESSAGE);

    }

}
