package dev.aldi.sayuti.editor.view.palette;

import android.content.Context;


import com.besome.sketch.beans.LayoutBean;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;

public class IconNumberPicker extends IconBase {
    public IconNumberPicker(Context context) {
        super(context);
    }

    public void a(Context context) {
        IconNumberPicker.super.a( context);
        setWidgetImage(2131166357);
        setWidgetName("NumberPicker");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 49;
        LayoutBean layoutBean = viewBean.layout;
        layoutBean.orientation = 1;
        layoutBean.width = -1;
        layoutBean.height = -2;
        layoutBean.paddingLeft = 8;
        layoutBean.paddingTop = 8;
        layoutBean.paddingRight = 8;
        layoutBean.paddingBottom = 8;
        viewBean.convert = "android.widget.NumberPicker";
        return viewBean;
    }
}
