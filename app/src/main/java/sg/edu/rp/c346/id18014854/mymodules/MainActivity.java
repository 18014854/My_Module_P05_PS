package sg.edu.rp.c346.id18014854.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //event handling step 1
    TextView tvC346;
    TextView tvC349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //event handling step 2
        tvC346 = findViewById(R.id.textView346);
        tvC349 = findViewById(R.id.textView349);

        //event handling step 3
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Sem", "1");
                intent.putExtra("MC", "4");
                intent.putExtra("Venue", "W67R");
                startActivity(intent);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C349");
                intent.putExtra("Name", "iPad Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Sem", "1");
                intent.putExtra("MC", "4");
                intent.putExtra("Venue", "W66R");
                startActivity(intent);
            }
        });
    }
}
