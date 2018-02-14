package br.com.alura.aluraviagens.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.dao.PacoteDAO;
import br.com.alura.aluraviagens.dominio.Pacote;
import br.com.alura.aluraviagens.ui.adapter.ListaPacotesAdapter;

public class ListaPacotesActivity extends AppCompatActivity {

    public static final String TITULO_APP = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        setTitle(TITULO_APP);

        configureListView();
    }

    private void configureListView() {

        PacoteDAO dao = new PacoteDAO();
        List<Pacote> pacotes = dao.liste();
        ListView listaPacotes = findViewById(R.id.lista_pacotes_lista);
        listaPacotes.setAdapter(new ListaPacotesAdapter(this, pacotes));
    }
}
