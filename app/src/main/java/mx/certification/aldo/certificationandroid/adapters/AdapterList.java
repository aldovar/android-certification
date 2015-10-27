package mx.certification.aldo.certificationandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import mx.certification.aldo.certificationandroid.R;

/**
 * Created by aldo on 26/10/15.
 */
public class AdapterList extends ArrayAdapter<String>{
    private Context context;
    private String[] names;
    private String[] descriptions;
    private int[] idImgs;

    public AdapterList(Context context,int resource, int textViewResourceId, String[] arrayStrings){
        super(context,resource,textViewResourceId,arrayStrings);
        this.context=context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.list_view_customized,parent,false);
        TextView nameText=(TextView)view.findViewById(R.id.image_text);
        TextView descText=(TextView)view.findViewById(R.id.desc_image);

        ImageView imageView= (ImageView) view.findViewById(R.id.image_list);
        nameText.setText(names[position]);
        descText.setText(descriptions[position]);
        imageView.setImageResource(idImgs[position]);

        return view;


    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setIdImgs(int[] idImgs) {
        this.idImgs = idImgs;
    }

    public void setDescriptions(String[] descriptions) {
        this.descriptions = descriptions;
    }
}
