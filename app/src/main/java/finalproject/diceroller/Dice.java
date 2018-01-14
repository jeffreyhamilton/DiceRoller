package finalproject.diceroller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Dice extends AppCompatActivity
{

    Button b_roll;
    RadioButton rButton_D4, rButton_D6, rButton_D20;
    TextView tv_rollNumber;
    ImageView iv_dice;
    int newNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        b_roll = (Button) findViewById(R.id.b_roll);
        tv_rollNumber = (TextView) findViewById(R.id.tv_rollNumber);
        iv_dice = (ImageView) findViewById(R.id.iv_dice);
        rButton_D4 = (RadioButton) findViewById(R.id.rButton_D4);
        rButton_D6 = (RadioButton) findViewById(R.id.rButton_D6);
        rButton_D20 = (RadioButton) findViewById(R.id.rButton_D20);

        tv_rollNumber.setText("You have not rolled");


        //checking what type of dice is selected then rolling that dice
        b_roll.setOnClickListener(new View.OnClickListener()
        {


            @Override
                public void onClick(View view)
            {

                //check which die is sellected then creates random roll and applies to screen text
                if (rButton_D6.isChecked())
                {
                    newNum = Roll.dSix();
                    tv_rollNumber.setText("You rolled a " + newNum);
                }
                else if(rButton_D4.isChecked())
                {
                    newNum = Roll.dFour();
                    tv_rollNumber.setText("You rolled a " + newNum);
                }
                else
                {
                    newNum = Roll.dTwenty();
                    tv_rollNumber.setText("You rolled a " + newNum);
                }

            //uses random roll from above and decides wich image to use
                switch (newNum) {
                    case 1: {
                        if (rButton_D4.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d4_1);
                        } else if (rButton_D6.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d1);
                        } else {
                            iv_dice.setImageResource(R.drawable.d20_1);
                        }
                        break;
                    }

                    case 2: {
                        if (rButton_D4.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d4_2);
                        } else if (rButton_D6.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d2);
                        } else {
                            iv_dice.setImageResource(R.drawable.d20_2);
                        }
                        break;
                    }

                    case 3: {
                        if (rButton_D4.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d4_3);
                        } else if (rButton_D6.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d3);
                        } else {
                            iv_dice.setImageResource(R.drawable.d20_3);
                        }
                        break;
                    }

                    case 4: {
                        if (rButton_D4.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d4_4);
                        } else if (rButton_D6.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d4);
                        } else {
                            iv_dice.setImageResource(R.drawable.d20_4);
                        }
                        break;
                    }

                    case 5: {
                        if (rButton_D6.isChecked()) {
                        iv_dice.setImageResource(R.drawable.d5);
                        } else {
                            iv_dice.setImageResource(R.drawable.d20_5);
                        }
                        break;
                    }

                    case 6: {
                        if (rButton_D6.isChecked()) {
                            iv_dice.setImageResource(R.drawable.d6);
                        } else {
                            iv_dice.setImageResource(R.drawable.d20_6);
                        }
                        break;
                    }

                    case 7:
                    {
                        iv_dice.setImageResource(R.drawable.d20_7);
                        break;
                    }

                    case 8:
                    {
                        iv_dice.setImageResource(R.drawable.d20_8);
                        break;
                    }
                    case 9:
                    {
                        iv_dice.setImageResource(R.drawable.d20_9);
                        break;
                    }

                    case 10:
                    {
                        iv_dice.setImageResource(R.drawable.d20_10);
                        break;
                    }

                    case 11:
                    {
                        iv_dice.setImageResource(R.drawable.d20_11);
                        break;
                    }

                    case 12:
                    {
                        iv_dice.setImageResource(R.drawable.d20_12);
                        break;
                    }

                    case 13:
                    {
                        iv_dice.setImageResource(R.drawable.d20_13);
                        break;
                    }

                    case 14:
                    {
                        iv_dice.setImageResource(R.drawable.d20_14);
                        break;
                    }

                    case 15:
                    {
                        iv_dice.setImageResource(R.drawable.d20_15);
                        break;
                    }

                    case 16:
                    {
                        iv_dice.setImageResource(R.drawable.d20_16);
                        break;
                    }

                    case 17:
                    {
                        iv_dice.setImageResource(R.drawable.d20_17);
                        break;
                    }

                    case 18:
                    {
                        iv_dice.setImageResource(R.drawable.d20_18);
                        break;
                    }

                    case 19:
                    {
                        iv_dice.setImageResource(R.drawable.d20_19);
                        break;
                    }

                    case 20:
                    {
                        iv_dice.setImageResource(R.drawable.d20_20);
                        break;
                    }
                }
            }

        });


//radio button on click showing new dice image and un-clicking other radio buttons
        rButton_D4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                    iv_dice.setImageResource(R.drawable.d4_1);
                    tv_rollNumber.setText("You have not rolled");

                if (rButton_D6.isChecked())
                {
                    rButton_D6.setChecked(false);
                }else{
                    rButton_D20.setChecked(false);
                }
            }
        });

        rButton_D6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                iv_dice.setImageResource(R.drawable.d1);
                tv_rollNumber.setText("You have not rolled");

                if (rButton_D4.isChecked())
                {
                    rButton_D4.setChecked(false);
                }else{
                    rButton_D20.setChecked(false);
                }
            }
        });

        rButton_D20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                iv_dice.setImageResource(R.drawable.d20_1);
                tv_rollNumber.setText("You have not rolled");

                if (rButton_D4.isChecked())
                {
                    rButton_D4.setChecked(false);
                }else{
                    rButton_D6.setChecked(false);
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_dice, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_about:
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
