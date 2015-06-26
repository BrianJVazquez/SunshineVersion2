package example.com.sunshine.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Brian on 5/9/2015.
 */
public class ViewHolder {

    public final TextView highTempView;
    public final TextView lowTempView;
    public final TextView descriptionView;
    public final TextView dateView;
    public final ImageView iconView;

    public ViewHolder(View view){
        highTempView = (TextView)view.findViewById(R.id.list_item_high_textview);
        lowTempView = (TextView)view.findViewById(R.id.list_item_low_textview);
        descriptionView = (TextView)view.findViewById(R.id.list_item_forecast_textview);
        dateView = (TextView)view.findViewById(R.id.list_item_date_textview);
        iconView = (ImageView)view.findViewById(R.id.list_item_icon);
    }

}