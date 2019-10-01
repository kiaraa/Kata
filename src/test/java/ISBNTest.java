import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ISBNTest {

    @Test
    public void returnsFalseWithInvalidInput(){
        ISBN isbn = new ISBN();
        boolean valid = isbn.checkIfValidISBN13("obviously invalid input");
        Assertions.assertThat(valid).isFalse();
    }

    @Test
    public void returnTrueFor9780470059029(){
        ISBN isbn = new ISBN();
        boolean valid = isbn.checkIfValidISBN13("9780470059029");
        Assertions.assertThat(valid).isTrue();
    }

    @Test
    public void returnTrueFor978_047_005_902_9(){
        ISBN isbn = new ISBN();
        boolean valid = isbn.checkIfValidISBN13("978-047-005-902-9");
        Assertions.assertThat(valid).isTrue();
    }

    @Test
    public void returnTrueFor9780470059029WithSpaces(){
        ISBN isbn = new ISBN();
        boolean valid = isbn.checkIfValidISBN13("978 047 005 902 9");
        Assertions.assertThat(valid).isTrue();
    }

    @Test
    public void returnTrueFor9783161484100(){
        ISBN isbn = new ISBN();
        boolean valid = isbn.checkIfValidISBN13("978-3-16-148410-0");
        Assertions.assertThat(valid).isTrue();
    }

    @Test
    public void returnFalseFor9783161484102(){
        ISBN isbn = new ISBN();
        boolean valid = isbn.checkIfValidISBN13("9783161484102");
        Assertions.assertThat(valid).isFalse();
    }

    @Test
    public void returnFalseFor9783161484103(){
        ISBN isbn = new ISBN();
        boolean valid = isbn.checkIfValidISBN13("978-3-16-148410-3");
        Assertions.assertThat(valid).isFalse();
    }
}