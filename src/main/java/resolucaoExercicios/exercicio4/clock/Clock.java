package resolucaoExercicios.exercicio4.clock;

public sealed abstract class Clock permits BRLClock, USClock {
    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour >= 24) {
            hour-= 24;
        }
        this.hour = hour;
    }

    public int getMinute() {

        return this.minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60) {
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }
    private String format(int value){
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    public String getTime(){
        return format(hour) + ":" + format(minute) +":" + format(second);
    }

    public void setSecond(int second) {
        if (second >= 60) {
            this.second = 60;
            return;
        }
        this.second = second;
    }

    abstract Clock covert(Clock clock);
}