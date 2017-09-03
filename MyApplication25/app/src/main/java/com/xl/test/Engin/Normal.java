package com.xl.test.Engin;

import com.xl.test.Interface.TypeFactory;
import com.xl.test.Interface.Visitable;

/**
 * Created by hushendian on 2017/8/30.
 */

public class Normal implements Visitable {
    private String text;

    public Normal(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
