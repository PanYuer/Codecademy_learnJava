import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList <String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Right here waiting");
    desertIslandPlaylist.add("My heart will go on");
    desertIslandPlaylist.add("Raise me up");
    desertIslandPlaylist.add("Friday night");
    desertIslandPlaylist.add("Moonlight shadow");
    desertIslandPlaylist.add("You're my sunshine");

    System.out.println(desertIslandPlaylist);
   
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Friday night");
    System.out.println(desertIslandPlaylist.size());

    // swap the order of two songs
    int a = desertIslandPlaylist.indexOf("You're my sunshine");
    int b = desertIslandPlaylist.indexOf("Moonlight shadow");
    //String tempA = desertIslandPlaylist.get(a);
    String tempA = "You're my sunshine";
    desertIslandPlaylist.set(a, "Moonlight shadow");
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(b, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}