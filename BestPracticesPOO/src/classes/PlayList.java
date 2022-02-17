package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Yineth Vargas
 */
public class PlayList extends MusicLibrary implements IPlayer {

    @Override
    public void GoLibrary(Songs[] songs) {

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

    public void ShowList(Songs[] songs) {

        for (int i = 0; i <= songs.length - 1; i++) {
            System.out.println(songs[i].getIdentifier() + ". " + songs[i].getTitle());
        }
    }

    public void NewPlayList(Songs[] songs, String playListName) {
        int optionList = 0;
        Songs newSongList[] = new Songs[10];

        for (int i = 0; i <= newSongList.length - 1; i++) {
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

    @Override
    public void toPlay() {
        JOptionPane.showMessageDialog(null, "Reproduciendo Música", "Play", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void toStop() {
       

    }

}   
    

    

 

    
        



    



           
 
       
            
            
                
 
    
    


    

            

     



    
