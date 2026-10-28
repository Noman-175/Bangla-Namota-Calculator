package com.example.looppart2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    EditText ed1, ed2;
    Button myButton;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        myButton = findViewById(R.id.myButton);
        tvDisplay = findViewById(R.id.tvDisplay);



        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String sSting = ed1.getText().toString();
               String ssString = ed2.getText().toString();





               tvDisplay.setText(" তোমার নামতা ");



                if (sSting.length()>0 && ssString.length()>0){

                    int iInt = Integer.parseInt(sSting);
                    int iiInt = Integer.parseInt(ssString);




                    for (int i = iInt; i <= iiInt; i++) {

                        tvDisplay.append("\n" + i + " এর নামতা\n");

                        for (int x = 1; x <= 10; x++) {

                            int mul = i * x;

                            tvDisplay.append(i + " × " + x + " = " + mul + "\n");

                        }
                    }





                }else {

                    ed1.setError("Please Inter the Number");
                    ed2.setError("Please Inter the Number");
                    tvDisplay.setText("Please Inter the Number");

                }





            }
        });








    }
}