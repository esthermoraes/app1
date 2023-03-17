package nascimento.moraes.esther.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity /*Uma herança entre NextActivity (tela "herdeira") da AppCompatActivity (tela "pai")*/{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next); //Uso do metodo para ligação entre a view e a activity
        Intent i = getIntent();
        String textoDigitado = i.getStringExtra("texto");
        TextView tvTexto = findViewById(R.id.tvTexto);//Uso do método findViewById para a localização do TextView
        tvTexto.setText(textoDigitado);
    }
}