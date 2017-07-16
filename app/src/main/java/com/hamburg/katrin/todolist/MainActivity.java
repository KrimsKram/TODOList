package com.hamburg.katrin.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View arg0) {
                                          Intent viewIntent = new Intent(MainActivity.this, NewListActivity.class);
                                          startActivity(viewIntent);
                                      }
                                  }
            );
    }

    /*---unnötig geworden durch den Listener: ---*/
   /* public void createNewList(View view) { //import with alt + enter
        Intent intent = new Intent(MainActivity.this, NewListActivity.class);
        startActivity(intent);
    }
    */


}
