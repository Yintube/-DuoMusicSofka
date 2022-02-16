package classes;

import java.util.Scanner;

/**
 *
 * @author
 */
public abstract class MusicLibrary {
    
    Scanner input = new Scanner(System.in);
    
    abstract public void GoLibrary(Songs[] songs);
    
    public void AccessToLibrary(Songs[] songs) {
        
        
        int flag = 0;
        int option = 0;
        do {
            do {
                System.out.println("");
                System.out.println("Por favor seleccione que desea hacer en la Biblioteca de Música");
                System.out.println("");
                System.out.println("    1. Crear Lista de Reproducción.");
                System.out.println("    2. Filtrar Canciones.");
                System.out.println("    3. Ordenar Canciones.");
                System.out.println("    4. Salir");                
                System.out.println("");
                option = input.nextInt();

                if (option >= 1 && option <= 4) {
                    flag = 1;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("No disponible, vuelva a intentar");
                    System.out.println("--------------------------------");
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


