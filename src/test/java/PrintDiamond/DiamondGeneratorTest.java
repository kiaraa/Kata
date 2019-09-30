package PrintDiamond;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DiamondGeneratorTest {
    @Test
    public void generatesADiamond(){
        DiamondGenerator diamondGenerator = new DiamondGenerator();
        String diamond = diamondGenerator.generateDiamond("A");
        Assertions.assertThat(diamond).isEqualTo("A");
    }

    @Test
    public void generatesBDiamond(){
        DiamondGenerator diamondGenerator = new DiamondGenerator();
        String diamond = diamondGenerator.generateDiamond("B");
        Assertions.assertThat(diamond).isEqualTo(" A\n" +
                "B B\n" +
                " A");
    }

    @Test
    public void generatesCDiamond(){
        DiamondGenerator diamondGenerator = new DiamondGenerator();
        String diamond = diamondGenerator.generateDiamond("C");
        Assertions.assertThat(diamond).isEqualTo("  A\n" +
                " B B\n" +
                "C   C\n" +
                " B B\n" +
                "  A");
    }

    @Test
    public void generatesQDiamond(){
        DiamondGenerator diamondGenerator = new DiamondGenerator();
        String diamond = diamondGenerator.generateDiamond("Q");
        Assertions.assertThat(diamond).isEqualTo("                A\n" +
                "               B B\n" +
                "              C   C\n" +
                "             D     D\n" +
                "            E       E\n" +
                "           F         F\n" +
                "          G           G\n" +
                "         H             H\n" +
                "        I               I\n" +
                "       J                 J\n" +
                "      K                   K\n" +
                "     L                     L\n" +
                "    M                       M\n" +
                "   N                         N\n" +
                "  O                           O\n" +
                " P                             P\n" +
                "Q                               Q\n" +
                " P                             P\n" +
                "  O                           O\n" +
                "   N                         N\n" +
                "    M                       M\n" +
                "     L                     L\n" +
                "      K                   K\n" +
                "       J                 J\n" +
                "        I               I\n" +
                "         H             H\n" +
                "          G           G\n" +
                "           F         F\n" +
                "            E       E\n" +
                "             D     D\n" +
                "              C   C\n" +
                "               B B\n" +
                "                A");
    }

    @Test
    public void showsErrorWithBadInput(){
        DiamondGenerator diamondGenerator = new DiamondGenerator();
        String response = diamondGenerator.generateDiamond("invalid input");
        Assertions.assertThat(response).isEqualTo("Invalid. Please enter a single capital letter.");
    }
}