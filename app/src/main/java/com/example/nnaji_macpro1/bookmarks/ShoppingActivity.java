package com.example.nnaji_macpro1.bookmarks;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Nnaji-MacPro1 on 12/26/17.
 */

public class ShoppingActivity extends AppCompatActivity {

    private ListView _listView;
    AlertDialog alertDialogStores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        _listView = findViewById(R.id.listView);


        // Construct the data source
        ArrayList<LinkModel> arrayOfUsers = new ArrayList<LinkModel>();
// Create the adapter to convert the array to views
        CustomListAdapter adapter = new CustomListAdapter(this, arrayOfUsers);
// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        // Add item to adapter
        LinkModel values []= new LinkModel[7];
        values[0] = new LinkModel("ULTA","\twww.ulta.com");
        values[1]= new LinkModel("SEPHORA","\twww.sephora.com");
        values[2] = new LinkModel("JUVIA'S PLACE","\twww.juviasplace.com");
        values[3] = new LinkModel("BH COSMETICS", "\twww.bhcosmetics.com");
        values[4] = new LinkModel("TOO FACE","\twww.tooface.com");
        values[5] = new LinkModel("URBAN DECAY","\twww.urbandecay.com");
        values[6] = new LinkModel("STILA", "\twww.stila.com");

        adapter.addAll(values);


    }


}
