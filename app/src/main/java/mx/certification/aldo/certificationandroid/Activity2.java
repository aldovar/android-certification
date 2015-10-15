package mx.certification.aldo.certificationandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Activity2 extends AppCompatActivity {

    private Button button1;

    private Button button2;

    private Button button3;

    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_2);

        button1= (Button) findViewById(R.id.button1);

        button2= (Button) findViewById(R.id.button2);

        button3= (Button) findViewById(R.id.button3);

        button4= (Button) findViewById(R.id.button4);

        button1.setOnClickListener(buttonEvent);
        button2.setOnClickListener(buttonEvent);
        button3.setOnClickListener(buttonEvent);
        button4.setOnClickListener(buttonEvent);

    }

    private View.OnClickListener buttonEvent= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v==button1){
                Intent intent= new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }else if(v==button2){
                Intent intent= new Intent(Activity2.this,MainActivity.class);
                intent.putExtra("hello","I am a hello");
                intent.putExtra("number",1);
                startActivity(intent);
            }else if(v==button3){
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.mx"));
                startActivity(intent);
            }else if(v==button4){
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:555555555"));
                startActivity(intent);
            }
            }
    };
}
