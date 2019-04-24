package no.agens.bugdemo.r8_static_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greetingLabel = findViewById(R.id.activity_main_greeting_label);
        greetingLabel.setText(Greeter.DUMMY.greeting());
    }
}
