package com.yenny.epus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListJurnal extends Activity {

    ListView simpleList;
    String title[] = {"Jurnal Penelitian Pendidikan", "Jurnal Penelitian Perikanan Indonesia","Jurnal Penelitian Sosial dan Ekonomi Kehutanan"};
    int cover[] = {R.drawable.j_jurnalpenelitianpendidikan, R.drawable.j_jurnalpenelitianperikananindonesia, R.drawable.j_jurnalpenelitiansosialdanekonomikehutanan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_jurnal);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), title, cover);
        simpleList.setAdapter(customAdapter);
    }
}
