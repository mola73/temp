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
        if (s <= 60) {
            this.seconds = s;
        } else {
            this.seconds = 0;
        }

    }

    public Time(Time t) {

        if (t.seconds <= 60) {
            this.seconds = t.seconds;
        } else {
            this.seconds = 0;
        }

    }

    //Accesor methods
    public int gethour() {
        int hour = this.seconds / 3600;;

        return hour;
    }

    public int getminute() {
        int minutes = (this.seconds % 3600) / 60;
        return minutes;
    }

    public int getseconds() {
        int second = ((this.seconds % 3600) % 60);
        return second;
    }

    //Mutator
    public void advanceBy(int seconds) {//check this

        this.seconds = this.seconds + seconds;
    }

    @Override
    public String toString() {
        return String.format("%d : %d : %d", this.gethour(), this.getminute(), this.getseconds());

    }

    public int compareTo(Time t) {

//that produces the number of seconds from t to this. 
//That is,t.advanceBy(this.compareTo(t)) should set t to the same time as this.
        return this.seconds - t.seconds;
    }

    public boolean equals(Time another) {

        return this.seconds == another.seconds;

    }
}
