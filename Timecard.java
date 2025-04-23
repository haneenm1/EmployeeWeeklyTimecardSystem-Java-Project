
package main2;


public class Timecard {
    private String WeekEndingData;
    private int[] workingday;

    public Timecard() {
      WeekEndingData="" ;
      this.workingday = new int[5];
    }

    public String getWeekEndingData() {
        return WeekEndingData;
    }

    public void setWeekEndingData(String WeekEndingData) {
        this.WeekEndingData = WeekEndingData;
    }

    public int[] getWorkingday() {
        return workingday;
    }

    public void setWorkingday(int[] workingday) {
        this.workingday = workingday;
    }




}
