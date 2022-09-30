package com.tuan5.bt5_listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView simpleList;
    String countryList[] = {"but bi", "but chi", "but mau"};
    int flags[] = {R.drawable.butmot, R.drawable.buthai, R.drawable.butba};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList	=	 (ListView)findViewById(R.id.simpleListView);
        CustomBaseAdapter adapter	= 	new CustomBaseAdapter(this, countryList, flags);
        simpleList.setAdapter(adapter);
    }

}