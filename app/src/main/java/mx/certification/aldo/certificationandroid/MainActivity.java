package mx.certification.aldo.certificationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button myButton;
    private Spinner spinnerColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton=(Button)findViewById(R.id.button);
        spinnerColor=(Spinner) findViewById(R.id.color_spinner);

        //Implement by Interface definition
        myButton.setOnClickListener(this);

        //Implement by anonymous class
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
        //Implement by intern class
        myButton.setOnClickListener(event);
    }

    private View.OnClickListener event= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };

    @Override
    public void onClick(View v) {
        finish();
    }
}
