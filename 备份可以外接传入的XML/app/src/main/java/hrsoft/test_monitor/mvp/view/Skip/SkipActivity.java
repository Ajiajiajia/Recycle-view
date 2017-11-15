package hrsoft.test_monitor.mvp.view.Skip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

public class SkipActivity extends AppCompatActivity {


    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rv=new RecyclerView(SkipActivity.this);

        setContentView(rv);

        rv.setLayoutManager(new LinearLayoutManager(SkipActivity.this));

        rv.setAdapter(new MyAdapter());
    }


}