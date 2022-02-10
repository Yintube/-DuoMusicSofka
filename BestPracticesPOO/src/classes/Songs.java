
package classes;

/**
 * Esta clase permite establecer atributos que luego seran usados para construir objetos de tipo canción.
 * @author Mauro Villada Villada, mauro1040@gmail.com
 */
public class Songs {
    private int identifier, year, duration;
    private String title, genre,coverPage, description;

    /**
     * Metodo constructor
     * @param identifier
     * @param year
     * @param duration
     * @param title
     * @param genre
     * @param coverPage
     * @param description
     */
    public Songs(int identifier, int year, int duration, String title, String genre, String coverPage, String description) {
        this.identifier = identifier;
        this.year = year;
        this.duration = duration;
        this.title = title;
        this.genre = genre;
        this.coverPage = coverPage;
        this.description = description;
    }

   

    /**
     * Metodos getter and setter parra obtener o modificar los atributos de la clase Song
     * @return
     */
    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCoverPage() {
        return coverPage;
    }

    public void setCoverPage(String coverPage) {
        this.coverPage = coverPage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
