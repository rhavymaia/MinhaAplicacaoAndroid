package minhaaplicacao.ifpb.edu.br.minhaaplicacaoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button button = (Button) findViewById(R.id.notificacaoButton);
        button.setOnClickListener(new NotificationOnClickListener());
    }
}
