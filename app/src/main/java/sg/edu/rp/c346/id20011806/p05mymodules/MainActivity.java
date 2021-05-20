package sg.edu.rp.c346.id20011806.p05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346;
    TextView c349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.textViewC346);
        c349 = findViewById(R.id.textViewC349);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("modName", "Android Programming");
                i.putExtra("modCode", "C346");
                i.putExtra("acadYear", 2021);
                i.putExtra("Semester", 1);
                i.putExtra("modCred", 4);
                i.putExtra("Venue", "E62E");
                startActivity(i);
            }
        });

        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("modName", "iPad Programming");
                i.putExtra("modCode", "C349");
                i.putExtra("acadYear", 2021);
                i.putExtra("Semester", 1);
                i.putExtra("modCred", 3);
                i.putExtra("Venue", "W67M");
                startActivity(i);
            }
        });

    }
}