//Here we have illustrated the significance of various methods to perform the workings of the Droid (Robot).
class Droid{
  int batteryLevel;
 Droid(){
    batteryLevel=100;
 //Now every time a Droid is created, its battery level will be at 100 percent.
    }
  public void activate(){
    System.out.println("Activated! How can I help You?");
   
  batteryLevel=batteryLevel-5;
  System.out.println("Battery Level is:"+ batteryLevel+" percent.");
}
public void chargeBattery(int hours){
System.out.println("Droid Charging...");  
  batteryLevel=batteryLevel+hours;
  if(batteryLevel>100){
    batteryLevel=100;
    System.out.println("Battery Level is:"+batteryLevel+" percent.");
  }
      
 else{
   System.out.println("The Battery Level is:"+batteryLevel+" percent.");
 }
}
//Let's provide a way for users to charge their Droid. 
public int checkBatteryLevel(){
  System.out.println("The batteryLevel is:"+batteryLevel+" percent.");
  return(batteryLevel);
}
  public void hover(int feet){
    if(feet>2){
      System.out.println("Error! I cannot hover above 2 feet.");
    }
    else{
      System.out.println("Hovering...");
      }
    batteryLevel=batteryLevel-20;
    System.out.println("The Battery Level is:"+batteryLevel+" percent.");
  }

  public static void main(String args[]){
    Droid Droid=new Droid();
    Droid.activate();
    Droid.chargeBattery(5);
    Droid.hover(2);
    
  }
  
}
/*OUTPUT
Activated! How can I help You?
Battery Level is:95 percent.
Droid Charging...
The Battery Level is:100 percent.
Hovering...
The Battery Level is:80 percent.
*/
