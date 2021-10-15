package lesson6.clockfeatures.domain;

/**
 * Hour should represent a value between 0 and 24
 */
public class Hour {
    private byte hour;



    public Hour() {
    }

    public Hour(byte hour) {
        this.setHour(hour); // manually added
    }

    public byte getHour() {
        return hour;
    }

    // Must have doc. comment for changed
    /**
     * Validation is in place
     * byte values between 0 and 24
     * @param hour - byte
     */
    public void setHour(byte hour) {

        if (hour < 0){
            //Trow an error - too small
            return;
        }else if (hour > 24){
            //Trow an error - too large
            return;
        }
        this.hour = hour;
    }
}
