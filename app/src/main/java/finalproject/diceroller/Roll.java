package finalproject.diceroller;


import android.support.v7.app.AppCompatActivity;


import java.util.Random;

public class Roll extends AppCompatActivity {



     static int dSix()
    {
        Random r = new Random();
        int theRoll;
        theRoll = r.nextInt(6) + 1;
        return theRoll;
    }

    static int dFour()
    {
        Random r = new Random();
        int theRoll;
        theRoll = r.nextInt(4) + 1;
        return theRoll;
    }

    static int dTwenty()
    {
        Random r = new Random();
        int theRoll;
        theRoll = r.nextInt(20) + 1;
        return theRoll;
    }

}
