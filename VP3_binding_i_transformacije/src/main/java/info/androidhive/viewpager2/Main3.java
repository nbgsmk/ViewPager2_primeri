package info.androidhive.viewpager2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import info.androidhive.viewpager2.databinding.Main3Binding;
import info.androidhive.viewpager2.fragments.FragmentViewPagerActivity;
import info.androidhive.viewpager2.views.ViewsSliderActivity;

public class Main3 extends AppCompatActivity {
    private Main3Binding binding;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Main3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnViewsDemo.setOnClickListener(view -> {
            startActivity(new Intent(Main3.this, ViewsSliderActivity.class));
        });

        binding.btnFragmentDemo.setOnClickListener(view -> {
            startActivity(new Intent(Main3.this, FragmentViewPagerActivity.class));
        });
    }
}