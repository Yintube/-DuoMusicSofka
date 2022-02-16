
package classes;

import java.util.ArrayList;


/**
 *
 * @author Yineth Vargas
 */
public class PlayList extends MusicLibrary implements IPlayer {
    
    private String title2;

    PlayList() {
       
    }
      
    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }
 
    @Override
    public void GoLibrary(Songs[] songs) {
        int flag = 0;
        int option = 0;
        do{
            do{
                System.out.println("");
                System.out.println("Ingrese el número de la opción deseada");
                System.out.println("");
                System.out.println("    1. Elegir por Titulo de Canción.");
                System.out.println("    2. Menú anterior");
                System.out.println("");
                option = input.nextInt();

                if (option >= 1 && option <= 3) {
                    flag = 1;
                 
                    
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("No disponible, vuelva a intentar");
                    System.out.println("--------------------------------");
                }
                
            }while(flag == 0);
            switch(option) {
                case 1:
                    int flag2 = 0;
                    int option2 = 0;
                    do{
                        do{
                            System.out.println("");
                            System.out.println("Por favor ingrese el número del Título que desea agregar a su PlayList.");
                            System.out.println("");
                            System.out.println("    1. Bohemian Rhapsody.");
                            System.out.println("    2. Imagine.");
                            System.out.println("    3. Gitana.");
                            System.out.println("    4. Amor y Control.");
                            System.out.println("    5. Volver");
                            System.out.println("    6. Estar enamorado.");
                            System.out.println("    7. Amigo.");
                            System.out.println("    8. Niegalo todo.");
                            System.out.println("    9. La Herida.");
                            System.out.println("    10. Periodico de ayer");
                            System.out.println("    11. Color Esperanza.");
                            System.out.println("    12. Nada valgo sin tu Amor.");
                            System.out.println("    13. Entre la espada y la pared.");
                            System.out.println("    14. Conciencia.");
                            System.out.println("    15. Adoro");
                            System.out.println("    16. Mil cosas.");
                            System.out.println("    17. Sombras nada más.");
                            System.out.println("    18. Como te extraño mi amor.");
                            System.out.println("    19. Lenguaje de mi piel.");
                            System.out.println("    20. Morir de amor");
                            System.out.println("    21. Menú anterior.");
                            System.out.println("");
                            option2 = input.nextInt(); 
                           
                            if (option2 >= 1 && option2 <= 21) {
                                flag2 = 1;           
                            } else {
                                System.out.println("--------------------------------");
                                System.out.println("No disponible, vuelva a intentar");
                                System.out.println("--------------------------------");
                            }
                            
                        }while(flag2 == 0);
                        switch(option2){
                            case 1:
                                setTitle2("    1.Bohemian Rhapsody.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;  
                            case 2:
                                setTitle2("    2.Imagine.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 3:
                                setTitle2("    3.Gitana.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 4:
                                setTitle2("    4.Amor y Control.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 5:
                                setTitle2("    5.Volver.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 6:
                                setTitle2("    6.Estar enamorado.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 7:
                                setTitle2("    7.Amigo.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 8:
                                setTitle2("    8.Niegalo Todo.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 9:
                                setTitle2("    9.La Herida.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 10:
                                setTitle2("    10.Periodico de ayer.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 11:
                                setTitle2("    11.Color Esperanza.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 12:
                                setTitle2("    12.Nada valgo sin tu Amor.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 13:    
                                setTitle2("    13.Entre la espada y la pared.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 14:
                                setTitle2("    14.Conciencia.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 15:
                                setTitle2("    15.Adoro.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 16:
                                setTitle2("    16.Mil cosas.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 17:
                                setTitle2("    17.Sombras nada más.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 18:
                                setTitle2("    18.Como te extraño mi amor.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;                                
                            case 19:
                                setTitle2("    19.Lenguaje de mi piel.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break;
                            case 20:
                                setTitle2("    20.Morir de amor.");
                                chooseTitle(songs);
                                toStringTitle2(songs);
                                break; 
                            case 21:
                                flag2 = 2;
                                break;
                            default:
                                break;
                        }  
                        
                    }while(flag2 !=2);
                    break; 
                case 2:
                    
                    break;
                case 3:
                    flag = 1;
                    break;
                default:
                    break;
            
            }
            
        }while(flag != 1);
               
    }
    
    public void chooseTitle(Songs[] songs) {
        System.out.println("Canción para tu PlayList " + getTitle2());
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getTitle().equals(getTitle2())) {        
                System.out.println(songs[i].getIdentifier() + ". " + songs[i].getTitle());
                
            }
        }
        
    }
    
    public void toStringTitle2(Songs[] songs){
        ArrayList ListTitle2 = new ArrayList();
        for (int i = 0; i < ListTitle2.size(); i++) { ListTitle2.add(10);}
            System.out.println (songs[10].getTitle());  
        } 

    @Override
    public void toPlay() {
        
    }

    @Override
    public void toStop() {
       
    }
        
    }    
    

    

 

    
        



    



           
 
       
            
            
                
 
    
    


    

            

     



    
