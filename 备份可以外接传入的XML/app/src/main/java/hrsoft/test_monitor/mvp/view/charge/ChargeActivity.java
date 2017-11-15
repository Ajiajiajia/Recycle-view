package hrsoft.test_monitor.mvp.view.charge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import hrsoft.test_monitor.R;
import hrsoft.test_monitor.base.activity.NoBarActivity;
import hrsoft.test_monitor.mvp.view.Skip.SkipActivity;

/**
 * Created by heaijia on 2017/10/13.
 */

public class ChargeActivity extends NoBarActivity {
//
//    @BindView(btn_Clickto_capacityFragemnt)
//    Button btn_chatge_clickto_capacityFragemnt;
//
//
//    private CapacityFragment capacityfragment = new CapacityFragment();
//
////    private void initCapacityFragment() {
////        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
////
////        transaction.replace(R.id.fragment_container, capacityfragment);
////
////        transaction.commit();
////    }
//
//    @OnClick(btn_Clickto_capacityFragemnt)
//    void click_anothrerView() {
//        initCapacityFragment();
//    }
//
//    private void initCapacityFragment() {
//        setContentView(R.layout.activity_capacity);
//        findViewById(R.id.btn_Clickto_capacityFragemnt).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                public void onClick(View v)
//                startActivity(new Intent(ChargeActivity.this, CapacityFragment.class));
//            }
//        });
//
//    }

//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.my_layout);
//        findViewById(R.id.btn_start_anotherActivity).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(ChargeActivity.this, SkipActivity.class));
//            }
//        });
//    }
//
//
//
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_layout_charge;
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void loadData() {

    }
}

