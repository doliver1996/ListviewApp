package co.edu.uninorte.listviewapp;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.jar.Attributes;

/**
 * Created by danie on 26/02/2018.
 */

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] Name,LastName,Posicion,ONOFF;
    private TextView txtName, txtApellido,txtposicion,txtOn;
    private Button buttonEdit;

     public CustomAdapter(Context context, String[] Name,String[] LastName,String [] Posicion,String [] ONOFF){





         this.context=context;
         this.Name= Name;
         this.LastName= LastName;
         this.Posicion=Posicion;
         this.ONOFF=ONOFF;
     }
    @Override
    public int getCount() {

        return Name.length;



    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
         String Names= Name[i];
         String LastNames=LastName[i];
         String Posiciones= Posicion[i];
         String ONOff= ONOFF[i];








         String text=Name[i];
         if (view==null){



             LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             view = inflater.inflate(R.layout.row,null);







         }

        txtName= (TextView) view.findViewById(R.id.txtName);
        txtApellido= (TextView) view.findViewById(R.id.txtApellido);
        txtposicion= (TextView) view.findViewById(R.id.txtposicion);
        txtOn= (TextView) view.findViewById(R.id.txtOn);
        buttonEdit= (Button) view.findViewById(R.id.buttonEdit);


        txtName.setText(Names);
        txtApellido.setText(LastNames);
        txtposicion.setText(Posiciones);
        txtOn.setText(ONOff);










        return view;


    }

}
