package com.example.passagreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mHeaderText;
    private TextView mPassageOne;
    private TextView mPassageTwo;
    private TextView mPassageThree;

    public static final String EXTRA_PASSAGE = "com.example.android.passagereader.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHeaderText = findViewById(R.id.textView_header);
        mPassageOne = findViewById(R.id.textView_passage1);
        mPassageTwo = findViewById(R.id.textView_passage2);
        mPassageThree = findViewById(R.id.textView_passage3);
    }

    public void readPassage(View view) {
        if (view == findViewById(R.id.button_passage1)){
            Intent intent = new Intent(this, Reader.class);
            String passage1 = mPassageOne.getText().toString();

            intent.putExtra(EXTRA_PASSAGE, passage1);
            startActivity(intent);

        }
        else if (view == findViewById(R.id.button_passage2)){
            Intent intent = new Intent(this, Reader.class);
            String passage2 = mPassageTwo.getText().toString();

            intent.putExtra(EXTRA_PASSAGE, passage2);
            startActivity(intent);

        }
        else if (view == findViewById(R.id.button_passage3)){
            Intent intent = new Intent(this, Reader.class);
            String passage3 = mPassageThree.getText().toString();

            intent.putExtra(EXTRA_PASSAGE, passage3);
            startActivity(intent);

        }



    }

//    public void readPassageTwo(View view) {
//        Intent intent = new Intent(this, Reader.class);
//        String passage2 = mPassageTwo.getText().toString();
//        intent.putExtra(EXTRA_PASSAGE, passage2);
//
//        startActivity(intent);
//    }

//    public void readPassageThree(View view) {
//        Intent intent = new Intent(this, Reader.class);
//        String passage3 = mPassageThree.getText().toString();
//        intent.putExtra(EXTRA_PASSAGE, passage3);
//        startActivity(intent);
//    }
}