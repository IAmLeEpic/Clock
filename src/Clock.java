public class Clock {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public Clock(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        hours.getValue();
        minutes.getValue();

        updateDisplay();
    }

    public Clock(int hour, int minute){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);

        hours.setValue(hour);
        minutes.setValue(minute);

        updateDisplay();
    }

    public void timeTick(){
        minutes.increment();

        if(minutes.getValue() == 60){
            minutes.setValue(0);
            hours.increment();
        }
    }

    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);

        updateDisplay();
    }

    public String getTime(){
        return displayString;
    }

    public void updateDisplay(){
        displayString = "" + hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

}
