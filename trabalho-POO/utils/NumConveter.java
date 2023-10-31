package fazenda.Colheita.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumConveter {

    static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static int intConverter(String num) throws IOException {
        try {
            return Integer.parseInt(num);
        } catch (RuntimeException e) {
            System.out.println("Formato inválido, Digite novamente");
            num = reader.readLine();
            return intConverter(num);
        }
    }
}
