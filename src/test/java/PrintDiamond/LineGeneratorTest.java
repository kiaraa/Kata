package PrintDiamond;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LineGeneratorTest {

    @Test
    public void returnCorrectPlaceInAlphabetA(){
        LineGenerator lineGenerator = new LineGenerator();
        int place = LineGenerator.getPlaceInAlphabet("A");
        Assertions.assertThat(place).isEqualTo(0);
    }

    @Test
    public void returnCorrectPlaceInAlphabetB(){
        LineGenerator lineGenerator = new LineGenerator();
        int place = LineGenerator.getPlaceInAlphabet("B");
        Assertions.assertThat(place).isEqualTo(1);
    }

    @Test
    public void returnCorrectPlaceInAlphabetC(){
        LineGenerator lineGenerator = new LineGenerator();
        int place = LineGenerator.getPlaceInAlphabet("C");
        Assertions.assertThat(place).isEqualTo(2);
    }

    @Test
    public void returnCorrectPlaceInAlphabetZ(){
        LineGenerator lineGenerator = new LineGenerator();
        int place = LineGenerator.getPlaceInAlphabet("Z");
        Assertions.assertThat(place).isEqualTo(25);
    }

    @Test
    public void returnNegOneForInvalidEntries(){
        LineGenerator lineGenerator = new LineGenerator();
        int place = LineGenerator.getPlaceInAlphabet("invalid");
        Assertions.assertThat(place).isEqualTo(-1);
    }

    @Test
    public void generateFirstLineForADiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(0,"A");
        Assertions.assertThat(line).isEqualTo("A");
    }

    @Test
    public void generateFirstLineForBDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(0,"B");
        Assertions.assertThat(line).isEqualTo(" A");
    }

    @Test
    public void generateFirstLineCDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(0, "C");
        Assertions.assertThat(line).isEqualTo("  A");
    }

    @Test
    public void generateFirstLineZDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(0, "Z");
        Assertions.assertThat(line).isEqualTo("                         A");
    }

    @Test
    public void returnErrorStringForInvalidLetter(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(0, "invalid");
        Assertions.assertThat(line).isEqualTo("Invalid input");
    }

    @Test
    public void generateSecondLineBDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(1,"B");
        Assertions.assertThat(line).isEqualTo("B B");
    }

    @Test
    public void generateLastLineBDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(2, "B");
        Assertions.assertThat(line).isEqualTo(" A");
    }

    @Test
    public void generateLastLineCDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(4, "C");
        Assertions.assertThat(line).isEqualTo("  A");
    }

    @Test
    public void generateLastLineDDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(6, "D");
        Assertions.assertThat(line).isEqualTo("   A");
    }

    @Test
    public void generateLastLineEDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(8, "E");
        Assertions.assertThat(line).isEqualTo("    A");
    }

    @Test
    public void generateLastLineQDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(32, "Q");
        Assertions.assertThat(line).isEqualTo("                A");
    }

    @Test
    public void generateSecondLineCDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(1, "C");
        Assertions.assertThat(line).isEqualTo(" B B");
    }

    @Test
    public void generateThirdLineCDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(2, "C");
        Assertions.assertThat(line).isEqualTo("C   C");
    }

    @Test
    public void generateEleventhLineQDiamond(){
            LineGenerator lineGenerator = new LineGenerator();
            String line = lineGenerator.generateLine(10, "Q");
            Assertions.assertThat(line).isEqualTo("      K                   K");
    }

    @Test
    public void generateSeventeenthLineQDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(16, "Q");
        Assertions.assertThat(line).isEqualTo("Q                               Q");
    }

    @Test
    public void generateEighteenthLineQDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(17, "Q");
        Assertions.assertThat(line).isEqualTo(" P                             P");
    }

    @Test
    public void generateTwentySixthLineQDiamond(){
        LineGenerator lineGenerator = new LineGenerator();
        String line = lineGenerator.generateLine(25, "Q");
        Assertions.assertThat(line).isEqualTo("         H             H");
    }
}