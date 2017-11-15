package hrsoft.test_monitor.mvp.view.Skip;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;
import hrsoft.test_monitor.R;

/**
 * Created by heaijia on 2017/11/2.
 */
class MyAdapter extends RecyclerView.Adapter {

    public MyAdapter() {
        data.add(new CellDate("123", "1234"));
        data.add(new CellDate("123", "1234"));
        data.add(new CellDate("123", "1234"));
        data.add(new CellDate("123", "1234"));
        data.add(new CellDate("123", "1234"));
        data.add(new CellDate("123", "1234"));
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        private View root;
        private TextView tvTitle, tvContent;
        private Button btnadd, btndelete;

        public MyViewHolder(View root) {
            super(root);

            tvTitle = root.findViewById(R.id.tvTitle);
            tvContent = root.findViewById(R.id.tvContent);
            btnadd = root.findViewById(R.id.btn_add);
            btndelete = root.findViewById(R.id.btn_delete);
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

        public TextView getTvContent() {
            return tvContent;
        }



//        public TextView getAdd(){
//            return btnadd;
//        }
//        public TextView getDelete(){
//            return btndelete;
//        }

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int positon) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        MyViewHolder vh = (MyViewHolder) holder;

        CellDate cd = data.get(position);

        vh.getTvTitle().setText(cd.title);
        vh.getTvContent().setText(cd.content);
    }

    public void addA ()
    {
                data.add(new CellDate("435345", "123123"));
                notifyDataSetChanged();
    }


    public void deleteD (final int position)
    {
            data.remove(position);
            notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    private List<CellDate> data = new ArrayList<>();
}
