package nascimento.moraes.esther.app1;
// importando xxxx
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Uso do metodo para ligação entre a view e a activity
        Button btnEnviar = findViewById(R.id.btnEnviar); //Uso do método findViewByld para localizar o Button através do id
        btnEnviar.setOnClickListener(new View.OnClickListener() /*Permite definir uma ação para ser executado ao clicarno botão*/ {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.etDigiteAqui); //Uso do método findViewByld para localizar a EditText através do id
                String textoDigitado = editText.getText().toString(); //Retorna a informação digitada e "coletada" no/do EditText em forma de String
                Intent i = new Intent(MainActivity.this,NextActivity.class); //Definição do componente que deve ser chamado pelo sistema
                i.putExtra("texto", textoDigitado); //
                startActivity(i);
            }
        });
    }
}