package sg.edu.rp.c346.id18014854.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnBack = findViewById(R.id.button);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Code");
        String name = intentReceived.getStringExtra("Name");
        String year = intentReceived.getStringExtra("Year");
        String sem = intentReceived.getStringExtra("Sem");
        String mc = intentReceived.getStringExtra("MC");
        String venue = intentReceived.getStringExtra("Venue");

        tvDisplay.setText("Module Code: " + code + "\n" +
                "Module Name : " + name + "\n" +
                "Academic Year : " + year + "\n" +
                "Semester: " + sem + "\n" +
                "Module Credit: " + mc + "\n" +
                "Venue: " + venue + "\n");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
