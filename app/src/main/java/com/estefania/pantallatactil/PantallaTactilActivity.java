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
        //salida.append("\n" + "\n" +  "Presion: " + motionEvent.getPressure() + "\n" + "\n" + "Tamaño: " + motionEvent.getSize() + "\n");

        String acciones[] = {"ACTION_DOWN", "ACTION_UP", "ACTION_MOVE", "ACTION_CANCEL", "ACTION_OUTSIDE", "ACTION_POINTER_DOWN", "ACTION_POINTER_UP"};
        int accion = motionEvent.getAction();
        int codigoAccion = accion & MotionEvent.ACTION_MASK;
        int iPuntero = (accion & MotionEvent.ACTION_POINTER_INDEX_MASK) >> MotionEvent.ACTION_POINTER_INDEX_SHIFT;
        salida.append("\n" + acciones[codigoAccion]);
        salida.append("Generada por puntero: " + iPuntero);

        for(int i = 0; i < motionEvent.getPointerCount(); i++){

            salida.append("\npuntero: " + motionEvent.getPointerId(i) + " x: " + motionEvent.getX(i) + " y: " + motionEvent.getY(i));

        }

        salida.append("\n");


        return true;
    }
}
