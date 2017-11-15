package hrsoft.test_monitor.mvp.view.Skip;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;
import hrsoft.test_monitor.R;
import hrsoft.test_monitor.base.activity.NoBarActivity;
import hrsoft.test_monitor.util.ToastUtil;


import static android.R.attr.id;
import static android.R.attr.onClick;
import static android.support.v7.recyclerview.R.styleable.RecyclerView;
import static hrsoft.test_monitor.R.id.add;
import static hrsoft.test_monitor.R.id.btn_add;
import static hrsoft.test_monitor.R.id.btn_delete;

public class SkipActivity extends NoBarActivity {
    public Button btn_ADD,btn_DELETE;
    private List<CellDate> data = new ArrayList<>();
    private MyAdapter adapter = new MyAdapter();


//    private RecyclerView rv;

    public void setBtn_DELETE(Button btn_DELETE) {
        this.btn_DELETE = btn_DELETE;
    }

    public Button getBtn_DELETE() {
        return btn_DELETE;
    }

    public void setBtn_ADD(Button btn_ADD) {
        this.btn_ADD = btn_ADD;
    }

    public Button getBtn_ADD() {
        return btn_ADD;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_skip;
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {
        RecyclerView rv =(RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutmanager=new LinearLayoutManager(this);
        rv.setLayoutManager(layoutmanager);
        rv.setAdapter(adapter);
    }

    @Override
    protected void loadData() {

    }


//    @OnClick(btn_A)
//    void toadd(){
//        MyAdapter.add;
//    }
//    @OnClick(btn_D)
//    void toadd(){
//        MyAdapter.delete;
//    }


    @OnClick(R.id.btn_A)
    void toadd(){
        ToastUtil.showToast("!23123");
        adapter.addA();
    }
    @OnClick(R.id.btn_D)
    void todelete(){
        ToastUtil.showToast("!23123x");
        adapter.deleteD(2);
    }


}