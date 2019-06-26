package com.example.android.ite20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

public class Expandable_ListView_Adapter_forYourMaterial extends BaseExpandableListAdapter {
    private Context context;
    private List<String> ListDataHeader;
    private HashMap<String, List<String>> ListHashMap;

    public Expandable_ListView_Adapter_forYourMaterial(Context context, List<String> listDataHeader, HashMap<String, List<String>> listHashMap) {
        this.context = context;
        ListDataHeader = listDataHeader;
        ListHashMap = listHashMap;
    }

    @Override
    public int getGroupCount() {
        return ListDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return ListHashMap.get(ListDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return ListDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return ListHashMap.get(ListDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String HeaderTitle = (String) getGroup(groupPosition);
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_group_header, null);
        }
        TextView LabelTextHeader = (TextView) convertView.findViewById(R.id.list_group);
     //   LabelTextHeader.setTypeface(null, Typeface.BOLD);
        LabelTextHeader.setText(HeaderTitle);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final  String ChildText=(String)getChild(groupPosition,childPosition);
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null);
        }
        TextView TextlistChild = (TextView) convertView.findViewById(R.id.list_item);
        TextlistChild.setText(ChildText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
