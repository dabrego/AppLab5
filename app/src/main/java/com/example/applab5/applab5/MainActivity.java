package com.example.applab5.applab5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button suma = (Button)findViewById(R.id.btnCalcularSuma);
        suma.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.btnCalcularResta); resta.setOnClickListener(this);
        Button multiplicacion = (Button)findViewById(R.id.btnCalcularMultiplicacion); multiplicacion.setOnClickListener(this);
        Button division = (Button)findViewById(R.id.btnCalcularDivision); division.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /*

    private View.OnClickListener OkListener = new View.OnClickListener(){
        public void onClick(View view){

            if (v.getId() == R.id.btnCalcularSuma) {
                calcularSuma();
            }
            if (v.getId() == R.id.btnCalcularResta) {
                calcularResta();
            }
            if (v.getId() == R.id.btnCalcularMultiplicacion) {
                calcularMultiplicacion();
            }
            if (v.getId() == R.id.btnCalcularDivision) {
                calcularDivision();
            }
        }
    };
*/
    @Override
    public void onClick (View v)
    {
        if (v.getId() == R.id.btnCalcularSuma) { calcularSuma();
        }
        if (v.getId() == R.id.btnCalcularResta) { calcularResta();
        }
        if (v.getId() == R.id.btnCalcularMultiplicacion) { calcularMultiplicacion();
        }
        if (v.getId() == R.id.btnCalcularDivision) {
            calcularDivision();
        }
    }

    public void calcularSuma(){
        int totalSuma = 0;
        try {
        EditText numero1 = (EditText)findViewById(R.id.etNumero1);
        EditText numero2 = (EditText)findViewById(R.id.etNumero2);

        int intNumero1 = Integer.parseInt(numero1.getText().toString());
        int intNumero2 = Integer.parseInt(numero2.getText().toString());
        totalSuma = intNumero1 + intNumero2;
        }catch(Exception e){
           // Toast.makeText(this, "Solo valores numericos: "+totalSuma,Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "El Resultado de la Suma es: "+totalSuma,Toast.LENGTH_LONG).show();
    }

    public void calcularResta(){
        int totalResta = 0;
        try {
            EditText numero1 = (EditText)findViewById(R.id.etNumero1);
            EditText numero2 = (EditText)findViewById(R.id.etNumero2);

            int intNumero1 = Integer.parseInt(numero1.getText().toString());
            int intNumero2 = Integer.parseInt(numero2.getText().toString());
            totalResta = intNumero1 - intNumero2;
        }catch(Exception e){
            //
        }
        Toast.makeText(this, "El Resultado de la Resta es: "+totalResta,Toast.LENGTH_LONG).show();
    }

    public void calcularMultiplicacion(){
        int totalMultiplicacion = 0;
        try {
            EditText numero1 = (EditText)findViewById(R.id.etNumero1);
            EditText numero2 = (EditText)findViewById(R.id.etNumero2);

            int intNumero1 = Integer.parseInt(numero1.getText().toString());
            int intNumero2 = Integer.parseInt(numero2.getText().toString());
            totalMultiplicacion = intNumero1 * intNumero2;
        }catch(Exception e){
            //
        }
        Toast.makeText(this, "El Resultado de la Multiplicación es: "+totalMultiplicacion,Toast.LENGTH_LONG).show();
    }
    public void calcularDivision(){
        int totalDivision = 0;
        try {
            EditText numero1 = (EditText)findViewById(R.id.etNumero1);
            EditText numero2 = (EditText)findViewById(R.id.etNumero2);

            int intNumero1 = Integer.parseInt(numero1.getText().toString());
            int intNumero2 = Integer.parseInt(numero2.getText().toString());
            totalDivision = intNumero1 / intNumero2;
        }catch(Exception e){
            //
        }
        Toast.makeText(this, "El Resultado de la División es: "+totalDivision,Toast.LENGTH_LONG).show();
    }
}
