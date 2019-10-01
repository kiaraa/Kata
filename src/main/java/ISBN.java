import java.util.ArrayList;

public class ISBN {

    public boolean checkIfValidISBN13(String input) {
        String cleanInput = getCleanInput(input);

        if (!cleanInput.matches("[0-9]{13}")){
            return false;
        }

        int checksum = findCorrectISBN13Checksum(cleanInput);

        char lastChar = cleanInput.charAt(cleanInput.length() - 1);
        Integer lastDigit = Integer.parseInt(String.valueOf(lastChar));

        if (lastDigit != checksum){
            return false;
        }

        return true;
    }

    private String getCleanInput(String input) {
        String [] splitInputOnDash = input.split("-");
        StringBuilder noDashInput = new StringBuilder();

        for(String segment : splitInputOnDash){
            noDashInput.append(segment);
        }

        String [] splitInputOnSpace = noDashInput.toString().split(" ");
        StringBuilder noSpaceInput = new StringBuilder();

        for(String segment : splitInputOnSpace){
            noSpaceInput.append(segment);
        }

        String cleanInput = noSpaceInput.toString();
        return  cleanInput;
    }

    private int findCorrectISBN13Checksum(String cleanInput) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for (char c : cleanInput.toCharArray()) {
            digits.add(Integer.parseInt(String.valueOf(c)));
        }

        int checksum = 0;
        for (int i=0; i < digits.size() - 1; i++){
            if((i + 1) % 2 != 0) {
                checksum += digits.get(i);
            }
            else{
                checksum += (digits.get(i) * 3);
            }

        }

        checksum = checksum % 10;
        checksum = 10 - checksum;
        checksum = checksum % 10;

        return checksum;
    }
    
}
