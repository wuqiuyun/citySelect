package com.example.administrator.newcityselect.citypicker.adapter;

import com.example.administrator.newcityselect.citypicker.model.City;

public interface OnPickListener {
    void onPick(int position, City data);

    void onLocate();

    void onCancel();
}
