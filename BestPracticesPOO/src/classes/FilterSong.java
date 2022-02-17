package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class FilterSong extends MusicLibrary implements IPlayer {

    private String genre2;
    private int year2 = 0;

    @Override
    public void GoLibrary(Songs[] songs) {
        int flag = 0;
        int option = 0;
        do {
            do {
                try {
                    option = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de la opción deseada" + "\n"
                            + "1. Filtrar por genero" + "\n"
                            + "2. Filtrar año" + "\n"
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
                    int flag2 = 0;
                    int genreOption = 0;
                    do {
                        do {
                            try {
                                genreOption = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el número del genero que desea filtrar" + "\n"
                                        + "1. Rock" + "\n"
                                        + "2. Salsa" + "\n"
                                        + "3. Boleros y Tango" + "\n"
                                        + "4. Balada Romantica" + "\n"
                                        + "5. Menú anterior" + "\n"));
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "El valor de tipo String contiene caracteres no numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
                                flag2 = 0;
                                genreOption = 0;
                            }

                            if (genreOption >= 1 && genreOption <= 5) {
                                flag2 = 1;
                            } else {
                                JOptionPane.showMessageDialog(null, "Opción no disponible, vuelva a intentar", "Alerta", JOptionPane.WARNING_MESSAGE);
                            }

                        } while (flag2 == 0);
                        switch (genreOption) {
                            case 1:
                                setGenre2("Rock");
                                GenreFilter(songs);
                                break;
                            case 2:
                                setGenre2("Salsa");
                                GenreFilter(songs);
                                break;
                            case 3:
                                setGenre2("Boleros y Tango");
                                GenreFilter(songs);
                                break;
                            case 4:
                                setGenre2("Balada Romantica");
                                GenreFilter(songs);
                                break;
                            case 5:
                                flag2 = 2;
                                break;
                            default:
                                break;
                        }

                    } while (flag2 != 2);
                    break;

                case 2:
                    int flag3 = 0;
                    int yearOption = 0;
                    do {
                        do {
                            try {
                                yearOption = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el año que desea filtrar o 1 para regresar al menú anterior" + "\n"
                                        + "1. Menú anterior" + "\n"));
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "El valor de tipo String contiene caracteres no numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
                                flag3 = 0;
                                yearOption = 0;
                            }
                            if (yearOption > 1 && yearOption <= 2022) {
                                flag3 = 1;
                                setYear2(yearOption);
                                YearFilter(songs);
                            } else if (yearOption == 1) {
                                flag3 = 2;
                            } else {
                                JOptionPane.showMessageDialog(null, "Opción no disponible, vuelva a intentar", "Alerta", JOptionPane.WARNING_MESSAGE);
                            }

                        } while (flag3 == 0);

                    } while (flag3 != 2);

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
     * Este método permite recorrer el arreglo de la lista de canciones y
     * mostrar en consola la lista acorde al genero seleccionado por el usuario
     *
     * @param songs
     */
    public void GenreFilter(Songs[] songs) {
        //int optionPlay = 0;
        System.out.println("Lista de canciones del Genero " + getGenre2());
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getGenre().equals(getGenre2())) {
                System.out.println(songs[i].getIdentifier() + ". " + songs[i].getTitle());
            }
        }
        if (JOptionPane.showConfirmDialog(null, "Desea reproducir Lista", "PREGUNTA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            toPlay();
        }
    }

    /**
     * Este método permite recorrer el arreglo de la lista de canciones y
     * mostrar en consola la lista acorde al año indicado por el usuario
     *
     * @param songs
     */
    public void YearFilter(Songs[] songs) {
        System.out.println("Lista de canciones del año " + getYear2() + " son:");
        int songCounter = 0;
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getYear() == getYear2()) {
                songCounter++;
                System.out.println(songs[i].getIdentifier() + ". " + songs[i].getTitle() + "    " + songs[i].getDuration() + "Seg.");
            }

        }
        if (songCounter == 0) {
            JOptionPane.showMessageDialog(null, "No hay canciones en la biblioteca para ese año", "Not found", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea reproducir Lista", "PREGUNTA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                toPlay();
            }
        }
    }

    /**
     * @return the genre
     */
    public String getGenre2() {
        return genre2;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre2(String genre) {
        this.genre2 = genre;
    }

    /**
     * @return the year2
     */
    public int getYear2() {
        return year2;
    }

    /**
     * @param year2 the year2 to set
     */
    public void setYear2(int year2) {
        this.year2 = year2;
    }

    @Override
    public void toPlay() {
        JOptionPane.showMessageDialog(null, "Reproduciendo Música", "Play", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void toStop() {
        System.out.println("La reprodución se ha detenido");

    }

}
