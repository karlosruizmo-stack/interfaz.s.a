package com.example.interfazsa;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View[] actions = {
                findViewById(R.id.btnBack),
                findViewById(R.id.btnMore),
                findViewById(R.id.btnNotify),
                findViewById(R.id.btnFollowing)
        };
        String[] messages = {
                "Perfil de X",
                "Más opciones",
                "Notificaciones activadas",
                "Ya sigues a esta cuenta"
        };
        for (int i = 0; i < actions.length; i++) {
            final String message = messages[i];
            actions[i].setOnClickListener(v ->
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show());
        }
    }
}
