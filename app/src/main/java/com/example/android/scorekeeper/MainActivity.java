package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the Cricket score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int runsTeamA = 0;
    int wicketsTeamA = 0;

    // Tracks the score for Team A
    int runsTeamB = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        runsTeamA = 0;
        wicketsTeamA = 0;

        runsTeamB = 0;
        wicketsTeamB = 0;

        displayRunsForTeamA(runsTeamA);
        displayWicketsForTeamA(wicketsTeamA);
        displayRunsForTeamB(runsTeamB);
        displayWicketsForTeamB(wicketsTeamB);
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayRunsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_run);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given runs for Team B.
     */
    public void displayRunsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_run);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wickets for Team A.
     */
    public void displayWicketsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wickets for Team B.
     */
    public void displayWicketsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 6 runs.
     */
    public void addSixForTeamA(View view) {
        runsTeamA += 6;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increase the score for Team A by 4 runs.
     */
    public void addFourForTeamA(View view) {
        runsTeamA += 4;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increase the score for Team A by 3 runs.
     */
    public void addThreeForTeamA(View view) {
        runsTeamA += 3;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increase the score for Team A by 2 runs.
     */
    public void addTwoForTeamA(View view) {
        runsTeamA += 2;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increase the score for Team A by 1 runs.
     */
    public void addOneForTeamA(View view) {
        runsTeamA += 1;
        displayRunsForTeamA(runsTeamA);
    }

    public void addWicketForTeamA(View view) {
        wicketsTeamA += 1;
        displayWicketsForTeamA(wicketsTeamA);
    }

    /**
     * Increase the score for Team B by 6 runs.
     */
    public void addSixForTeamB(View view) {
        runsTeamB += 6;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increase the score for Team B by 4 runs.
     */
    public void addFourForTeamB(View view) {
        runsTeamB += 4;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increase the score for Team B by 3 runs.
     */
    public void addThreeForTeamB(View view) {
        runsTeamB += 3;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increase the score for Team B by 2 runs.
     */
    public void addTwoForTeamB(View view) {
        runsTeamB += 2;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increase the score for Team B by 1 runs.
     */
    public void addOneForTeamB(View view) {
        runsTeamB += 1;
        displayRunsForTeamB(runsTeamB);
    }

    public void addWicketForTeamB(View view) {
        wicketsTeamB += 1;
        displayWicketsForTeamB(wicketsTeamB);
    }
}
