
package classes;

/**
 * Representa la clase Songs, establece atributos que se usaran para construir objetos tipo canción.
 *
 * @version 1.0.0 2021-17-02, La clase corresponde a la versión 1 del sistema
 *       
 * @author Mauro Villada Villada - mauro1040@gmail.com
 *         Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class Songs {
    /**
     * Declaración de atributos para objetos Songs o canción.
     */
    private int identifier;
    private int year;
    private int duration;        
    private String title;
    private String genre;
    private String coverPage;
    private String description;
    
    /**
     * Metodo constructor instancia un objeto
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
     * Encapsulamiento, creación de métodos getter and setter parra obtener o modificar los atributos de la clase Song.
     * Como buena práctica es aconsejable crear solo los get, pero decidimos implementar los set.
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
