package com.example.passagreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Reader extends AppCompatActivity {
    private TextView mReaderHeader;
    private TextView mPassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        mReaderHeader = findViewById(R.id.reader_header);
        mPassage = findViewById(R.id.passage_read);

        Intent passageIntent = getIntent();
       String passage = passageIntent.getStringExtra(MainActivity.EXTRA_PASSAGE);
       mPassage.setText(passage);


    }
}