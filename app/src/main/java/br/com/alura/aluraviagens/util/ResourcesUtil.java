package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import br.com.alura.aluraviagens.dominio.Pacote;

/**
 * Created by rodrigo on 14/02/2018.
 */

public class ResourcesUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable getDrawablePeloNome(Context contexto, String recurso) {
        Resources resources = contexto.getResources();
        int idDrawable = resources.getIdentifier(recurso, DRAWABLE, contexto.getPackageName());
        return resources.getDrawable(idDrawable);
    }
}
