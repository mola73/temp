/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version1;

/**
 *
 * @author muham
 */
public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {//creates midnight

        this.hours = 0;
        this.hours = 0;
        this.seconds = 0;
    }

    public Time(int h, int m, int s) {
        if (h <= 24) {
            this.hours = h;
        } else {
            this.hours = 0;
        }
        if (m <= 60) {
            this.minutes = m;
        } else {
            this.minutes = 0;
        }
        if (s <= 60) {
            this.seconds = s;
        } else {
            this.seconds = 0;
        }

    }

    public Time(Time t) {
        if (t.hours <= 24) {
            this.hours = t.hours;
        } else {
            this.hours = 0;
        }
        if (t.minutes <= 60) {
            this.minutes = t.minutes;
        } else {
            this.minutes = 0;
        }
        if (t.seconds <= 60) {
            this.seconds = t.seconds;
        } else {
            this.seconds = 0;
        }

    }

    //Accesor methods
    public int gethours() {
        return this.hours;
    }

    public int getminutes() {
        return this.minutes;
    }

    public int getseconds() {
        return this.seconds;
    }

    public void setseconds(int seconds) {
        this.seconds = seconds;
    }

    public void setminutes(int minutes) {
        this.minutes = minutes;
    }

    public void sethours(int hours) {
        this.hours = hours;

    }

    //Mutator
    public void advanceBy(int seconds) {//check this FOR NEGATIVE ADVANCEMENT FORM 0 TO 23 TO 22
        if (seconds > 0) {
            this.hours = currhour(seconds) + this.hours;
            this.minutes = currmin(seconds) + this.minutes;
            this.seconds = currsec(seconds) + this.seconds;
        }

    }

    private int currhour(int seconds) {//works for positive numbers not neg.
        int hour = 0;
        while ((seconds > 86400) || (seconds < -86400)) {//simplify time to be in limit of one day:86400seconds
            seconds = seconds % 86400;
        }
        hour = seconds / 3600;
        return hour;
    }

    private int currmin(int seconds) {//works for positive numbers not neg.
        int min = 0;
        while ((seconds > 86400) || (seconds < -86400)) {
            seconds = seconds % 86400;
        }
        int num = seconds % 3600;
        while (num >= 60) {
            ++min;
            num = num - 60;

        }
        return min;
    }

    private int currsec(int seconds) {//works for positive numbers not neg.
        while ((seconds > 86400) || (seconds < -86400)) {
            seconds = seconds % 86400;
        }
        int num = (seconds % 3600) % 60;
        while (num >= 60) {
            num = num - 60;
        }
        return num;
    }

    @Override
    public String toString() {
        return String.format("%d : %d : %d", hours, minutes, seconds);

    }

    public int compareTo(Time t) {
        int count = 0;
        if (t.hours != this.hours) {
            count = Math.abs(this.hours - t.hours) * 3600;
        }
        if (t.minutes != this.minutes) {
            count = count + Math.abs(this.minutes - t.minutes) * 60;
        }

        if (t.seconds != this.seconds) {
            count = count + Math.abs(this.seconds - t.seconds);
        }
//that produces the number of seconds from t to this. 
//That is,t.advanceBy(this.compareTo(t)) should set t to the same time as this.

        return count;
    }

    public boolean equals(Time another) {

        return this.hours == another.hours && this.minutes == another.minutes && this.seconds == another.seconds;

    }
}
