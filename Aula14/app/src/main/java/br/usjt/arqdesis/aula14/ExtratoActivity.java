package br.usjt.arqdesis.aula14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.usjt.arqdesis.aula14.model.MovimentacaoDTO;

public class  ExtratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrato);
        addTransactions();
    }

    public void back(View v){
        super.onDestroy();
    }

    public void addTransactions(){
        ListView lv = (ListView) findViewById(R.id.listView1);

        List<String> movimentoList = new ArrayList<>();
        movimentoList.add("Saque");
        movimentoList.add("Lanchonete");
        movimentoList.add("Transferencia");
        movimentoList.add("Hotel Fazenda");
        movimentoList.add("DDO");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, movimentoList);

        lv.setAdapter(adapter);
    }
}
