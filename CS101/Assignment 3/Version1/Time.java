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

    public Time(int h, int s, int m) {
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
    public int gethour() {
        return this.hours;
    }

    public int getminute() {
        return this.minutes;
    }

    public int getseconds() {
        return this.seconds;
    }

    //Mutator
    public void advanceBy(int seconds) {//check this
        int counter = 0;
        if (seconds + this.seconds < 60) {
            this.seconds = seconds + this.seconds;
        } else if (this.seconds + seconds >= 60) {
            counter = seconds / 60;
            while (counter != 0) {
                ++this.minutes;
                --counter;
            }
            this.seconds = seconds % 60;

        } else if (this.seconds + seconds >= 3600) {
            counter = seconds / 3600;
            while (counter != 0) {
                ++this.hours;
                --counter;
            }
        }
        this.minutes = seconds % 3600;
        this.seconds = (seconds / 3600) % 60;
    }


@Override
public String toString(){
return String.format("%d : %d : %d",hours,minutes,seconds);

}
}





//public int compareTo(Time t) { ... }
//that produces the number of seconds from t to this. That is,
//t.advanceBy(this.compareTo(t)) should set t to the same time as this.
//
//
//
// public boolean equals(Time another) { ... }
//that returns true if and only if the times have the same value.
//Figure 1:
//}
