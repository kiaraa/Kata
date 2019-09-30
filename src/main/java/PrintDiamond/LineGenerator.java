package PrintDiamond;

import java.util.ArrayList;
import java.util.HashMap;

public class LineGenerator {

    private static ArrayList<String> alphabet;


    public LineGenerator() {
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

    public static int getPlaceInAlphabet(String letter) {
        if (alphabet.contains(letter)){
            return alphabet.indexOf(letter);
        }
        return -1;
    }

    public String generateLine(int lineNumber, String finalLetter) {

        if (alphabet.contains(finalLetter)){
            int numOfSpaces = alphabet.indexOf(finalLetter);
            int numOfLines = ((numOfSpaces) * 2);
            StringBuilder builder = new StringBuilder();

            if (lineNumber == 0 || lineNumber == numOfLines){
                while (numOfSpaces > 0){
                    builder.append(" ");
                    numOfSpaces--;
                }

                builder.append("A");
            }

            else if (lineNumber <= alphabet.indexOf(finalLetter)){
                int leadingSpaces = alphabet.indexOf(finalLetter) - lineNumber;
                String letter = alphabet.get(lineNumber);
                while (leadingSpaces > 0){
                    builder.append(" ");
                    leadingSpaces--;
                }

                int middleSpaces = 2 * alphabet.indexOf(letter) - 1;
                builder.append(letter);
                while (middleSpaces > 0){
                    builder.append(" ");
                    middleSpaces--;
                }
                builder.append(letter);
            }

            else {
                int leadingSpaces = lineNumber - alphabet.indexOf(finalLetter);
                String letter = alphabet.get(alphabet.indexOf(finalLetter) - leadingSpaces);
                while (leadingSpaces > 0){
                    builder.append(" ");
                    leadingSpaces--;
                }

                int middleSpaces = 2 * alphabet.indexOf(letter) - 1;
                builder.append(letter);
                while (middleSpaces > 0){
                    builder.append(" ");
                    middleSpaces--;
                }
                builder.append(letter);
            }
            return builder.toString();
        }
        return "Invalid input";
    }
}
