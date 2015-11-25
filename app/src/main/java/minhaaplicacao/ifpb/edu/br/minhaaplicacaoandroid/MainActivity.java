package minhaaplicacao.ifpb.edu.br.minhaaplicacaoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity implements Runnable{

    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(this, SPLASH_TIME_OUT);
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
        finish();
    }
}
