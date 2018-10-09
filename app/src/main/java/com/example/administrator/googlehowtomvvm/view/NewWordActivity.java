package com.example.administrator.googlehowtomvvm.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.googlehowtomvvm.R;

public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";

    private EditText mEditWordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        mEditWordView = findViewById(R.id.edit_word);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent resultIntent = new Intent();
            int resultCode;
            String words = mEditWordView.getText().toString();
            if(TextUtils.isEmpty(words)){
                resultCode = RESULT_CANCELED;
            }else {
                resultCode = RESULT_OK;
                resultIntent.putExtra(EXTRA_REPLY, words);
            }
            setResult(resultCode, resultIntent);
            finish();
        });
    }
}
