package com.example.dinga.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //update the score text view for Team A
    public void displayTeamAScore(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //add six points to the score for Team A
    public void addSixPointsToTeamAScore(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayTeamAScore(scoreTeamA);
    }

    //add three points to the score for Team A
    public void addThreePointsToTeamAScore(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamAScore(scoreTeamA);
    }

    //add two points to the score for Team A
    public void addTwoPointsToTeamAScore(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamAScore(scoreTeamA);
    }

    //add one point to the score for Team A
    public void addOnePointToTeamAScore(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamAScore(scoreTeamA);
    }

    //update the score text view for Team B
    public void displayTeamBScore(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //add six points to the score for Team B
    public void addSixPointsToTeamBScore(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayTeamBScore(scoreTeamB);
    }

    //add three points to the score of Team B
    public void addThreePointsToTeamBScore(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamBScore(scoreTeamB);
    }

    //add two points to the score for Team B
    public void addTwoPointsToTeamBScore(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamBScore(scoreTeamB);
    }

    //add one point to the score for Team B
    public void addOnePointToTeamBScore(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamBScore(scoreTeamB);
    }

    //reset the score of both the score for Team A and Team B back to zero
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }
}
