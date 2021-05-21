package sg.edu.rp.c346.id20022098.calculate1and2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1, editTextNum2;
    Button btnCalculate;
    double sum = 0;
    double subtraction = 0;
    double product = 0;
    double division = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.editTextNumber1);
        editTextNum2 = findViewById(R.id.editTextNumber2);
        btnCalculate = findViewById(R.id.buttonCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());

                sum = num1 + num2;
                subtraction = num1 - num2;
                product = num1 * num2;
                division = num1/num2;

                Intent intent = new Intent(MainActivity.this, CalculatingActivity.class);
                intent.putExtra("sumValue", sum);
                intent.putExtra("subtractionValue", subtraction);
                intent.putExtra("productValue", product);
                intent.putExtra("divisionValue", division);
                startActivity(intent);
            }
        });
    }
}