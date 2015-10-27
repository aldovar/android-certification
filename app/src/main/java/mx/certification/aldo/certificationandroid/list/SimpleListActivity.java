package mx.certification.aldo.certificationandroid.list;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import mx.certification.aldo.certificationandroid.R;

public class SimpleListActivity extends Activity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

       listView= (ListView)findViewById(R.id.simple_list);

        final ArrayAdapter<String> arraySimpleList= new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.simple_list));

        listView.setAdapter(arraySimpleList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("",arraySimpleList.getItem(position));
            }
        });

    }


}
