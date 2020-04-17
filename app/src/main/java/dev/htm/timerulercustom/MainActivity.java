package dev.htm.timerulercustom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dev.htm.timerulercustom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int color = 0;
        List<TimeRuleView.TimePart> list = new ArrayList<>();
        for (int i = 0; i < 23; i++) {
            TimeRuleView.TimePart part = new TimeRuleView.TimePart();
            part.startTime = new DateTime().getSecondOfDay();
            part.endTime = part.startTime + part.startTime;
            part.colorSet = Color.BLUE;
            list.add(part);
        }
        binding.timeView.setTimePartList(list, color);
    }
}
