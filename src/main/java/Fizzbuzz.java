public class Fizzbuzz {
    public String generate(int upto) {
        String returnList = "";
        for (int i = 1; i <= upto; i++) {
            returnList += Integer.toString(i);
            if (i != upto) {
                returnList += ", ";
            }
        }
        return returnList;
    }
}
