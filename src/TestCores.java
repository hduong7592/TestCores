import java.security.SecureRandom;

public class TestCores{

    public static void main(String[] args){
        SecureRandom rand = new SecureRandom();
        ArrayQueue<Process> tasks = new ArrayQueue(10);
        for(int i=0; i<20; i++){
            tasks.enqueue(new Process("Task #"+(i+1),rand.nextInt(10)+1));
        }

        Core c1 = new Core("Core #1",tasks);
        Core c2 = new Core("Core #2",tasks);
        Core c3 = new Core("Core #3",tasks);
        int count=1;

        while(!tasks.isEmpty()){
            System.out.print("\n"+ (count++)+" ");
            c1.incrTime();
            c2.incrTime();
            c3.incrTime();
        }
    }

}