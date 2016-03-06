package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_a=0;
    int score_b=0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score_a) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score_a));
    }

    public void displayForTeamB(int score_b) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score_b));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void a_3(View view){
        score_a=score_a+3;
        displayForTeamA(score_a);

    }
    public void a_2(View view){
        score_a=score_a+2;
        displayForTeamA(score_a);

    }
    public void a_free(View view){
        score_a=score_a+1;
        displayForTeamA(score_a);

    }
    public void b_3(View view){
        score_b=score_b+3;
        displayForTeamB(score_b);

    }
    public void b_2(View view){
        score_b=score_b+2;
        displayForTeamB(score_b);

    }
    public void b_free(View view){
        score_b=score_b+1;
        displayForTeamB(score_b);

    }
    public void reset(View view){
        score_a=0;
        score_b=0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
