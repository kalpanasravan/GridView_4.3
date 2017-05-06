package com.kalpana.user.gridview_43;
import com.kalpana.user.gridview_43.adapter.ImageAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
    }
}
