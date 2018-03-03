/**
 * Core class
 *
 * @author Hieu Duong
 */

public class Core {
    private String name;
    private ArrayQueue<Process> processes;
    private Process currProcess;

    public Core(String name, ArrayQueue<Process> processes) {
        this.name = name;
        this.processes = processes;
        currProcess = null;
    }

    public void incrTime(){

        boolean done = false;

        while(!done){
            try{
                currProcess= processes.dequeue();

            } catch(Exception e){
                System.out.println(e.getMessage());
                done=true;
            }
            //System.out.println("Done? "+done);
            if(currProcess!=null) {
                System.out.println(this.name + ", " + currProcess.getName()+", "+currProcess.getpTime());

                String name = currProcess.getName();
                int t = currProcess.getpTime();
                t--;
                if(t>0){
                    processes.enqueue(new Process(name, t));
                }
            }
        }

    }
}
