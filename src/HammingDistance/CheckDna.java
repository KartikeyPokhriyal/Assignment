package HammingDistance;

public class CheckDna {

    public static void main(String[] args) {
        Dna katy = new Dna("GATTW", "GATWE");
       // Dna taylor = new Dna("GATTWR", "GATWE");

        if(katy.compareSamples())
            System.out.println(katy.getHammingDistance());
        else
            System.out.println("samples are equal");

        Dna taylor = new Dna("GATTWR", "GATWE");

        if(taylor.compareSamples())
            System.out.println(taylor.getHammingDistance());
        else
            System.out.println("samples are equal");
    }

}
