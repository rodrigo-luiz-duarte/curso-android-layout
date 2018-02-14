package br.com.alura.aluraviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by rodrigo on 14/02/2018.
 */

public class MoedaUtil {

    public static final String PORTUGUES = "pt";
    public static final String BRASIL = "BR";

    public static String formateParaBrasileiro(BigDecimal valor) {

        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(new Locale(PORTUGUES, BRASIL));
        String simboloMoeda = formatoBrasileiro.getCurrency().getSymbol();
        return formatoBrasileiro.format(valor).replace(simboloMoeda, simboloMoeda + " ");
    }
}
