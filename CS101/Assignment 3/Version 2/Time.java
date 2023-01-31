/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version2;

/**
 *
 * @author muham
 */
public class Time {

    private int seconds;

    public Time() {//creates midnight

        this.seconds = 0;
    }

    public Time(int s) {
        if (s >= 0) {
            this.seconds = s;
        } else {
            this.seconds = 0;
        }

    }

    public Time(Time t) {

        if (t.seconds >= 0) {
            this.seconds = t.seconds;
        } else {
            this.seconds = 0;
        }

    }

    public void setseconds(int seconds) {
        this.seconds = seconds;
    }

    //Accesor methods
    public int gethours() {
        int hour = this.seconds / 3600;

        return hour;
    }

    public int getminutes() {
        int minutes = 0;
        int num = this.seconds % 3600;
        while (num >= 60) {
            ++minutes;
            num = num - 60;

        }
        return minutes;
    }

    public int getseconds() {
        int num = this.seconds;
        while (num >= 60) {
            num = num - 60;
        }
        return num;
    }

    //Mutator
    public void advanceBy(int seconds) {//check this

        this.seconds = this.seconds + seconds;
    }

    @Override
    public String toString() {
        return String.format("%d : %d : %d", this.gethours(), this.getminutes(), this.getseconds());

    }

    public int compareTo(Time t) {

        return this.seconds - t.seconds;
    }

    public boolean equals(Time another) {

        return this.seconds == another.seconds;

    }
}
