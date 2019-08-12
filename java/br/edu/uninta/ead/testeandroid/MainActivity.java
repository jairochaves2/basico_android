package br.edu.uninta.ead.testeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTeste;
    EditText etTeste;
    TextView tvMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTeste=findViewById(R.id.btn_teste);
        etTeste=findViewById(R.id.et_teste);
        tvMostrar=findViewById(R.id.tv_mostrar);

        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String texto= etTeste.getText().toString();
               tvMostrar.setText(texto);
            }
        });

    }
}
