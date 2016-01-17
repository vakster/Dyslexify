package myapps.test.dyslexify;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;


public class LastD extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_d);

        Intent i = getIntent();
        ArrayList<String> perAlphabet = i.getStringArrayListExtra("b");

        TextView button2 = (TextView) findViewById(R.id.Button2);
        button2.setText("Your personalized text: " + perAlphabet.get(11) + perAlphabet.get(4) + perAlphabet.get(19) + " " + perAlphabet.get(24)
                + perAlphabet.get(14) + perAlphabet.get(20) + perAlphabet.get(17) + " "
        + perAlphabet.get(19) + perAlphabet.get(0) + perAlphabet.get(11) + perAlphabet.get(4) + perAlphabet.get(13)
                + perAlphabet.get(19) +  " " + perAlphabet.get(11) + perAlphabet.get(4) + perAlphabet.get(0) +
                        perAlphabet.get(3) + " " + perAlphabet.get(19) + perAlphabet.get(7) + perAlphabet.get(4) +
         " " + perAlphabet.get(22) + perAlphabet.get(0) + perAlphabet.get(24) +".");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_last_d, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
