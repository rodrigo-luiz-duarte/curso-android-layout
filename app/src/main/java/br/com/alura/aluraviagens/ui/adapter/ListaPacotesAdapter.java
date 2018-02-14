package br.com.alura.aluraviagens.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.dominio.Pacote;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourcesUtil;
import br.com.alura.aluraviagens.util.StringUtil;


/**
 * Created by rodrigo on 13/02/2018.
 */

public class ListaPacotesAdapter extends BaseAdapter {

    private final Context contexto;
    private final List<Pacote> pacotes;

    public ListaPacotesAdapter(Context contexto, List<Pacote> pacotes) {

        this.contexto = contexto;
        this.pacotes = pacotes;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Object getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return pacotes.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(contexto).inflate(R.layout.item_lista_pacote, parent, false);

        Pacote pacote = pacotes.get(position);

        mostreImagemPacote(view, pacote);
        mostreLocalPacote(view, pacote);
        mostreQtdDiasPacote(view, pacote);
        mostrePrecoPacote(view, pacote);

        return view;
    }

    private void mostrePrecoPacote(View view, Pacote pacote) {

        TextView preco = view.findViewById(R.id.item_lista_pacote_preco);
        preco.setText(MoedaUtil.formateParaBrasileiro(pacote.getPreco()));
    }

    private void mostreQtdDiasPacote(View view, Pacote pacote) {

        TextView qtd_dias = view.findViewById(R.id.item_lista_pacote_qtd_dias);
        qtd_dias.setText(StringUtil.formateDias(pacote.getDias()));
    }

    private void mostreLocalPacote(View view, Pacote pacote) {

        TextView local = view.findViewById(R.id.item_lista_pacote_nome_local);
        local.setText(pacote.getLocal());
    }

    private void mostreImagemPacote(View view, Pacote pacote) {

        ImageView img = view.findViewById(R.id.item_lista_pacote_img);
        Drawable drawable = ResourcesUtil.getDrawablePeloNome(contexto, pacote.getImagem());
        img.setImageDrawable(drawable);
    }
}
