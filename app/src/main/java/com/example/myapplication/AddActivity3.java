package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AddActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add3);
        Button generateButton = findViewById(R.id.generateButton); // Замените на ID вашей кнопки
        LinearLayout parentLayout = findViewById(R.id.parentLayout); // Замените на ID вашего родительского контейнера

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем новый LinearLayout
                LinearLayout linearLayout = new LinearLayout(AddActivity3.this); // Замените "MainActivity" на вашу активность
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        200);
                layoutParams.setMargins(19, 60, 20, 0);
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setBackgroundResource(R.drawable.border);

                // Создаем первый EditText
                EditText editText1 = new EditText(AddActivity3.this); // Замените "MainActivity" на вашу активность
                LinearLayout.LayoutParams editTextParams1 = new LinearLayout.LayoutParams(
                        370,

                        ViewGroup.LayoutParams.WRAP_CONTENT);

                int leftMarginInDp = (int) getResources().getDimension(R.dimen.margin_20dp); // Создайте ресурс dimen с 20dp
                editTextParams1.setMargins(50, 0, 0, 0);
                editText1.setLayoutParams(editTextParams1);
                editText1.setGravity(Gravity.CENTER);
                editText1.setText("Значення");

                // Создаем TextView
                TextView arrowTextView = new TextView(AddActivity3.this); // Замените "MainActivity" на вашу активность
                arrowTextView.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                arrowTextView.setText("->");

                // Создаем второй EditText
                EditText editText2 = new EditText(AddActivity3.this); // Замените "MainActivity" на вашу активность
                LinearLayout.LayoutParams editTextParams2 = new LinearLayout.LayoutParams(
                        350,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                editTextParams2.setMargins(0, 0, 40, 0);
                editText2.setLayoutParams(editTextParams2);
                editText2.setGravity(Gravity.CENTER);
                editText2.setText("Визначення");
                ////////////////////////////////////
                TextView xTextView = new TextView(AddActivity3.this); // Замените "MainActivity" на вашу активность
                xTextView.setLayoutParams(new ViewGroup.LayoutParams(
                        80,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                xTextView.setText("X");
                xTextView.setTextSize(20);
                xTextView.setGravity(Gravity.CENTER);
                xTextView.setBackgroundResource(R.drawable.border);
                xTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Видаляємо LinearLayout при кліку на xTextView
                        ViewGroup parent = (ViewGroup) linearLayout.getParent();
                        if (parent != null) {
                            parent.removeView(linearLayout);
                        }
                    }
                });
                // Добавляем элементы в LinearLayout
                linearLayout.addView(editText1);
                linearLayout.addView(arrowTextView);
                linearLayout.addView(editText2);
                linearLayout.addView(xTextView);

                // Добавляем LinearLayout в родительский контейнер
                parentLayout.addView(linearLayout);
            }
        });








        //////////////////Удалить шаблон
//        LinearLayout linearLayout = findViewById(R.id.lol3);
//        TextView deleteTextView = findViewById(R.id.deleteTextView);
//        deleteTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Удаление всего LinearLayout
//                linearLayout.removeAllViews();
//            }
//        });


    }
}