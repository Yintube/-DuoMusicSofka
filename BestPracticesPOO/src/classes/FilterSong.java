package classes;

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
                System.out.println("");
                System.out.println("Por favor ingrese el núemero de la opcion deseada ");
                System.out.println("");
                System.out.println("    1. Filtrar por genero.");
                System.out.println("    2. Filtrar año.");
                System.out.println("    3. Menú anterior");
                System.out.println("");
                option = input.nextInt();

                if (option >= 1 && option <= 3) {
                    flag = 1;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("No disponible, vuelva a intentar");
                    System.out.println("--------------------------------");
                }

            } while (flag == 0);
            switch (option) {
                case 1:
                    int flag2 = 0;
                    int option2 = 0;
                    do {
                        do {
                            System.out.println("");
                            System.out.println("Por favor ingrese el número del genero que desea filtrar");
                            System.out.println("");
                            System.out.println("    1. Rock.");
                            System.out.println("    2. Salsa.");
                            System.out.println("    3. Boleros y Tango.");
                            System.out.println("    3. Balada Romantica.");
                            System.out.println("    5. Menú anterior");
                            System.out.println("");
                            option2 = input.nextInt();

                            if (option2 >= 1 && option2 <= 5) {
                                flag2 = 1;
                            } else {
                                System.out.println("--------------------------------");
                                System.out.println("No disponible, vuelva a intentar");
                                System.out.println("--------------------------------");
                            }

                        } while (flag2 == 0);
                        switch (option2) {
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
        System.out.println("Lista de canciones del Genero " + getGenre2());
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getGenre().equals(getGenre2())) {
                System.out.println(songs[i].getIdentifier() + ". " + songs[i].getTitle());
            }

        }
    }

    /**
     * Este método permite recorrer el arreglo de la lista de canciones y
     * mostrar en consola la lista acorde al año indicado por el usuario
     *
     * @param songs
     */
    public void YearFilter(Songs[] songs) {
        System.out.println("Lista de canciones del año " + getGenre2() + " son:");
        int songCounter = 0;
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getYear() == getYear2()) {
                songCounter++;
                System.out.println(songs[i].getIdentifier() + ". " + songs[i].getTitle());
            }

        }
        if (songCounter == 0) {
            System.out.println("No hay canciones en la biblioteca para ese año");
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

    }

    @Override
    public void toStop() {

    }

}
