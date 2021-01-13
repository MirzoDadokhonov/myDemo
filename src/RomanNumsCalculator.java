
import java.util.HashMap;
import java.util.Map;

public class RomanNumsCalculator extends AbstractCalculator {
    private Map<String, Integer> romanNumsToArabian = Map.of(
            "I", 1,
            "II", 2,
            "III", 3,
            "IV", 4,
            "V", 5,
            "VI", 6,
            "VII", 7,
            "VIII", 8,
            "IX", 9,
            "X", 10
    );

    public Map<Integer, String> arabianNumsToRoman = new HashMap<>();


    public RomanNumsCalculator(String x0, String y0, String op) {
        super(x0, y0, op);
        arabianNumsToRoman.put(1, "I");
        arabianNumsToRoman.put(2, "II");
        arabianNumsToRoman.put(3, "III");
        arabianNumsToRoman.put(4, "IV");
        arabianNumsToRoman.put(5, "V");
        arabianNumsToRoman.put(6, "VI");
        arabianNumsToRoman.put(7, "VII");
        arabianNumsToRoman.put(8, "VIII");
        arabianNumsToRoman.put(9, "IX");
        arabianNumsToRoman.put(10, "X");
        arabianNumsToRoman.put(11, "XI");
        arabianNumsToRoman.put(12, "XII");
        arabianNumsToRoman.put(13, "XIII");
        arabianNumsToRoman.put(14, "XIV");
        arabianNumsToRoman.put(15, "XV");
        arabianNumsToRoman.put(16, "XVI");
        arabianNumsToRoman.put(17, "XVII");
        arabianNumsToRoman.put(18, "XVIII");
        arabianNumsToRoman.put(19, "XIX");
        arabianNumsToRoman.put(20, "XX");
        arabianNumsToRoman.put(21, "XXI");
        arabianNumsToRoman.put(24, "XXIV");
        arabianNumsToRoman.put(27, "XXVII");
        arabianNumsToRoman.put(28, "XXVIII");
        arabianNumsToRoman.put(30, "XXX");
        arabianNumsToRoman.put(32, "XXXII");
        arabianNumsToRoman.put(35, "XXXV");
        arabianNumsToRoman.put(36, "XXXVI");
        arabianNumsToRoman.put(40, "XL");
        arabianNumsToRoman.put(42, "XLII");
        arabianNumsToRoman.put(45, "XLV");
        arabianNumsToRoman.put(48, "XLVIII");
        arabianNumsToRoman.put(49, "XLIX");
        arabianNumsToRoman.put(50, "L");
        arabianNumsToRoman.put(54, "LIV");
        arabianNumsToRoman.put(56, "LVI");
        arabianNumsToRoman.put(60, "LX");
        arabianNumsToRoman.put(63, "LXIII");
        arabianNumsToRoman.put(64, "LXIV");
        arabianNumsToRoman.put(70, "LXX");
        arabianNumsToRoman.put(72, "LXXII");
        arabianNumsToRoman.put(80, "LXXX");
        arabianNumsToRoman.put(81, "LXXXI");
        arabianNumsToRoman.put(90, "XC");
        arabianNumsToRoman.put(100, "С");
        if (!romanNumsToArabian.containsKey(x0)) {
            throw new IncorrectNumberException(true, x0);
        } else {
            if (!romanNumsToArabian.containsKey(y0)) {
                throw new IncorrectNumberException(true, y0);
            } else {
                x = romanNumsToArabian.get(x0);
                y = romanNumsToArabian.get(y0);
            }
        }
    }

    @Override
    public void printAns() {
        System.out.println(arabianNumsToRoman.get(ans) == null ? (ans + "\nNo appropriate roman number to use!\nOnly positive numbers are available") : arabianNumsToRoman.get(ans));
    }
}
