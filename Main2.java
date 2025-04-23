
package main2;


public class Main2 {

    
    public static void main(String[] args) {
         Employee []tmp = new Employee[5] ;
        for(int i=0 ; i< 5  ; i++){
            tmp[i] = new Employee(); 
        }
        
        tmp[0].setEmpNo(1);
        tmp[0].setPayRatePerHour(100);
        tmp[0].setName("Ali");
        //making the time card array and parsing it to the Employ Classs
        Timecard []arr = new Timecard[3];
         for(int i=0 ; i< 3  ; i++){
            arr[i] = new Timecard();
        }
         
            //week 1
            arr[0].setWeekEndingData("5/5/2020");
            //working day array
            int arr2[] = new int[4];
            arr2[0]=8;arr2[1]=8;arr2[2]=8;arr2[3]=8;
            arr[0].setWorkingday(arr2);
            
            
            
            //week 2
            
            arr[1].setWeekEndingData("5/8/2022");
            //working day array
            int arr22[] = new int[5];
            arr22[0]=5;arr22[1]=8;arr22[2]=8;arr22[3]=8;arr22[4]=8;
            arr[1].setWorkingday(arr22);
            

            
            //week 3
            arr[2].setWeekEndingData("3/7/2021");
            //working day array
            int arr222[] = new int[3];
            arr222[0]=4;arr222[1]=4;arr222[2]=4;
            arr[2].setWorkingday(arr222);
            
            
        tmp[0].setTimecard(arr);
        tmp[0].setAge(23);
        tmp[0].setGender("Male");
        tmp[0].setTaken("yes");
        
        
        //Employee nuymber 2
        
        tmp[1].setEmpNo(2);
        tmp[1].setPayRatePerHour(150);
        tmp[1].setName("ahmad");
        //making the time card array and parsing it to the Employ Classs     
        Timecard []Emparrtmp = new Timecard[2];
         for(int i=0 ; i< 2  ; i++){
            Emparrtmp[i] = new Timecard();
        }
            //week 1
            Emparrtmp[0].setWeekEndingData("5/2/2020");
            //working day array
            int emp2arr2[] = new int[1];
            emp2arr2[0]=8;
            Emparrtmp[0].setWorkingday(emp2arr2);
            
            
            //week 2
            Emparrtmp[1].setWeekEndingData("9/2/2021");
            //working day array
            int emp2arr22[] = new int[3];
            emp2arr22[0]=8;emp2arr22[1]=2;emp2arr22[2]=5;
            Emparrtmp[1].setWorkingday(emp2arr22);
            
            
        tmp[1].setTimecard(Emparrtmp);
        tmp[1].setAge(23);
        tmp[1].setGender("Male");
        tmp[1].setTaken("yes");
        
      
      
        System.out.println("Q1:  ");
        
        
        printInfo(tmp);
        
        
         System.out.println("***********************");
         
         
        System.out.println("Q2:  ");  
        
        
        printAbsents(tmp,3);
        
        System.out.println("***********************");
        
        System.out.println("Q3:  ");
        
        System.out.println();
        
        
    sortEmps(tmp);
       
        
        
    }
    
    public static void printInfo(Employee [] tmp){
 
        System.out.println("Employee Number \t\t  Week \t\t  Total Days/hours \t\t  Weekly Payment");
        for(int i = 0; i < 5 ; i++){
            for(int j = 0 ; j < tmp[i].getTimecard().length ; j++){
                //Go Throw the weeks 
                
                if(tmp[i].getTaken().equals("yes")){
                System.out.print(tmp[i].getEmpNo()+" \t\t\t\t   "+(j+1)+"\t\t\t"+tmp[i].getTimecard()[j].getWorkingday().length+"/");
                int workingday[] = tmp[i].getTimecard()[j].getWorkingday();
                int sum = 0;
                for(int x = 0 ; x<workingday.length;x++){
                    sum = sum + workingday[x];
                }
                System.out.print(sum+"\t\t\t\t");//Hours of work
                System.out.println(tmp[i].getTimecard()[j].getWorkingday().length*tmp[i].getPayRatePerHour());
                }
                else{
                    //this is an Empty Week 
                }
            }
        }
    }

    private static void printAbsents(Employee[] tmp , int l) {
       
        boolean flag = false;
        for(int i=0;i<tmp.length;i++){
            if(tmp[i].getTaken().equals("yes") && tmp[i].getTimecard().length>l-1){
                if(tmp[i].getTimecard()[l-1].getWorkingday().length == 3){
                    
                    System.out.println(tmp[i].getName() + " has been absent for 2 days in week number "+l);
                    flag = true;
                 }
            }
        
        }
        if(!flag){
            System.out.print("no one was absent in week number "+l);
        }
 
    }
  
    public static void sortEmps(Employee[] tmp) {
        double totalpay=0;
     
      int indx=0;
    for(int i=0;i<2;i++){
     for(int j=0;j<tmp[i].getTimecard().length;j++){
         totalpay=totalpay+tmp[i].getTimecard()[j].getWorkingday().length*tmp[i].getPayRatePerHour();
         tmp[i].setTotalpay(totalpay);
      
     }
     totalpay=0;

    }
    
  
    
    for(int i=0;i<tmp.length;i++){
        for(int j=i+1;j<tmp[i].getTimecard().length;j++){
            if(tmp[j].getTotalpay() > tmp[i].getTotalpay()){
               Employee temp =new Employee();
               temp=tmp[i];
               tmp[i]=tmp[j];
               tmp[j]=temp;
               
                
            }
        }
    }
    
    for(int i=0;i<tmp.length;i++){
        System.out.println(tmp[i].toString());
    }
    
}
            
}        

