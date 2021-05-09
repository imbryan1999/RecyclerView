package android.example.recyclertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcView = findViewById(R.id.rc_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rcView.setLayoutManager(layoutManager);

        String data[] = {"C","C++","Java","Kotlin","JavaScript","Python","JQuery","HTML","CSS","Dart","JSP","Kotlin","JavaScript","Python","JQuery"};
        rcView.setAdapter(new MyAdapter(data));
    }
}