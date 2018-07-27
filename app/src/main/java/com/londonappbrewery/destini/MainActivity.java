package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int FIRST_STORY = 1;
    final int SECOND_STORY = 2;
    final int THIRD_STORY = 3;
    final int FOURTH_STORY_END = 4;
    final int FIFTH_STORY_END = 5;
    final int SIXTH_STORY_END = 6;

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonBottom = findViewById(R.id.buttonBottom);
        mButtonTop = findViewById(R.id.buttonTop);

        if (savedInstanceState != null) {
            switch (savedInstanceState.getInt("StoryKey")) {
                case FIRST_STORY:
                    mStory = FIRST_STORY;
                    mStoryTextView.setText(R.string.T1_Story);
                    mButtonTop.setText(R.string.T1_Ans1);
                    mButtonBottom.setText(R.string.T1_Ans2);
                    break;
                case SECOND_STORY:
                    mStory = SECOND_STORY;
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    break;
                case THIRD_STORY:
                    mStory = THIRD_STORY;
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    break;
                case FOURTH_STORY_END:
                    mStory = FOURTH_STORY_END;
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setText(R.string.T456_Ans1);
                    mButtonBottom.setText(R.string.T456_Ans2);
                    break;
                case FIFTH_STORY_END:
                    mStory = FIFTH_STORY_END;
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setText(R.string.T456_Ans1);
                    mButtonBottom.setText(R.string.T456_Ans2);
                    break;
                case SIXTH_STORY_END:
                    mStory = SIXTH_STORY_END;
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setText(R.string.T456_Ans1);
                    mButtonBottom.setText(R.string.T456_Ans2);
                    break;
            }
        } else {
            mStory = FIRST_STORY;
        }

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStory) {
                    case FIRST_STORY:
                        mStory = THIRD_STORY;
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        break;
                    case SECOND_STORY:
                        mStory = THIRD_STORY;
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        break;
                    case THIRD_STORY:
                        mStory = SIXTH_STORY_END;
                        mStoryTextView.setText(R.string.T6_End);
                        mButtonTop.setText(R.string.T456_Ans1);
                        mButtonBottom.setText(R.string.T456_Ans2);
                        break;
                    case FOURTH_STORY_END:
                        mStory = FIRST_STORY;
                        mStoryTextView.setText(R.string.T1_Story);
                        mButtonTop.setText(R.string.T1_Ans1);
                        mButtonBottom.setText(R.string.T1_Ans2);
                        break;
                    case FIFTH_STORY_END:
                        mStory = FIRST_STORY;
                        mStoryTextView.setText(R.string.T1_Story);
                        mButtonTop.setText(R.string.T1_Ans1);
                        mButtonBottom.setText(R.string.T1_Ans2);
                        break;
                    case SIXTH_STORY_END:
                        mStory = FIRST_STORY;
                        mStoryTextView.setText(R.string.T1_Story);
                        mButtonTop.setText(R.string.T1_Ans1);
                        mButtonBottom.setText(R.string.T1_Ans2);
                        break;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStory) {
                    case FIRST_STORY:
                        mStory = SECOND_STORY;
                        mStoryTextView.setText(R.string.T2_Story);
                        mButtonTop.setText(R.string.T2_Ans1);
                        mButtonBottom.setText(R.string.T2_Ans2);
                        break;
                    case SECOND_STORY:
                        mStory = FOURTH_STORY_END;
                        mStoryTextView.setText(R.string.T4_End);
                        mButtonTop.setText(R.string.T456_Ans1);
                        mButtonBottom.setText(R.string.T456_Ans2);
                        break;
                    case THIRD_STORY:
                        mStory = FIFTH_STORY_END;
                        mStoryTextView.setText(R.string.T5_End);
                        mButtonTop.setText(R.string.T456_Ans1);
                        mButtonBottom.setText(R.string.T456_Ans2);
                        break;
                    case FOURTH_STORY_END:
                        finish();
                        break;
                    case FIFTH_STORY_END:
                        finish();
                        break;
                    case SIXTH_STORY_END:
                        finish();
                        break;
                }
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("StoryKey", mStory);
    }
}
