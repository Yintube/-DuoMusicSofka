package classes;

/**
 *
 * @author yenifer
 */
public class Main {

    public static void main(String[] args) {
        
              
        Songs SongList[] = new Songs[20];

        SongList[0] = new Songs(1, 2011, 354, "Bohemian Rhapsody - Remastered", "Rock",
                "https://www.queenonline.com/global/assets/modules/site/images/music/ANATO.jpg",
                "Canción de la banda britanica Queen escrita por Freddy Mercury, considera un éxito musical");
        SongList[1] = new Songs(2, 1971, 187, "Imagine", "Rock",
                "http://www.johnlennon.com/wp-content/uploads/2018/01/Imagine-Single-Sleeve-1-min.jpg",
                "Canción del album Homonico y escrita por John Lenon y Yoko Ono, sencillo mas vendido de este artista.");
        SongList[2] = new Songs(3, 1984, 414, "Gitana", "Salsa",
                "https://i.discogs.com/h3GtJbDaAk1J_DBbzOdEbmLgHUIFIGzjuYKwgnivwdM/rs:fit/g:sm/q:90/h:589/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTQ3/ODM1NTMtMTUzMTY4/Mzg3My0yOTczLmpw/ZWc.jpeg",
                "Canción del album Tiempo Pa'Matar del cantante Willie Colon.");
        SongList[3] = new Songs(4, 1992, 348, "Amor y Control", "Salsa",
                "https://i.discogs.com/QwXTIN0JBMOqXaklcDuIkvdI63RM2I1HDx2IvEz8e5k/rs:fit/g:sm/q:90/h:600/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTM5/MTIwOTMtMTM0ODk4/OTc1OC0zOTU2Lmpw/ZWc.jpeg",
                "Canción del album Amor y Control del artista Rubén Blades* Con Son Del Solar.");
        SongList[4] = new Songs(5, 1934, 172, "Volver", "Boleros y Tango",
                "https://i.discogs.com/q6d7ekK-jD99ND0mPHvAB5kt2yts9guhVJaWbxIgvBU/rs:fit/g:sm/q:90/h:593/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTEw/MDc4Mzk0LTE0OTEy/Mjg4OTItNjg0NC5q/cGVn.jpeg",
                "Canción de tango compuesta por el cantante y músico Carlos Gardel y por el poeta Alfredo Le Pera ");
        SongList[5] = new Songs(6, 1981, 294, "Estar enamorado", "Balada Romantica",
                "https://i.discogs.com/XKYglHT1etmLwG46WL1aSRYU9OuNVlTc7l1VvUFYpLE/rs:fit/g:sm/q:90/h:600/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTEw/MDQxMTktMTE4Mjk3/NTU3MC5qcGVn.jpeg",
                "Canción perteneciente al album En Carne Viva del cantante español Raphael.");
        SongList[6] = new Songs(7, 1976, 211, "Amigo", "Balada Romantica",
                "hhttps://i.discogs.com/OVvXd0So4PsnYq8Stthh7HKmXBTkIsg_X00VtDfL-yQ/rs:fit/g:sm/q:90/h:600/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTk1/ODk2MDItMTQ4MzI4/MDUzNS0zMTAyLmpw/ZWc.jpeg",
                "Canción del álbum Linea Azul Vol.4 del artista brasileño Roberto Carlos");
        SongList[7] = new Songs(8, 1973, 204, "Niegalo todo", "Boleros y tango",
                "https://i.discogs.com/-vsrRPCtljA0T8Ym77bI8jB384lwCddFlBpAKPXRnbs/rs:fit/g:sm/q:90/h:600/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTEw/NDE3ODA2LTE0OTcw/MjEzNTctMjM5MC5q/cGVn.jpeg",
                "Disco del álbum en memoria al cantante Julio Jaramillo");
        SongList[8] = new Songs(9, 1993, 414, "La herida", "Rock",
                "https://img.discogs.com/NsX4sEw7v4k52ozQqhYDSbYlQwY=/fit-in/600x594/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-3956782-1602200005-4952.jpeg.jpg",
                "Canción del álbum El espiritu del Vino de  la banda de rock española Héroes del Silencio");
        SongList[9] = new Songs(10, 1976, 409, "Periódico de ayer", "Salsa",
                "https://i.discogs.com/XsginPI8p9oDrAqU5PyLjJKapTnj3lW-nXKZtAz6Uwo/rs:fit/g:sm/q:90/h:595/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTI3/OTg5OTItMTYxNTc0/MTA1NC01MTk2Lmpw/ZWc.jpeg",
                "Canción del álbum De ti Depende del cantante salsero Hector Lavoe");
        SongList[10] = new Songs(11, 2008, 265, "Color Esperanza", "Balada Romantica",
                "https://i.discogs.com/XTTmFVJqWSs-n1x17AYMLjlgB6_fAIO_wRXUh5UU_v8/rs:fit/g:sm/q:90/h:600/w:593/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTUy/MTI3OTctMTUxODYw/MDA0Ni0yMzg2Lmpw/ZWc.jpeg",
                "Canción del álbum Un Mundo Diferente del cantante argentino Diego Torres");
        SongList[11] = new Songs(12, 2004, 196, "Nada valgo sin tu Amor", "Rock",
                "https://i.discogs.com/XmJo-bWB1jdiP0pe7KKTGAI3U_KXOKqX8aQig9XKdUA/rs:fit/g:sm/q:90/h:587/w:599/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTE1/NzM3ODItMTIyOTQ1/MzY4NS5qcGVn.jpeg",
                "Canción del álbum Mi sangre del cantante colombiano Juanes");
        SongList[12] = new Songs(13, 1991, 262, "Entre la espada y la pared", "Salsa",
                "https://i.discogs.com/xN4LuEvCBzL31LEXcOX--ZmUT66sxvCww-PNr3pkgsc/rs:fit/g:sm/q:90/h:600/w:583/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTI1/MzgyOTMtMTI4OTUw/NDcyMi5qcGVn.jpeg",
                "Canción perteneciente al álbun que lleva el mismo nombre, del cantante  puertorriqueño Nino Segarra");
        SongList[13] = new Songs(14, 2011, 333, "Conciencia", "Salsa",
                "https://img.discogs.com/Hy4Li4l1BGIy0Su1SEtrj5n5DpQ=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-11694863-1520991401-3384.jpeg.jpg",
                "Canción salsera del cantante Gilberto Santa Rosa");
        SongList[14] = new Songs(15, 1967, 141, "Adoro", "Boleros y Tango",
                "https://i.discogs.com/V-iLSf6dkvoSmRKXcalM9rhW_YZwgOuj5sXCyQYyJbg/rs:fit/g:sm/q:90/h:437/w:434/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTc3/OTU4NDktMTQ0ODkz/NDc5NC05OTY0Lmpw/ZWc.jpeg",
                "Canción en bolero del álbum A mi amor con mi amor del cantante  mexicano Armando Manzanero ");
        SongList[15] = new Songs(16, 1965, 171, "Mil cosas", "Boleros y Tango",
                "https://i.discogs.com/6NB4RAzQTWZZiz7g8Pgbnmaf_qoLF5f7kA334Ah-4gI/rs:fit/g:sm/q:90/h:207/w:207/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTc2/MDc3MzktMTQ0NTAz/OTkyNS05ODMwLmpw/ZWc.jpeg",
                "Canción en bolero del álbum La voz del Caribe del cantante  dominicano Alberto Beltran ");
        SongList[16] = new Songs(17, 1965, 159, "Sombras nada mas", "Boleros y Tango",
                "https://i.discogs.com/0Cnzosa97oqjeVN40ShqeIsKsW4FPLNgBXBg28evipw/rs:fit/g:sm/q:90/h:600/w:591/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTEz/Mzc1NzAyLTE1NTMw/MjI1MDMtNzk4Ni5q/cGVn.jpeg",
                "Canción en bolero den cantante venezolano Felipe Pirela");
        SongList[17] = new Songs(18, 1964, 175, "Como te extraño mi amor", "Balada Romantica",
                "https://i.discogs.com/Yzr0-cDqbEv4hNhH3dcsKxvUX1tUa4Wig0l5ns2ZoO8/rs:fit/g:sm/q:90/h:500/w:500/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTEx/ODYwMTgwLTE1OTM4/ODgyOTItMjgwNS5q/cGVn.jpeg",
                "Canción romantica del cantante  argentino Leo Dan");
        SongList[18] = new Songs(19, 1993, 272, "Lenguaje de mi piel", "Rock",
                "https://i.discogs.com/BBfJgATosSzyOn7xqpvBsIcmEx9it67xsgGhsyw4YbQ/rs:fit/g:sm/q:90/h:600/w:597/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTI0/MTQzMTgtMTYzNTQz/NDExNy02ODAwLmpw/ZWc.jpeg",
                "Canción rock del álbum Kaken IV Piel de cobre de la banda colombiana Kraken");
        SongList[19] = new Songs(20, 1980, 248, "Morir de amor", "Balada Romantica",
                "https://i.discogs.com/u3TCuorsCF5rIjavA28IdW_veuFzVyAlOQIM6vX0k1Q/rs:fit/g:sm/q:90/h:597/w:600/czM6Ly9kaXNjb2dz/LWltYWdlcy9SLTQy/MDAyMzYtMTYwMjM4/NTE5NC04Nzg3Lmpw/ZWc.jpeg",
                "Canción romantica del cantante Panameño Miguel Bose");

        System.out.println("**************************************************");
        System.out.println("   Bienvenid@ a la bibliotecta -DuoMusicSofka-");
        System.out.println("**************************************************");
        System.out.println("");  
        
        
        
        MusicLibrary courier = new PlayList();
        courier.AccessToLibrary(SongList);
       
        
       }

    }
    


