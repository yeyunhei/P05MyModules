package sg.edu.rp.c346.id20011806.p05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCred;
    TextView tvVenue;
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCred = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        goBack = findViewById(R.id.buttonBack);

        Intent i = getIntent();
        String name = i.getStringExtra("modName");
        String code = i.getStringExtra("modCode");
        int year = i.getIntExtra("acadYear", -1);
        int sem = i.getIntExtra("Semester", -1);
        int cred = i.getIntExtra("modCred", -1);
        String venue = i.getStringExtra("Venue");

        tvCode.setText("Module Code: " + code);
        tvName.setText("Module Name: " + name);
        tvYear.setText("Academic Year: " + year);
        tvSem.setText("Semester: " + sem);
        tvCred.setText("Module Credit: " + cred);
        tvVenue.setText("Venue: " + venue);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}