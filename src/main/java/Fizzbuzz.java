public class Fizzbuzz {
    public String generate(int upto) {
        String returnList = "";
        for (int i = 1; i <= upto; i++) {
            if (i % 3 == 0) {
                returnList += "Fizz";
            } else {
                returnList += Integer.toString(i);
            }
            if (i != upto) {
                returnList += ", ";
            }
        }
        return returnList;
    }
}
