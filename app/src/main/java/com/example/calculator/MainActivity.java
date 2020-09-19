package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    private TextView out;
    private Button buttons[] = new Button[18];
    float value1, value2;
    boolean add, sub, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = findViewById(R.id.out);
        this.buttons[0] = findViewById(R.id.zero);
        this.buttons[1] = findViewById(R.id.one);
        this.buttons[2] = findViewById(R.id.two);
        this.buttons[3] = findViewById(R.id.three);
        this.buttons[4] = findViewById(R.id.four);
        this.buttons[5] = findViewById(R.id.five);
        this.buttons[6] = findViewById(R.id.six);
        this.buttons[7] = findViewById(R.id.seven);
        this.buttons[8] = findViewById(R.id.eight);
        this.buttons[9] = findViewById(R.id.nine);
        this.buttons[11] = findViewById(R.id.add);
        this.buttons[12] = findViewById(R.id.sub);
        this.buttons[13] = findViewById(R.id.mul);
        this.buttons[14] = findViewById(R.id.div);
        this.buttons[15] = findViewById(R.id.dot);
        this.buttons[16] = findViewById(R.id.equal);
        this.buttons[17] = findViewById(R.id.c);
        for (int i = 0; i < buttons.length; i++) {
            if (this.buttons[i] != null) {
                this.buttons[i].setOnClickListener(this);
            }
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zero:
                out.setText(out.getText() + "0");
                break;
            case R.id.one:
                out.setText(out.getText() + "1");
                break;
            case R.id.two:
                out.setText(out.getText() + "2");
                break;
            case R.id.three:
                out.setText(out.getText() + "3");
                break;
            case R.id.four:
                out.setText(out.getText() + "4");
                break;
            case R.id.five:
                out.setText(out.getText() + "5");
                break;
            case R.id.six:
                out.setText(out.getText() + "6");
                break;
            case R.id.seven:
                out.setText(out.getText() + "7");
                break;
            case R.id.eight:
                out.setText(out.getText() + "8");
                break;
            case R.id.nine:
                out.setText(out.getText() + "9");
                break;
            case R.id.add:
                if (out == null) {
                    out.setText("");
                } else {
                    value1 = Float.parseFloat(out.getText() + "");
                    add = true;
                    out.setText(null);

                }
                //out.setText(out.getText()+"+" );
                break;
            case R.id.sub:
                value1 = Float.parseFloat(out.getText() + "");
                sub = true;
                out.setText(null);
                //out.setText(out.getText()+"-" );
                break;
            case R.id.mul:
                value1 = Float.parseFloat(out.getText() + "");
                mul = true;
                out.setText(null);
                //out.setText(out.getText()+"*" );
                break;
            case R.id.div:
                value1 = Float.parseFloat(out.getText() + "");
                div = true;
                out.setText(null);
                //out.setText(out.getText()+"/" );
                break;
            case R.id.c:

                out.setText("");
                break;
            case R.id.equal:
                value2 = Float.parseFloat(out.getText().toString());
                if (add) {
                    out.setText(value1 + value2 + "");
                    add = false;
                }

                if (sub) {
                    out.setText(value1 - value2 + "");
                    sub = false;
                }

                if (mul) {
                    out.setText(value1 * value2 + "");
                    mul = false;
                }

                if (div) {
                    out.setText(value1 / value2 + "");
                    div = false;

                }

                //CharSequence expr= out.getText();

                //out.setText(out.getText()+"\n=result");
                break;
            case R.id.dot:
                out.setText(out.getText() + ".");


        }
    }
}
