
package hrsoft.test_monitor.mvp.view.charge;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hrsoft.test_monitor.R;
import hrsoft.test_monitor.mvp.view.Skip.SkipActivity;


public class ChargeFragment extends android.support.v4.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v = inflater.inflate(R.layout.fragment_layout_charge, container, false);
        v.findViewById(R.id.btn_Clickto_capacityFragemnt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SkipActivity.class));

            }
        });
        return v;

    }
}