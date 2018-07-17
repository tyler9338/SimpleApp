package com.example.tyler.simpleApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Game QuizGame = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button
        Button btn = findViewById(R.id.leftbtn);
        Button btn2 = findViewById(R.id.rightbtn);

        final TextView Quiz_txt = (TextView) findViewById(R.id.Qtxt);
        Quiz_txt.setText(QuizGame.getChosenSideName());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Left button", "Code: Port (left) is red");
                Toast.makeText(getApplicationContext(), "Code: Port (left) is red", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Right button", getString(R.string.Right_note));
                Toast.makeText(getApplicationContext(), getString(R.string.Right_note), Toast.LENGTH_SHORT)
                        .show();
            }
        });

        //Bottom Button
        Button btn3= (Button)findViewById(R.id.btnleft);
        Button btn4= (Button)findViewById(R.id.btnright);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(QuizGame.checkIfCorrect(Game.Side.PORT))
                {
                    Log.i("Answer tag","Correct!");
                    Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT)
                            .show();
                }
                else
                {
                    Log.i("Answer tag","Incorrect!");
                    Toast.makeText(getApplicationContext(),"Incorrect. :(",Toast.LENGTH_SHORT)
                            .show();
                }
                QuizGame = new Game();
                TextView Quiz_txt = (TextView)findViewById(R.id.Qtxt);
                Quiz_txt.setText(QuizGame.getChosenSideName());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(QuizGame.checkIfCorrect(Game.Side.STARBOARD))
                {
                    Log.i("Answer tag","Correct!");
                    Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT)
                            .show();
                }
                else
                {
                    Log.i("Answer tag","Incorrect!");
                    Toast.makeText(getApplicationContext(),"Incorrect. :(",Toast.LENGTH_SHORT)
                            .show();
                }
                QuizGame = new Game();
                TextView Quiz_txt = (TextView)findViewById(R.id.Qtxt);
                Quiz_txt.setText(QuizGame.getChosenSideName());
            }
        });
    }
}
