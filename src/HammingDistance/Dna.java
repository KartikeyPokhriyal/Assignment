package HammingDistance;

public class Dna {

    String sample1, sample2;
    int hammingDistance = 0;

    public Dna(String sample1, String sample2) throws IllegalArgumentException {
        if(sample1.length()!= sample2.length())
        {
            System.out.println("The strand lengths must be equal");
            throw new  IllegalArgumentException();
        }

        this.sample1 = sample1;
        this.sample2 = sample2;

    }


    public boolean compareSamples() {

        char[] samples1Array = sample1.toCharArray();
        char[] samples2Array = sample2.toCharArray();

        for(int i =0; i<sample1.length(); i++) {

            if(samples1Array[i] != samples2Array[i]) {
                ++hammingDistance;

            }
        }

        if(hammingDistance != 0) return true;
        else return false;

    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
