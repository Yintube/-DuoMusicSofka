package classes;

import javax.swing.JOptionPane;

/**
 * Esta clase solicita al usuario como desea reordenar la lista de la
 * biblioteca, si por fecha o por duración, se hace uso de algoritmo de
 * burbubuja para reordenar.
 * @author
 */
public class OrganizeSongs extends MusicLibrary implements IPlayer {

    @Override
    public void GoLibrary(Songs[] songs) {

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
     * Método para reordenar arreglo por fecha, se usa algoritmo de burbuja para
     * lograr el objetivo.
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
     * Método para reordenar arreglo por duración, se usa algoritmo de burbuja
     * para lograr el objetivo.
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
     * Implementación de los métodos definidos en la interfaz
     */
    @Override
    public void toPlay() {
        JOptionPane.showMessageDialog(null, "Reproduciendo Música", "Play", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void toStop() {

    }

}
