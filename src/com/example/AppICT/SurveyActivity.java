package com.example.AppICT;

import android.app.Activity;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * survey
 *
 * Representeert een studiewijzer in de applicatie. Een studiewijzer bestaat
 * uit een verzameling vragen met daaraan gekoppeld een aantal antwoorden.
 * Elk antwoord heeft een bepaalde score waarmee een studieadvies kan worden
 * gegeven.
 *
 * @author Kaj Nelissen
 * @version 0.1
 */
public class SurveyActivity extends Activity {

    private String[] givenAnswers;



    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);

        HorizontalScrollView questionScroll = (HorizontalScrollView) findViewById(R.id.scrollView);

        //ListView questionList = (ListView) findViewById(R.id.questionList);
        //ListView answerList = (ListView) findViewById(R.id.answerList);
        String[] questions = new String[] { "Vraag 1", "Vraag 2", "Vraag 3" };

        for (String q : questions) {
            ScrollView sv = (ScrollView) findViewById(R.id.questionView);
            TextView tv = (TextView) findViewById(R.id.questionText);
            ListView lv = (ListView) findViewById(R.id.answerList);
            sv.addView(tv);
            sv.addView(lv);
            questionScroll.addView(sv);
        }

        String[] answers = new String[] { "A", "B", "C", "D" };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        //ArrayAdapter<String> questionAdapter = new ArrayAdapter<String>(this,
        //    android.R.layout.simple_list_item_1, android.R.id.text1, questions);

        //ArrayAdapter<String> answerAdapter = new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_single_choice, android.R.id.text1, answers);


        // Assign adapter to ListView
        //questionList.setAdapter(questionAdapter);
        //answerList.setAdapter(answerAdapter);
    }

}
