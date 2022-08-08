import java.util.*;

public class ProteinTranslator {

    private HashMap<String, List<String>> sequences = new HashMap<>();

    List<String> translate(String rnaSequence) {
        if (rnaSequence.length() <3){
            throw new IllegalArgumentException("Problem");
        }
        boolean breakNow = false;
        List<String> res = new ArrayList<>();
        String[] splitted = rnaSequence.split("(?<=\\G.{" + 3 + "})");
        sequences.put("Methionine", Arrays.asList("AUG"));
        sequences.put("Phenylalanine", Arrays.asList("UUU", "UUC"));
        sequences.put("Leucine", Arrays.asList("UUA", "UUG"));
        sequences.put("Serine", Arrays.asList("UCU", "UCC", "UCA", "UCG"));
        sequences.put("Tyrosine", Arrays.asList("UAU", "UAC"));
        sequences.put("Cysteine", Arrays.asList("UGU", "UGC"));
        sequences.put("Tryptophan", Arrays.asList("UGG"));
        sequences.put("STOP", Arrays.asList("UAA", "UAG", "UGA"));

        for (String s : splitted) {
            for (Map.Entry<String, List<String>> entry : sequences.entrySet()) {
                if (entry.getValue().contains(s)) {
                    if(entry.getKey().equals("STOP")){
                        breakNow = true;
                        break;
                    }if (breakNow== true){
                        break;
                    }else {
                        res.add(entry.getKey());
                    }
                }

            }


        }

        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    }

    public static void main(String[] args) {

        ProteinTranslator proteinTranslator = new ProteinTranslator();
        System.out.println(proteinTranslator.translate("AUGUUUUCUUAAAUG"));
    }
}
