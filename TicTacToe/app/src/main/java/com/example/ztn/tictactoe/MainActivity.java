package com.example.ztn.tictactoe;

//vincent li TTP
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1,button2, button3,button4,button5,button6,button7,button8,button9;
    int turn, count;
    int[] board = new int[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        turn = 1;
        count = 0;

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        //capture button from layout
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button1.setText("X");
                        board[0] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button1.setText("O");
                        board[0] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button2.setText("X");
                        board[1] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button2.setText("O");
                        board[1] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button3.setText("X");
                        board[2] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button3.setText("O");
                        board[2] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button4.setText("X");
                        board[3] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button4.setText("O");
                        board[3] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button5.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button5.setText("X");
                        board[4] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button5.setText("O");
                        board[4] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button6.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button6.setText("X");
                        board[5] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button6.setText("O");
                        board[5] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button7.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button7.setText("X");
                        board[6] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button7.setText("O");
                        board[6] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button8.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button8.setText("X");
                        board[7] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button8.setText("O");
                        board[7] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button9.getText()== ""){ //if spot is empty
                    if(turn == 1){ //X always goes first
                        button9.setText("X");
                        board[8] = -1;
                        turn = 2;
                    } else if (turn == 2){
                        button9.setText("O");
                        board[8] = 1;
                        turn = 1;
                    }
                    count++;
                }
                checkState();
            }
        });
    }

    public void checkState(){
        if( (board[0] + board[1] + board[2]) == (-3)  ||
            (board[3] + board[4] + board[5]) == (-3)  ||
            (board[6] + board[7] + board[8]) == (-3)  ||
            (board[0] + board[3] + board[6]) == (-3)  ||
            (board[1] + board[4] + board[7]) == (-3)  ||
            (board[2] + board[5] + board[8]) == (-3)  ||
            (board[0] + board[4] + board[8]) == (-3)  ||
            (board[2] + board[4] + board[6]) == (-3) ){
            Toast.makeText(getApplicationContext(), "Player X Wins", Toast.LENGTH_LONG).show();
        } else if (
            (board[0] + board[1] + board[2]) == (3)  ||
            (board[3] + board[4] + board[5]) == (3)  ||
            (board[6] + board[7] + board[8]) == (3)  ||
            (board[0] + board[3] + board[6]) == (3)  ||
            (board[1] + board[4] + board[7]) == (3)  ||
            (board[2] + board[5] + board[8]) == (3)  ||
            (board[0] + board[4] + board[8]) == (3)  ||
            (board[2] + board[4] + board[6]) == (3) ){
            Toast.makeText(getApplicationContext(), "Player O Wins", Toast.LENGTH_LONG).show();
        } else if (count==9){
            Toast.makeText(getApplicationContext(), "Draw!", Toast.LENGTH_LONG).show();
        }
    }
}
