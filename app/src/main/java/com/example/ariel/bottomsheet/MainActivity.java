package com.example.ariel.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bottomSheet = findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);


        //Peek code

//        bottomSheetBehavior.setPeekHeight(200);
//        bottomSheet.post(new Runnable() {
//            @Override
//            public void run() {
//                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
//            }
//        });




        Button showButton = (Button) findViewById(R.id.showButton);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        Button collapseButton = (Button) findViewById(R.id.collapseButton);
        collapseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });

        Button option_1_button = (Button) findViewById(R.id.option_1);
        Button option_2_button = (Button) findViewById(R.id.option_2);
        Button option_3_button = (Button) findViewById(R.id.option_3);
        Button option_4_button = (Button) findViewById(R.id.option_4);


        option_1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what you want to do when option 1 is clicked
                Toast.makeText(getBaseContext(),"option 1 is clicked",Toast.LENGTH_SHORT).show();
            }
        });
        option_2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what you want to do when option 2 is clicked
                Toast.makeText(getBaseContext(),"option 2 is clicked",Toast.LENGTH_SHORT).show();
            }
        });
        option_3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what you want to do when option 3 is clicked
                Toast.makeText(getBaseContext(),"option 3 is clicked",Toast.LENGTH_SHORT).show();
            }
        });
        option_4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what you want to do when option 4 is clicked
                Toast.makeText(getBaseContext(),"option 4 is clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
