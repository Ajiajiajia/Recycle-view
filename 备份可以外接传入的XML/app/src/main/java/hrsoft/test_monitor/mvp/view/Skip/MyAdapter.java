package hrsoft.test_monitor.mvp.view.Skip;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hrsoft.test_monitor.R;

/**
 * Created by heaijia on 2017/11/2.
 */
class MyAdapter extends RecyclerView.Adapter {


    class MyViewHolder extends RecyclerView.ViewHolder {

        private View root;
        private TextView tvTitle,tvContent;

        public MyViewHolder(View root) {
            super(root);

            tvTitle=root.findViewById(R.id.tvTitle);
            tvContent=root.findViewById(R.id.tvContent);
//            tv = itemView;
        }

//        public TextView getTv() { //用它来返回TextView  用于外部调用
//            return tv;
//        }
        public TextView getTvTitle(){
            return tvTitle;
        }

        public TextView getTvContent(){
            return tvContent;
        }


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder vh = (MyViewHolder) holder;
//        vh.getTv().setText("item" + position);

        CellDate cd=data[position];
        vh.getTvTitle().setText(cd.title);
        vh.getTvContent().setText(cd.content);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public CellDate[] data = new CellDate[]{new CellDate("何艾葭","11.19"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("李泽","5.26"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31"),new CellDate("萌萌姐","6.1"),new CellDate("顾梓炜","10.23"),new CellDate("刘静怡","10.19"),new CellDate("顾梓炜","10.23"),new CellDate("罗猪猪","9.31")};
}
