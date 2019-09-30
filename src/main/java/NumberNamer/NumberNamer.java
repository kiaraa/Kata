package NumberNamer;

public class NumberNamer {

    public NumberNamer() {
    }

    public String name(int num){
        String onesPlace = nameOnesPlace(num);
        String tensPlace = nameTensPlace(num);
        if (onesPlace != "" && tensPlace != ""){
            return tensPlace + " " + onesPlace;
        }
        else{
            return tensPlace + onesPlace;
        }
    }

    public String nameOnesPlace(int num){
        if (num < 10 || num > 20){
            switch (num % 10) {
                case 0:
                    return "";
                case 1:
                    return ("one");
                case 2:
                    return("two");
                case 3:
                    return("three");
                case 4:
                    return("four");
                case 5:
                    return("five");
                case 6:
                    return("six");
                case 7:
                    return("seven");
                case 8:
                    return("eight");
                case 9:
                    return("nine");
            }
        }
        return "";
    }

    public String nameTeens(int num){
            switch (num % 10) {
                case 0:
                    return "ten";
                case 1:
                    return "eleven";
                case 2:
                    return "twelve";
                case 3:
                    return "thirteen";
                case 4:
                    return "fourteen";
                case 5:
                    return "fifteen";
                case 6:
                    return "sixteen";
                case 7:
                    return "seventeen";
                case 8:
                    return "eighteen";
                case 9:
                    return "nineteen";
                default:
                    return "";
            }
    }

    public String nameTensPlace(int num){
        if (num < 20 && num > 9){
            return nameTeens(num);
        }
        switch (num / 10){
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }
        return "";
    }
}
