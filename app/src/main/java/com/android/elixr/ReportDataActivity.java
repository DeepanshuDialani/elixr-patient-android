package com.android.elixr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.android.elixr.models.ReportData;

public class ReportDataActivity extends AppCompatActivity {

    private ListView listView;
    private ReportDataAdapter reportDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViews();
    }

    private void initViews() {
        listView = (ListView) findViewById(R.id.listView);
        Intent intent = getIntent();
        ReportData reportData = (ReportData) intent.getSerializableExtra(ElixrGcmListenerService.REPORT_DATA_KEY);

        reportDataAdapter = new ReportDataAdapter(this, reportData.getFieldList());
        listView.setAdapter(reportDataAdapter);
    }

}
