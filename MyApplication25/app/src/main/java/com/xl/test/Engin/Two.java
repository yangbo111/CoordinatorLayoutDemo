package com.xl.test.Engin;

import com.xl.test.Interface.TypeFactory;
import com.xl.test.Interface.Visitable;

/**
 * Created by hushendian on 2017/8/30.
 */

public class Two implements Visitable {
    private int resID;

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public Two(int resID) {
        this.resID = resID;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
