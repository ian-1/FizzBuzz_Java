public class Fizzbuzz {
    public String generate(int upto) {
        String returnList = "";
        for (int i = 1; i <= upto; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    returnList += "Fizz";
                }
                if (i % 5 == 0) {
                    returnList += "Buzz";
                }
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
