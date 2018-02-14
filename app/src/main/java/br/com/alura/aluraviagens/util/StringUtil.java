package br.com.alura.aluraviagens.util;

/**
 * Created by rodrigo on 14/02/2018.
 */

public class StringUtil {

    public static final String DIAS = "dias";
    public static final String DIA = "dia";

    public static String formateDias(int qtde_dias) {
        return String.format("%d %s", qtde_dias, (qtde_dias > 1 ? DIAS : DIA));
    }
}
