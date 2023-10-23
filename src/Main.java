/**
 * @author Benjamin Haedt, Kelly Joyce
 */

public class Main {

    public static void main(String[] args) throws Exception {
        ReadInFASTA sequence;
        int sequenceLength;
        DNASeq singleSeq;
        sequence = new ReadInFASTA();
        sequence.read();
        sequenceLength = sequence.getLength();
        singleSeq = new DNASeq(sequence.read(), sequenceLength);
        System.gc();
        createSA sa = new createSA();
        sa.create(singleSeq);
        new computeBWT(sequence.read());
    }
}

