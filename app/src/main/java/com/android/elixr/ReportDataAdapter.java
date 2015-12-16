package com.android.elixr;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.elixr.models.FieldItem;

import java.util.ArrayList;

/**
 * Created by akshit on 16/12/15.
 */
public class ReportDataAdapter extends BaseAdapter {

    private ArrayList<FieldItem> mFieldList;
    private Context mContext;

    public ReportDataAdapter(Context context, ArrayList<FieldItem> fieldList) {
        mContext = context;
        mFieldList = fieldList;
    }

    @Override
    public int getCount() {
        return mFieldList.size();
    }

    @Override
    public FieldItem getItem(int position) {
        return mFieldList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.report_data_list_item, null);
            holder = createViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        FieldItem fieldItem = getItem(position);
        holder.fieldName.setText(fieldItem.getFieldName());
        holder.value.setText(fieldItem.getValue());
        if (fieldItem.isNormal() == false) {
            holder.value.setTextColor(mContext.getResources().getColor(R.color.red));
            holder.value.setTypeface(Typeface.DEFAULT_BOLD);
        }
        holder.normalValue.setText(fieldItem.getNormalValue());

        return convertView;
    }

    private ViewHolder createViewHolder(View view) {
        ViewHolder holder = new ViewHolder();
        holder.fieldName = (TextView) view.findViewById(R.id.fieldName);
        holder.value = (TextView) view.findViewById(R.id.value);
        holder.normalValue = (TextView) view.findViewById(R.id.normalValue);
        return holder;
    }

    private static class ViewHolder {

        TextView fieldName;
        TextView value;
        TextView normalValue;
    }
}
