public class DNA{
  public static void main(String[] args){
    // DNA.java program determines whether there is a protein in a strand of DNA.
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3; //dna can be set to any DNA sequence (dna1, dna2, dna3).
    System.out.println(dna.length());

    int start = dna.indexOf("ATG");
    System.out.println(start);
    int stop = dna.indexOf("TGA");
    System.out.println(stop);
    if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
      System.out.println("Conditions 1, 2 and 3 are satisfied. This dna contains a protein.");
      String protein = dna.substring(start, stop + 3); 
      // codon is 3 nucleotides long
    }
    else{
      System.out.println("No protein.");
    }
  }
}