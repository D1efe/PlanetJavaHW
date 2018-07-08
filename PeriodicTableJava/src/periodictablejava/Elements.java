package periodictablejava;

import java.util.ArrayList;
import java.util.HashMap;

public class Elements {

    public String proposeSymbol(String x) {

        for (int i = 0; i < x.length(); i++) {
            for (int j = i + 1; j < x.length(); j++) {
                if (x.charAt(i) == x.charAt(j)) {
                    return Character.toString(x.toUpperCase().charAt(i)) + Character.toString(x.charAt(j));
                }

            }

        }

        if (x.length() == 3) {
            return Character.toString(x.toUpperCase().charAt(1)) + Character.toString(x.charAt(2));
        } else {
            return Character.toString(x.toUpperCase().charAt(1)) + x.charAt(x.length() - 2);
        }

    }

    public boolean checkSymbol(String x, String y) {

        String combine;

        for (int i = 0; i < x.length(); i++) {
            for (int j = i + 1; j < x.length(); j++) {
                if (x.charAt(i) == x.charAt(j)) {
                    combine = Character.toString(x.toUpperCase().charAt(i)) + Character.toString(x.charAt(j));
                    if (combine.equals(y)) {
                        return true;
                    }

                }
            }
        }

        if (x.length() == 3) {
            combine = Character.toString(x.toUpperCase().charAt(1)) + Character.toString(x.charAt(2));
            if (combine.equals(y)) {
                return true;
            }
        } else if (x.length() > 3) {
            combine = Character.toString(x.toUpperCase().charAt(1)) + x.charAt(x.length() - 2);
            if (combine.equals(y)) {
                return true;
            }

        }
        return false;

    }

    public boolean chekSymbol(String x, String y) {

        for (int i = 0; i < x.length(); i++) {
            for (int j = i + 1; j < x.length(); j++) {
                if (x.toUpperCase().charAt(i) == y.charAt(0) & x.charAt(j) == y.charAt(1)) {
                    return true;
                }
            }

        }
        return false;
    }

    public String bonusSort(String x) {

        String sortSymbol = "";

        for (int i = 0; i < x.length(); i++) {
            sortSymbol += Character.toString(x.charAt(i));
        }
        System.out.println(sortSymbol);
        return "";
    }

    public void getSymbols(String[] a) {

        HashMap<String, String> elements = new HashMap<>();

        for (String x : a) {
            for (int i = 0; i < x.length(); i++) {
                for (int j = i + 1; j < x.length(); j++) {
                    if (x.charAt(i) != x.charAt(j) | x.charAt(i) == x.charAt(j)) {
                        elements.put(a[x.charAt(i) + x.charAt(j)], x);
                    }
                }
            }
        }
        for (String symbol : elements.keySet()) {
            System.out.println("symbol: " + symbol + " belongs to:" + elements.get(symbol));
        }
    }
}
