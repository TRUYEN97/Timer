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
public class TimeH extends AbsTime{
      public TimeH(int time) {
        super(time);
    }

      @Override
    public long getTimeCurrent() {
        return (long) (System.currentTimeMillis() / 36e6);
    }
}
