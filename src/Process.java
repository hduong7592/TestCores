/**
 * Process class
 *
 * @author Hieu Duong
 */

public class Process {
    private String name;
    private int pTime;

    public Process(String name, int pTime) {
        this.name = name;
        this.pTime = pTime;
    }

    public String getName() {
        return name;
    }

    public int getpTime(){
        return pTime;
    }

    public boolean processTime(){
        if(pTime == 0) return true;
        else return false;
    }
}
