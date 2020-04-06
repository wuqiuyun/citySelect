package com.example.administrator.newcityselect.citypicker.adapter;

import com.example.administrator.newcityselect.citypicker.model.City;

public interface InnerListener {
    void dismiss(int position, City data);

    void locate();
}
