package com.example.ultimatefrisbee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreTeamAFoul = 0;
    int scoreTeamBFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * methods for team A
     */
    public void teamAOne(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void teamAFoul(View view){
        scoreTeamAFoul = scoreTeamAFoul + 1;
        displayForTeamAFoul(scoreTeamAFoul);
    }

    /**
     * display for team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul_count);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * methods for team B
     */
    public void teamBOne(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void teamBFoul(View view){
        scoreTeamBFoul = scoreTeamBFoul + 1;
        displayForTeamBFoul(scoreTeamBFoul);
    }

    /**
     * display for team B
     */
    public void displayForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_score_view);
            scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul_count);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * reset button
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreTeamAFoul = 0;
        scoreTeamBFoul = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamAFoul(scoreTeamAFoul);
        displayForTeamBFoul(scoreTeamBFoul);
    }
}