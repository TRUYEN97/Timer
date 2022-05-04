/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Time.WaitTime.Class;

import Time.WaitTime.AbsTime;


/**
 *
 * @author Administrator
 */
public class TimeMs extends AbsTime {

    public TimeMs(int time) {
        super(time);
    }

    @Override
    public long getTimeCurrent() {
        return System.currentTimeMillis();
    }
}
