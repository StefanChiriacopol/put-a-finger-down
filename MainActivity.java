package com.example.putafingerdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView categoryGrid;
    ArrayList<CategoryItem> categoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        categoryGrid = findViewById(R.id.CategoryGridView);

        //categories list
        categoryList.add(new CategoryItem(getString(R.string.CategoryTitleSchool1),getString(R.string.CategoryDetailsSchool1),5));
        categoryList.add(new CategoryItem(getString(R.string.CategoryTitleSchool1),getString(R.string.CategoryDetailsSchool2),4));

        //set GridView adapter
        categoryGrid.setAdapter(new GridViewAdapter(this,R.layout.category_grid_view_item,categoryList));
    }
}
