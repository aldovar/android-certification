package mx.certification.aldo.certificationandroid;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import mx.certification.aldo.certificationandroid.list.CustomizedListActivity;
import mx.certification.aldo.certificationandroid.list.SimpleListActivity;

public class ActivityTab extends TabActivity {

    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabHost= getTabHost();

        TabHost.TabSpec tabSpecSimple=tabHost.newTabSpec("simple_list");
        tabSpecSimple.setIndicator("Simple List");
        Intent intentSimpleList= new Intent(this, SimpleListActivity.class);
        tabSpecSimple.setContent(intentSimpleList);

        TabHost.TabSpec tabSpecCustomize=tabHost.newTabSpec("customize_list");
        tabSpecCustomize.setIndicator("Customized List");
        Intent intentCustomixedList= new Intent(this, CustomizedListActivity.class);
        tabSpecCustomize.setContent(intentCustomixedList);

        tabHost.addTab(tabSpecSimple);
        tabHost.addTab(tabSpecCustomize);

    }

}
