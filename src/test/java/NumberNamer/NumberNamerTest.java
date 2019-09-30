package NumberNamer;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NumberNamerTest {

    @Test
    public void translateOne(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(1);
        Assertions.assertThat(result).isEqualTo("one");
    }

    @Test
    public void translateTwo() {
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(2);
        Assertions.assertThat(result).isEqualTo("two");
    }

    @Test
    public void translateThree(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(3);
        Assertions.assertThat(result).isEqualTo("three");
    }

    @Test
    public void translateTen(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(10);
        Assertions.assertThat(result).isEqualTo("ten");
    }

    @Test
    public void translateEleven(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(11);
        Assertions.assertThat(result).isEqualTo("eleven");
    }

    @Test
    public void translateTwenty(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(20);
        Assertions.assertThat(result).isEqualTo("twenty");
    }

    @Test
    public void translateTwentyOne(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(21);
        Assertions.assertThat(result).isEqualTo("twenty one");
    }

    @Test
    public void translateTwentyTwo(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(22);
        Assertions.assertThat(result).isEqualTo("twenty two");
    }

    @Test
    public void nameThirty(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(30);
        Assertions.assertThat(result).isEqualTo("thirty");
    }

    @Test
    public void nameSixtyFour(){
        NumberNamer numberNamer = new NumberNamer();
        String result = numberNamer.name(64);
        Assertions.assertThat(result).isEqualTo("sixty four");
    }
}