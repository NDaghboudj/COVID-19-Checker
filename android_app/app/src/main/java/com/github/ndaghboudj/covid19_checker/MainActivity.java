package com.github.ndaghboudj.covid19_checker;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    TextView outcome;
    RecyclerView rvFeatures;
    double[] input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] text = {getString(R.string.outcome_healthy), getString(R.string.outcome_infected)};
        int[] color = {getResources().getColor(R.color.green), getResources().getColor(R.color.red)};

        outcome = findViewById(R.id.tv_outcome);

        String[] featureName = getResources().getStringArray(R.array.features);
        input = new double[featureName.length];
        AdapterFeature adapterFeature = new AdapterFeature();
        adapterFeature.setFeatures(new ArrayList<>(Arrays.asList(featureName)));
        adapterFeature.setOnItemClickedListener(new AdapterFeature.OnItemClickedListener() {
            @Override
            public void onItemClicked(int position, boolean checked) {
                input[position] = checked ? 1.0 : 0.0;
                int output = DecisionTreeClassifier.predict(input);

                outcome.setText(text[output]);
                outcome.setBackgroundColor(color[output]);
                outcome.setVisibility(View.VISIBLE);
            }
        });

        rvFeatures = findViewById(R.id.rv_features);
        rvFeatures.setLayoutManager(new LinearLayoutManager(this));
        rvFeatures.setAdapter(adapterFeature);
    }
}