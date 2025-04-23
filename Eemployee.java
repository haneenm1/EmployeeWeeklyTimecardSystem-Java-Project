
package main;


public class Eemployee {
 private int empNo;
 private String name;
 private double PayRateperHour;
 private Timecard[] timecard;
 private int age ;
 private String gender;
 private String taken;

     public Eemployee() {
       
        empNo=0;
        age = 0;
        gender = "";
        name="";
        PayRateperHour=0;
        timecard = new Timecard[4];
        taken = "No";
 
        
    }

    public Eemployee(int empNo, String name, double PayRatePerHour, Timecard[] timecard, int age, String gender, String taken) {
        this.empNo = empNo;
        this.name = name;
        this.PayRateperHour = PayRatePerHour;
        this.timecard = timecard;
        this.age = age;
        this.gender = gender;
        this.taken = taken;
    }
    

 
 
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRatePerHour() {
        return PayRateperHour;
    }

    public void setPayRatePerHour(double PayRatePerHour) {
        this.PayRateperHour = PayRatePerHour;
    }

    public Timecard[] getTimecard() {
        return timecard;
    }

    public void setTimecard(Timecard[] timecard) {
        this.timecard = timecard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTaken() {
        return taken;
    }

    public void setTaken(String taken) {
        this.taken = taken;
    }

   


 
  
    
    
     
}
