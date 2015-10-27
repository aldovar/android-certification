package mx.certification.aldo.certificationandroid.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import mx.certification.aldo.certificationandroid.R;
import mx.certification.aldo.certificationandroid.adapters.AdapterList;

public class CustomizedListActivity extends AppCompatActivity {

    private ListView listViewCustomized;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customized_list);

        listViewCustomized= (ListView) findViewById(R.id.list_view_customized);

        String[] names= getResources().getStringArray(R.array.simple_list);
        String[] descriptions= getResources().getStringArray(R.array.simple_list_description);
        int [] images={R.drawable.android,R.drawable.ios_icon,R.drawable.symbian,R.drawable.windows_phone};

        final AdapterList adapterList= new AdapterList(this,android.R.layout.simple_list_item_1,R.id.desc_image,names);

        adapterList.setContext(this);
        adapterList.setNames(names);
        adapterList.setDescriptions(descriptions);
        adapterList.setIdImgs(images);

        listViewCustomized.setAdapter(adapterList);
        listViewCustomized.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("",adapterList.getItem(position));
            }
        });
    }

}
