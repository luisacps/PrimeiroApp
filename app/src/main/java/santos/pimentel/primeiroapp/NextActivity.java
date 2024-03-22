package santos.pimentel.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        // obtem o intent que navegou ate essa tela
        Intent i = getIntent();
        // obtem o texto que foi colocado na intent
        String texto = i.getStringExtra("texto");
        // obtem a caixa de visualizacao de texto presente na interface
        TextView tv = findViewById(R.id.tvTexto);
        // coloca o texto coletado da intent na caixa de visualizacao de texto
        tv.setText(texto);
    }
}