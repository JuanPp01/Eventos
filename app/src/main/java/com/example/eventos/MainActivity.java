package com.example.eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button anclick1;
Button anlong1;
EditText anfocus1;
EditText ankey1;
Button antouch1;
Button ancreate1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anclick1 = findViewById(R.id.button);
        anclick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast= Toast. makeText(getApplicationContext(),"Activastes el Click Juan",Toast. LENGTH_SHORT);
                toast.setMargin(50,50);
                toast.show();
            }
        });
        anlong1 = findViewById(R.id.button2);
        anlong1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast toast= Toast. makeText(getApplicationContext(),"Activastes el Long Juan",Toast. LENGTH_SHORT);
                toast.setMargin(50,50);
                toast.show();
                return false;
            }
        });
        anfocus1 = findViewById(R.id.onfocus);
        anfocus1.setOnFocusChangeListener((v, hasFocus) -> {
            if(hasFocus){
                Toast toast=Toast.makeText(getApplicationContext(),"Acabas de enfocar a este elemento",Toast. LENGTH_SHORT);
                toast. setMargin(50,50);
                toast. show();
            }
        });
        ankey1 = findViewById(R.id.onfocus);
        ankey1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int KeyCode, KeyEvent keyEvent) {
                if ((KeyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast toast= Toast. makeText(getApplicationContext(),"Activastes el Key Juan",Toast. LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }
                return false;
            }
        });
        antouch1 = findViewById(R.id.antouch);
        antouch1.setOnTouchListener((v, event) -> {
            if(event.getAction() != MotionEvent.ACTION_BUTTON_PRESS){
                Toast toast=Toast.makeText(getApplicationContext(),"Acabas soltar el boton",Toast. LENGTH_SHORT);
                toast. setMargin(50,50);
                toast. show();
            }else {
                Toast toast=Toast.makeText(getApplicationContext(),"Acabas soltar el boton",Toast. LENGTH_SHORT);
                toast. setMargin(50,50);
                toast.cancel();
            }
            return false;
        });
        ancreate1 = findViewById(R.id.ancreate);
        ancreate1.setOnCreateContextMenuListener((menu, v,menuInfo) -> {
            menu.setHeaderTitle("Menu contextual");
            menu.add("Victor");
            menu.add("Cua");
            menu.add("Juan");

        });
    }
}