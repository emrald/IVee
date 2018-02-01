package com.androidtutorialpoint.horizontallistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    String category_name;
    Bundle bn;
    TextView tvdetailstext;
    ImageView imgclose;
    EditText edtzipcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvdetailstext = (TextView)findViewById(R.id.tvdetailstext);
        imgclose = (ImageView)findViewById(R.id.imgclose);
        edtzipcode = (EditText)findViewById(R.id.edtzipcode);

        edtzipcode.setText("92865");
        edtzipcode.setSelection(edtzipcode.getText().length());
        bn = getIntent().getExtras();
        if(bn!=null)
        {
            category_name = bn.getString("category_name");
        }
        tvdetailstext.setText(category_name+"");

        imgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                DetailsActivity.this.finish();
            }
        });
    }
}
