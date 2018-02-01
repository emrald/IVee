package com.androidtutorialpoint.horizontallistview;

import android.view.View;

/**
 * Created by Abc on 18/08/2017.
 */

public interface  Observer {

    View getView();

    void setOnScrollListener(OnScrollListener onScrollListener);
}
