package hrsoft.test_monitor.mvp.view.main.activity;


import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Context;                         //导入类文件
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import hrsoft.test_monitor.R;
import hrsoft.test_monitor.base.activity.BaseActivity;
import hrsoft.test_monitor.base.activity.NoBarActivity;
import hrsoft.test_monitor.mvp.view.Skip.SkipActivity;
import hrsoft.test_monitor.mvp.view.capacity.CapacityFragment;
import hrsoft.test_monitor.mvp.view.charge.ChargeFragment;
import hrsoft.test_monitor.mvp.view.mine.MineFragment;

import static android.R.attr.clearTaskOnLaunch;
import static android.R.attr.id;
import static android.R.attr.onClick;
import static hrsoft.test_monitor.R.drawable.btn_capacity_false;
import static hrsoft.test_monitor.R.drawable.btn_charge_false;
import static hrsoft.test_monitor.R.drawable.btn_mine_false;
import static hrsoft.test_monitor.R.id.img_capacity;
import static hrsoft.test_monitor.R.id.img_charge;
import static hrsoft.test_monitor.R.id.img_mine;
import static hrsoft.test_monitor.R.id.rlayout_capacity;
import static hrsoft.test_monitor.R.id.rlayout_charge;
import static hrsoft.test_monitor.R.id.rlayout_mine;


public class MainActivity extends NoBarActivity {

//    @BindView(R.id.btn_Clickto_capacityFragemnt)
//    Button btn_chatge_clickto_capacityFragemnt;
//
//    @OnClick(btn_Clickto_capacityFragemnt)
//    void clicktoCapacityView() {
//        initCapacityFragment();
//        clear_board();
//        choice_capacity.setBackgroundResource(R.drawable.btn_capacity_true);
//        tab_capacity.setTextColor(getResources().getColor(R.color.accent));
//    }



    @BindView(R.id.img_charge)
    ImageView choice_charge;


    @BindView(R.id.img_capacity)
    ImageView choice_capacity;


    @BindView(R.id.img_mine)
    ImageView choice_mine;


    @BindView(R.id.tab_charge)
    Button tab_charge;


    @BindView(R.id.tab_capacity)
    Button tab_capacity;

    @BindView(R.id.tab_mine)
    Button tab_mine;


    private ChargeFragment chargefragment = new ChargeFragment();
    private CapacityFragment capacityfragment = new CapacityFragment();
    private MineFragment minefragment = new MineFragment();

    private void initMineFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, minefragment);
        transaction.commit();

    }


    private void initChargeFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, chargefragment);
        transaction.commit();

    }


    private void initCapacityFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_container, capacityfragment);

        transaction.commit();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariable() {

    }
    @Override
    protected void loadData() {
    }

    @Override
    protected void initView() {
        initChargeFragment();
        choice_charge.setBackgroundResource(R.drawable.btn_charge_true);
        tab_charge.setTextColor(getResources().getColor(R.color.accent));

    }

    @OnClick(rlayout_capacity)
    void toCapacityView() {
        initCapacityFragment();
        clear_board();
        choice_capacity.setBackgroundResource(R.drawable.btn_capacity_true);
        tab_capacity.setTextColor(getResources().getColor(R.color.accent));
    }

    @OnClick(rlayout_charge)
    void toChargeView() {
        initChargeFragment();
        clear_board();
        choice_charge.setBackgroundResource(R.drawable.btn_charge_true);
        tab_charge.setTextColor(getResources().getColor(R.color.accent));
    }

    @OnClick(rlayout_mine)
    void toMineView() {
        initMineFragment();
        clear_board();
        choice_mine.setBackgroundResource(R.drawable.btn_mine_true);
        tab_mine.setTextColor(getResources().getColor(R.color.accent));
    }

    private void clear_board()
    {
        choice_charge.setBackgroundResource(R.drawable.btn_charge_false);
        tab_charge.setTextColor(getResources().getColor(R.color.black));
        choice_capacity.setBackgroundResource(R.drawable.btn_capacity_false);
        tab_capacity.setTextColor(getResources().getColor(R.color.black));
        choice_mine.setBackgroundResource(R.drawable.btn_mine_false);
        tab_mine.setTextColor(getResources().getColor(R.color.black));
    }


}
