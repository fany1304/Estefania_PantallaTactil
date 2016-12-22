package com.estefania.pantallatactil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PantallaTactilActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView entrada = (TextView)findViewById(R.id.textViewEntrada);
        entrada.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        TextView salida = (TextView) findViewById(R.id.TextViewSalida);
        //TextView presion = (TextView) findViewById(R.id.TextPresion);
        //TextView tam = (TextView) findViewById(R.id.TextTamanyo);

        //presion.append("\n" + motionEvent.getPressure());
        //tam.append("\n" + motionEvent.getSize());
        salida.append("\n" + motionEvent.toString() + "\n" + "\n" +  "Presion: " + motionEvent.getPressure() + "\n" + "\n" + "Tamaño: " + motionEvent.getSize() + "\n");

        return true;
    }
}
