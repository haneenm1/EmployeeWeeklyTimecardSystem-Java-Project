
package main;
import java.util.*;

public class main {
       public static void main(String[] args) { 
       Eemployee tmp[] = new Eemployee[5];
       
       for(int i =0;i<5;i++){
           tmp[i]=new Eemployee();
       }
       
       tmp[0].setEmpNo(1);
       tmp[0].setName("Ali");
       tmp[0].setPayRatePerHour(100);
       
      Timecard arr[]=new Timecard[3];
      for(int i=0;i<3;i++){
         arr[i]=new Timecard();
      }
      arr[0].setWeekEndingData("5/5/2020");
      //week1
     int arr2[]=new int[4];
     arr2[0]=8;arr2[1]=8;arr2[2]=8;arr2[3]=8;
      arr[0].setWorkingday(arr2);

    //week2
     arr[1].setWeekEndingData("5/8/2020");
     int arr3[]=new int [5];
     arr3[0]=8;arr3[1]=8;arr3[2]=8;arr3[3]=8;arr3[4]=8;
     arr[1].setWorkingday(arr3);
     
     
    //week3
    
    arr[2].setWeekEndingData("4/9/2022");
    int arr4[]=new int[3];
    arr4[0]=4;arr4[1]=4;arr4[2]=4;
    
    
    
          
    tmp[0].setGender("male");
    tmp[0].setTaken("yes");
    
    
    
    tmp[1].setEmpNo(2);
    tmp[1].setName("Ahmad");
    tmp[1].setPayRatePerHour(150);
    Timecard ar[]=new Timecard[2];
    for(int i=0;i<2;i++){
        ar[i]=new Timecard();
    }
    
    //week1
   ar[0].setWeekEndingData("3/3/2020 ");
   int arr5[]=new int [1];
   arr5[0]=8;
   
   ar[0].setWorkingday(arr5);
   
   //week2
   
   ar[1].setWeekEndingData("2/2/2022");
   int arr6[] = new int[3];
   arr6[0]=5;arr6[1]=5;arr6[2]=5;
   
  
   
   
   printinof(tmp);
}

    private static void printinof(Eemployee[] tmp) {
        tmp=new Eemployee[5];
        System.out.println("Employee Number /t/t/t Week /t/t/t Total Days/hours /t/t/t Weekly payment /t/t/t ");
        
        for(int i=0;i<5;i++){
            for(int j=0;j<tmp[i].getTimecard().length;j++){
                if(tmp[i].getTaken().equals("yes")){
                    System.out.println();
                    System.out.print(tmp[i].getEmpNo()+" \t\t\t\t   "+(j+1)+"\t\t\t"+tmp[i].getTimecard()[j].getWorkingday().length+"/");
                    
                    
                    int sum=0;
                    for(int x=0;x<tmp[i].getTimecard()[j].getWorkingday().length;i++){
                    sum=sum+tmp[i].getTimecard()[j].getWorkingday().length;
                    }
                    double payment;
                    
                    payment=tmp[i].getTimecard()[j].getWorkingday().length*tmp[i].getPayRatePerHour();
                    
                    
                    System.out.println(" /t/t/t /"+ sum +" /t/t/t "+payment);
                }
                    
                    
                    else{
                            
                            }
               
            }
        }
    }
}



