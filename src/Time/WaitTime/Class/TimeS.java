package Time.WaitTime.Class;

import Time.WaitTime.AbsTime;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class TimeS extends AbsTime {

    public TimeS(int time) {
        super(time);
    }
    
    @Override
    public long getTimeCurrent() {
        return System.currentTimeMillis() / 1000;
    }
}
