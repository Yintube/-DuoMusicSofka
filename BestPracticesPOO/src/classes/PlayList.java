package classes;
/**
 * Importación de libreria JOptionPane, muestra cuadros de dialogo para interactuar con el usuario. 
 */
import javax.swing.JOptionPane;

/**
 * Representa la clase PlayList del paquete classes, crea una lista de canciones desde el vector.
 * Mostrando el nuevo listado escogido por el usuario.
 *
 * @version 1.0.0 2021-17-02, La clase corresponde a la versión 1 del sistema
 *       
 * @author  Yineth Vargas Guerrero - yvargas703@misena.edu.co
 *          Mauro Villada Villada - mauro1040@gmail.com
 *           
 */
public class PlayList extends MusicLibrary implements IPlayer {
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
        String playListName;

        do {
            do {
                try {
                    option = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de la opción deseada" + "\n"
                            + "1. Crear Play List" + "\n"
                            + "2. Menú anterior" + "\n"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "El valor de tipo String contiene caracteres no numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    flag = 0;
                    option = 0;
                }

                if (option >= 1 && option <= 2) {
                    flag = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no disponible, vuelva a intentar", "Alerta", JOptionPane.WARNING_MESSAGE);
                }

            } while (flag == 0);

            switch (option) {
                case 1:
                    playListName = JOptionPane.showInputDialog("Ingrese el nombre para su esta PlayList");
                    System.out.println("");
                    System.out.println("Lista de canciones disponibles en la biblioteca");
                    System.out.println("");
                    ShowList(songs);
                    NewPlayList(songs, playListName);
                    break;
                case 2:
                    flag = 2;
                    break;
                default:
                    break;
            }
        } while (flag != 2);

    }
    /**
     * Este método permite recorrer el arreglo de la biblioteca de canciones y mostrar
     * en consola la lista de todas las canciones que el usuario puede seleccionar. 
     * @param songs 
     */
    public void ShowList(Songs[] songs) {
        for (int i = 0; i <= songs.length - 1; i++) {
            System.out.println(songs[i].getIdentifier() + ". " + songs[i].getTitle());
        }
    }
    /**
     * Este método toma de las opciones seleccionadas por el usuario y crea una nueva lista con un máximo de 10 canciones mostrandola por consola.
     * @param songs
     * @param playListName 
     */

    public void NewPlayList(Songs[] songs, String playListName) {
        int optionList = 0;
        Songs newSongList[] = new Songs[10];

        for (int i = 0; i <= newSongList.length - 1; i++) {
            // Excepción por si el usuario digíta una opcion diferente.
            try {
                optionList = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de la canción deseada"));              
                newSongList[i] = songs[optionList - 1];
            } catch (Exception e) {
                i = i-1;
                JOptionPane.showMessageDialog(null, "El valor de tipo String contiene caracteres no numéricos o la opcion no existe", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }
        System.out.println("");
        System.out.println("Lista de canciones para " + playListName);
        System.out.println("");
        ShowList(newSongList);
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
    

    

 

    
        



    



           
 
       
            
            
                
 
    
    


    

            

     



    
