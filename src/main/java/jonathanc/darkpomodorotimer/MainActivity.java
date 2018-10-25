package jonathanc.darkpomodorotimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //timer
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        //display time
        long elapsedTime = System.currentTimeMillis() - startTime;
        long elapsedSeconds = elapsedTime / 1000;
        long secondsDisplay = elapsedSeconds % 60;
        long elapsedMinutes = elapsedSeconds / 60;
        //put here code to format and display the values
        System.out.print(elapsedMinutes + elapsedSeconds + elapsedTime + secondsDisplay);
    }
}