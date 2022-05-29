/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Time.WaitTime;

/**
 *
 * @author Administrator
 */
public abstract class AbsTime{

    private double startTime = 0;
    private double spec = 0;

    protected AbsTime() {
    }

    protected AbsTime(double spec) {
        start(spec);
    }
    
    protected abstract double getTimeCurrent();

    public final void start(double spec) {
        this.spec = spec;
        startTime = getTimeCurrent();
    }

    public boolean onTime() {
        return getTime() < spec;
    }

    public double getTime() {
        return getTimeCurrent() - startTime;
    }

    public void update() {
        startTime = getTimeCurrent();
    }

    public boolean isOverTime(int time) {
        return getTime() >= time;
    }
}
