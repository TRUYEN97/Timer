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
public class TimeMM extends AbsTime {

    public TimeMM(int time) {
        super(time);
    }

    @Override
    public long getTimeCurrent() {
        return (long) (System.currentTimeMillis() / 6e4);
    }
}
