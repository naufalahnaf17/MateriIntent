package app.android.intentmateri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acitivity_tiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);

        Button btnMoveEmpat = (Button) findViewById(R.id.moveEmpat);
        btnMoveEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(acitivity_tiga.this , activity_empat.class);
                startActivity(intent);
            }
        });
    }
}
