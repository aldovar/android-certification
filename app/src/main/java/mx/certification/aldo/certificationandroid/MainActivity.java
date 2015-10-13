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

public class MainActivity extends AppCompatActivity {

    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout= new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        myButton= new Button(this);
        myButton.setText("Press!");

        LinearLayout.LayoutParams layoutParams=
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        myButton.setLayoutParams(layoutParams);

        myButton.setOnClickListener(event);
        linearLayout.addView(myButton);

        LinearLayout.LayoutParams layoutParamsLinear=
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        linearLayout.setLayoutParams(layoutParamsLinear);

        setContentView(linearLayout);
        //myButton=(Button)findViewById(R.id.button);
    }

    private View.OnClickListener event= new View.OnClickListener(){
        @Override
        public void onClick(View view){
                if(view==myButton){
                    Intent intent= new Intent(MainActivity.this, Activity2.class);
                    startActivity(intent);
                    finish();

                }
        }
    };

}
