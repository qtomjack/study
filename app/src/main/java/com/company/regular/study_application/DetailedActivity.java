package com.company.regular.study_application;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    private static final String TITLE_KEY = "titlekey";
    private static final String DESCRIPTION_KEY = "descriptionkey";
    private static final String IMAGE_KEY = "imagekey";


    public static void start(Context context, String title, String description, int image) {
        Intent intent = new Intent(context, DetailedActivity.class);
        intent.putExtra(TITLE_KEY, title);
        intent.putExtra(DESCRIPTION_KEY, description);
        intent.putExtra(IMAGE_KEY, image);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        String title;
        String text;
        int image;

        Intent intent = getIntent();

        if (intent != null) {
            title = intent.getStringExtra(TITLE_KEY);
            text = intent.getStringExtra(DESCRIPTION_KEY);
            image = intent.getIntExtra(IMAGE_KEY, R.drawable.ic_launcher_background);

            ImageView imageView = findViewById(R.id.image);
            imageView.setImageDrawable(getDrawable(image));
            CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.toolbar_layout);
            collapsingToolbarLayout.setTitle(title);
            TextView textView = findViewById(R.id.text);
            textView.setText(text);
        }


    }
}
