class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  
  Language(String langName, int num, String regions, String wdOrder){
      this.name = langName;
      this.numSpeakers = num;
      this.regionsSpoken = regions;
      this.wordOrder = wdOrder;
    }

  public static void main(String[] args){
    
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
  spanish.getInfo();

  Language kiche = new Mayan("Ki 'che'", 2330000);
  kiche.getInfo();

  SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
  mandarin.getInfo();
  SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
  burmese.getInfo();
  }

    
  public void getInfo(){
    System.out.println(name + " is spoken by "+ numSpeakers + " people mainly in " + regionsSpoken + ".The language follows the word order: " + wordOrder + ".");
  }
}