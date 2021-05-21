package sg.edu.rp.c346.id20022098.calculate1and2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class CalculatingActivity extends AppCompatActivity {

    EditText EditTextNumber1, EditTextNumber2, EditTextNumber3, EditTextNumber4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculating);

        EditTextNumber1 = findViewById(R.id.editTextNumber1);
        EditTextNumber2 = findViewById(R.id.editTextNumber2);
        EditTextNumber3 = findViewById(R.id.editTextNumber3);
        EditTextNumber4 = findViewById(R.id.editTextNumber4);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("sumValue", 0.0);
        EditTextNumber1.setText(""+ value);
        double value2 = intentReceived.getDoubleExtra("subtractionValue", 0.0);
        EditTextNumber2.setText("" + value2);
        double value3 = intentReceived.getDoubleExtra("productValue", 0.0);
        EditTextNumber3.setText(""+ value3);
        double value4 = intentReceived.getDoubleExtra("divisionValue", 0.0);
        EditTextNumber4.setText(""+ value4);

    }
}