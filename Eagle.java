public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {  
        if (!this.flying && this.altitude == 0) {
            this.flying = true;      
        System.out.println(this.getName() + " takes off in the sky.");
        }
    }

    @Override
    public int ascend(int meters) {
        if(this.flying) {
            this.altitude = Math.min(this.altitude + meters, 150);
            System.out.println(this.getName() + " flies upward, altitude : " +  altitude);
        }
        return this.altitude;        
        
    }

    @Override
    public int descend(int meters) {
        if(this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(getName() + " flies downward, altitude : " +  altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        System.out.println(getName() + " into the air.");
    }

    @Override
    public void land() {
        if(getAltitude() <= 1) {
            this.flying = false;
            System.out.println(getName() + "  lands on the ground.");
        } else {
            System.out.println(getName() + " is too high, it can't lands");
        }
        
    }
}
