package Anii;
class Biker 
{ 
    public int gear; 
    public int speed; 
    public Biker(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("No of gears are " + gear + "\n" + "speed of biker is " + speed); 
    }  
} 
class MountainBike extends Biker 
{ 
    public int seatHeight; 
    public MountainBike(int gear,int speed,int startHeight) 
    {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
}
public class Test  
{ 
    public static void main(String args[])  
    { 
        MountainBike mb = new MountainBike(4, 180, 80); 
        System.out.println(mb.toString());
    } 
}

