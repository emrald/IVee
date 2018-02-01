package com.androidtutorialpoint.horizontallistview;

import android.view.View;

/**
 * Created by Abc on 18/08/2017.
 */

public interface  ObservableFragment {


    View getScrollTarget();


    /**
     * Listener for offset changed event
     *
     * @param target         The view that is currently selected by ViewPager
     * @param verticalOffset Current vertical offset of SmoothAppBarLayout. It has the same value with smoothAppBarLayout.getCurrentOffset()
     * @return False if scroll hasn't been initiated or is waiting for async loading. If false, it will stop propagating ViewPager
     */
    boolean onOffsetChanged(SmoothAppBarLayout smoothAppBarLayout, View target, int verticalOffset);

}
