package com.testapp1;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner cyberFoodSpinner;
    private Button btnSearch;
    private ImageButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            cyberFoodSpinner = findViewById(R.id.cyberFoodSpinner);
            btnSearch = findViewById(R.id.btnSearch);
            addBtn = findViewById(R.id.addBtn);


            cyberFoodSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(MainActivity.this, cyberFoodSpinner.getSelectedItem().toString() + " selcted", Toast.LENGTH_SHORT).show();
//                    switch ()
                    if (cyberFoodSpinner.getSelectedItem().equals("Face to face")){

                        btnSearch.setOnClickListener(view1 -> {
                            Uri uri = Uri.parse("https://www.facetoface.com.my/");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        });

                    }
                    if (cyberFoodSpinner.getSelectedItem().equals("Hinz")){

                        btnSearch.setOnClickListener(view12 -> {
                            Uri uri = Uri.parse("https://www.facebook.com/HinzKitchen/");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        });

                    }
                    if (cyberFoodSpinner.getSelectedItem().equals("Mama rice")){

                        btnSearch.setOnClickListener(view13 -> {
                            Uri uri = Uri.parse("https://www.facebook.com/people/Mama-Homecook-Mixed-Rice/100054319520299/");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        });

                    }
                    if (cyberFoodSpinner.getSelectedItem().equals("Re Yue Ming")){

                        btnSearch.setOnClickListener(view14 -> {
                            Uri uri = Uri.parse("https://www.yummyadvisor.my/cyberjaya/restaurant-ri-yue-ming-cyberjaya/");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        });

                    }
                    if (cyberFoodSpinner.getSelectedItem().equals("Mcdonald")){

                        btnSearch.setOnClickListener(view15 -> {
                            Uri uri = Uri.parse("https://www.mcdonalds.com.my/");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        });

                    }
                    if (cyberFoodSpinner.getSelectedItem().equals("KFC")){

                        btnSearch.setOnClickListener(view16 -> {
                            Uri uri = Uri.parse("https://kfc.com.my/?gclid=CjwKCAiAp7GcBhA0EiwA9U0mtmMteNY2k-vyqGrPSKHBQ85jQ_WQqtPj9KneCGRvN3K1D-PGNe9CpxoCxMsQAvD_BwE&gclsrc=aw.ds");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        });

                    }
                    if (cyberFoodSpinner.getSelectedItem().equals("Dpulze")){

                        btnSearch.setOnClickListener(view17 -> {
                            Uri uri = Uri.parse("https://www.cyberjayacity.com/full-list-of-restaurants-cafes-and-diners-in-dpulze-cyberjaya/");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        });

                    }

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


            addBtn.setOnClickListener(v -> {

                Intent intent = new Intent(MainActivity.this,addBtnActivity.class);
                startActivity(intent);

            });

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_menu, menu);
            return true;
        }



}