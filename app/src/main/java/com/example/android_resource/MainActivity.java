package com.example.android_resource;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudeopciones,menu);

        return true  ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.mQRCODE:

                Intent anterior = new Intent(this, Q_R_CODE.class);
                startActivity(anterior);

                break;

            case R.id.mVOZ:

                Intent anterior11 = new Intent(this,AtivaRechonecimentoVoz.class);
                startActivity(anterior11);

                break;
            case R.id.mTarefas:
                listview();
                break;


            }
                return true;

    }

    public boolean listview(){

        setContentView( R.layout.activity_listview);


        listView = findViewById(R.id.listview);

        String[] values = new String[] {
                "1. Passo", "2. Passo", "3. Passo", "4. Passo",
                "5. Passo"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    setContentView(R.layout.activity_listview1_passo1);

                }
                if(position == 1){
                    setContentView(R.layout.activity_listview1_passo2);
                }
                if(position == 2){
                    setContentView(R.layout.activity_listview1_passo3);
                }
                if(position == 3){
                    setContentView(R.layout.activity_listview1_passo4);
                }
                if(position == 4){
                    setContentView(R.layout.activity_listview1_passo5);
                }

            }
        });
        return true;
    }


    public void Anterior( View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    @Override
    public boolean dispatchKeyEvent( KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_UP:
                if (action == KeyEvent.ACTION_DOWN) {

                    listview();
                }
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO

                    Intent anterior = new Intent(this, MainActivity.class);
                    startActivity(anterior);

                }
                return true;
            default:
                return super.dispatchKeyEvent(event);
        }
    }

    private void siguiente( Intent siguiente ) {

        startActivity( siguiente );

    }
    private void anterior( Intent anterior ) {

        startActivity( anterior );
    }



}
