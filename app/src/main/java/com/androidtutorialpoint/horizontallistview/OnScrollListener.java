package com.androidtutorialpoint.horizontallistview;

import android.view.View;

/**
 * Created by Abc on 18/08/2017.
 */

public interface  OnScrollListener {


    void onScrollChanged(View view, int x, int y, int dx, int dy, boolean accuracy);

}
