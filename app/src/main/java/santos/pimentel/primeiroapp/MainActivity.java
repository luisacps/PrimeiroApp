
package santos.pimentel.primeiroapp;

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
        // leitura do arquivo de layout e construcao de interface
        setContentView(R.layout.activity_main);
        // obtem o botao de enviar presente na interface
        Button btnEnviar = findViewById(R.id.btnEnviar);
        // definicao do que acontece ao clicar no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            // metodo recrutado toda vez que ha um click no botao
            public void onClick(View v) {
                // obtem a caixa de texto presente na interface
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                // captura o texto digitado na caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();
                // cria uma intencao de navegacao da MainActivity para a NextActivity
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                // coloca o texto ja coletado dentro da intencao para que ele seja enviado para a NextActivity
                i.putExtra("texto", textoDigitado);
                // execucao da intencao e navegacao para a proxima tela
                startActivity(i);
            }
        });
    }
}