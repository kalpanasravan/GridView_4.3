package com.kalpana.user.gridview_43.adapter;

import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.kalpana.user.gridview_43.R;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * Created by new user on 06-04-2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    /* create a new ImageView for each item referenced by the Adapter**/
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(58,58,58,58);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keeping all Images in array
    public Integer[] mThumbIds = {
            R.drawable.kitkat_new1, R.drawable.gingerbread,0,
            R.drawable.honeycomb, R.drawable.icreamimage,0,
            R.drawable.jellybean, R.drawable.lollipop,0,
           };
}
