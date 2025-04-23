
package main2;


public class Employee {
 private int empNo;
 private String name;
 private double PayRateperHour;
 private Timecard[] timecard;
 private int age ;
 private String gender;
 private String taken;
private double totalpay;
    public Employee() {
       
        empNo=0;
        age = 0;
        gender = "";
        name="";
        PayRateperHour=0;
        timecard = new Timecard[4];
        taken = "No";
        totalpay=0;
 
        
    }

    public Employee(int empNo, String name, double PayRatePerHour, Timecard[] timecard, int age, String gender, String taken,double totalday) {
        this.empNo = empNo;
        this.name = name;
        this.PayRateperHour = PayRatePerHour;
        this.timecard = timecard;
        this.age = age;
        this.gender = gender;
        this.taken = taken;
        this.totalpay=totalpay;
    }

    public double getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(double totalpay) {
        this.totalpay = totalpay;
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

    @Override
    public String toString() {
        return "Employee{" + "empNo=" + empNo + ", name=" + name + ", PayRateperHour=" + PayRateperHour + ", timecard=" + timecard + ", age=" + age + ", gender=" + gender + ", taken=" + taken + ", totalpay=" + totalpay + '}';

    }
    
    
  /*  public double getTtalpay(){
     double sum=0;
      for(int i=0;i<5;i++){ 
         for(int j=0;j<;j++){
          sum=sum+(emp[i].getTimecard().length)*(emp[i].getPayRatePerHour());
  
}     
         break;
    }      return sum;
 } 
}*/
}