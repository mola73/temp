/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version1b;

/**
 *
 * @author muham
 */
public class Time implements Comparable<Time> {

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
    public void advanceBy(int seconds) {//check this
        if (seconds > 0) {
            this.hours = currhour(seconds) + this.hours;
            this.minutes = currmin(seconds) + this.minutes;
            this.seconds = currsec(seconds) + this.seconds;
        }
    }

    private int currhour(int seconds) {
        int hour = seconds / 3600;
        return hour;
    }

    private int currmin(int seconds) {//fix this
        int min = 0;
        int num = seconds % 3600;
        while (num >= 60) {
            ++minutes;
            num = num - 60;

        }
        return min;
    }

    private int currsec(int seconds) {
        int num = seconds % 3600;
        while (num >= 60) {
            num = num - 60;
        }
        return num;
    }

    @Override
    public String toString() {
        return String.format("%d : %d : %d", hours, minutes, seconds);

    }

    @Override
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

        return count;
    }

    public boolean equals(Time another) {
        return this.hours == another.hours && this.minutes == another.minutes && this.seconds == another.seconds;

    }
}
