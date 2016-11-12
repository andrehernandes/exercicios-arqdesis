package br.usjt.arqdesis.aula15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class  ExtratoActivity extends AppCompatActivity {
    Activity activity;
    List<String> movimentoList;
    public static final String NOME = "";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrato);
        ListView lv = (ListView) findViewById(R.id.listView1);
        activity = this;
        addTransactions(lv);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(activity, DetalheExtratoActivity.class);
                intent.putExtra(NOME, movimentoList.get(position));
                startActivity(intent);
            }
        });
    }

    public void back(View v){
        super.onDestroy();
    }

    public void addTransactions(ListView lv){
        movimentoList = new ArrayList<>();

        movimentoList.add("Saque");
        movimentoList.add("Lanchonete");
        movimentoList.add("Transferencia");
        movimentoList.add("Hotel Fazenda");
        movimentoList.add("DDO");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, movimentoList);
        activity = this;
        lv.setAdapter(adapter);
    }
}
