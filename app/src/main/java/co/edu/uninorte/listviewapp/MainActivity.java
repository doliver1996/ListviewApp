package co.edu.uninorte.listviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private ListView Lv;
    private TextView txtName, txtApellido,txtposicion,txtOn;
    private Button buttonEdit;
    String Name[],LastName[],Posicion[],OnOff[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lv= (ListView) findViewById(R.id.Listview);
        txtName= (TextView) findViewById(R.id.txtName);
        txtApellido= (TextView) findViewById(R.id.txtApellido);
        txtposicion= (TextView) findViewById(R.id.txtposicion);
        txtOn= (TextView) findViewById(R.id.txtOn);
        buttonEdit= (Button) findViewById(R.id.buttonEdit);

//        String [] values = new String[]{
//                "Radamel Falcao","Yerry Mina","James Rodrigues","Teofilo Gutierres","Abel Aguilar",
//                "Carlos Sanchez"
//
//
//        };
         Name= getResources().getStringArray(R.array.Name);
         LastName= getResources().getStringArray(R.array.LastName);
         Posicion= getResources().getStringArray(R.array.Posicion);
         OnOff= getResources().getStringArray(R.array.ONOFF);

//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        CustomAdapter CustomAdapter = new CustomAdapter(this,Name,LastName,Posicion,OnOff);

        Lv.setAdapter(CustomAdapter);
        Lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }

        });
    }public void editarClick (View view){



        Intent i = new Intent(this,Editar.class);
        startActivityForResult(i ,1);}





}

