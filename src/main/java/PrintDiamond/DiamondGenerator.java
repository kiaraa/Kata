package PrintDiamond;

import java.util.ArrayList;

public class DiamondGenerator {

    LineGenerator lineGenerator;
    ArrayList<String> alphabet;

    public DiamondGenerator() {
        this.lineGenerator = new LineGenerator();
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");
        this.alphabet = alphabet;
    }


    public String generateDiamond(String finalLetter) {
        if (alphabet.contains(finalLetter)){
            StringBuilder builder = new StringBuilder();

            int totalLines = (alphabet.indexOf(finalLetter) - 1) * 2 + 2;

            for (int i = 0; i <= totalLines; i++) {
                if (i < totalLines){
                    builder.append(lineGenerator.generateLine(i, finalLetter) + "\n");
                }
                else{
                    builder.append(lineGenerator.generateLine(i, finalLetter));
                }

            }

            return builder.toString();
        }
        return "Invalid. Please enter a single capital letter.";
    }
}
