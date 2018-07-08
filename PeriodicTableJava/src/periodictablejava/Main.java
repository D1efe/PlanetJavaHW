package periodictablejava;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Elements first = new Elements();

        String[] elements = {"Hydrogen\n"
            + "Helium\n"
            + "Lithium\n"
            + "Beryllium\n"
            + "Boron\n"
            + "Carbon\n"
            + "Nitrogen\n"
            + "Oxygen\n"
            + "Fluorine\n"
            + "Neon\n"
            + "Sodium\n"
            + "Magnesium\n"
            + "Aluminium\n"
            + "Silicon\n"
            + "Phosphorus"};

      getSymbols(elements);

    }

    public static void getSymbols(String[] a) {

        HashMap<String, String> elements = new HashMap<>();

        for (String x : a) {
            for (int i = 0; i < x.length(); i++) {
                for (int j = i + 1; j < x.length(); j++) {
                    if (x.charAt(i) != x.charAt(j)) {
                        elements.put(Character.toString(x.toUpperCase().charAt(i)) + Character.toString(x.toUpperCase().charAt(j)), x);
                    }
                }
            }
        }
        for (String symbol : elements.keySet()) {
            System.out.println("symbol: " + symbol + " belongs to:" + elements.get(symbol));
        }

    }
//     public static void getSymbolsRevised(String[] a) {
//        
//         String symbol = "";
//         
//        for (int i = 0; i < a[i].length(); i++) {
//                for (int j = i + 1; j < a[i].length(); j++) {
//                    symbol += a[i].charAt(j);
//                    if (Character.toString(a[i].charAt(j)) == symbol) {
//                        symbol += Character.toString(a[i].charAt(j+1));
//                    }
//                        
//                    }
//                }
//            
//    }
}
