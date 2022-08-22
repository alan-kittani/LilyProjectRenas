package CellPhonee;

public class CellPhone {

    //Instances

    String make;
    String model;
    private int price;
    private int batteryPercent;

    public int getBatteryPercent()
    {
        return batteryPercent;
    }



    public void chargeBattery (int charging)
    {
        if (charging <= 0)
        {
            System.out.println("we could not charge the phone");
        }
        else if(charging >= 100)
        {
            this.batteryPercent = 100;
        }
        else
        {
            if (batteryPercent + charging == 100)
                this.batteryPercent = 100;
        }


    }
    public int getPrice()
    {
        return price;
    }


    public void setPrice(int price)
    {
        if(price <= 0)
        {
            System.out.println("The price cannot be less than or equal to 0!");
        }
        else
        {
            this.price = price;
        }
    }


    static
    {
        System.out.println("Phone object is created");
    }


    // Constructor
    public CellPhone (String make, String model)
    {
        this.make = make;
        this.model = model;

    }


    public void usePhone(int min)
    {
        if(batteryPercent <= 1)
        {
            System.out.println("Insificcient battery");
        }
        else
        {
            batteryPercent -= min*2;
            //IF the battery finished after the makeCall()
            if (batteryPercent <= 100)
            {
                System.out.println("Battery die!!");
                batteryPercent = 0;
            }

        }
    }




    public String toString()
    {
        return "Make: " +make+ "\r\n"
                + "Model: " +model+ "\r\n"
                + "Price: " +price +"\r\n"
                + "Battery: " +batteryPercent + "\r\n ---------";
    }





}
