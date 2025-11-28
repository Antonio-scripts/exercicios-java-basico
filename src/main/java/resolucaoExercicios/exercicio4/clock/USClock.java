package resolucaoExercicios.exercicio4.clock;

public non-sealed class USClock extends Clock{

    private String periodIndicator;

    public String getPeriodIndicator() {
        return this.periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }
    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {

        if ((hour > 12)&& (hour < 24)) {
            this.setHour(hour - 12);
            setAfterMidday();
        }else if (hour == 24) {
            this.hour = 0;
        }else{
            this.hour = hour;
            setBeforeMidday();
        }
    }

    @Override
    public String getTime(){
        return super.getTime() + " " + this.periodIndicator;
    }

    @Override
    public Clock covert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

}