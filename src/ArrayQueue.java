/**
 * Array Queue class
 *
 * @author Hieu Duong
 * @param <T>
 */

public class ArrayQueue<T> implements Queueable<T> {
    T[] data;
    int frontInd;
    int backInd;

    public ArrayQueue(){

        data = (T[]) new Object[10];
        frontInd = 0;
        backInd = 0;
    }

    public ArrayQueue(int initialSize){
        data = (T[]) new Object[initialSize];
        frontInd = 0;
        backInd = 0;
    }


    public void enqueue(T value){
        if(isFull()){
            increaseArraySize();
        }

        addToQueue(value);

    }

    public void increaseArraySize(){

        T[] newArray = (T[]) new Object[backInd*2];
        for(int i=0; i<data.length; i++){
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public void addToQueue(T value){
        data[backInd] = value;
        backInd++;
    }

    public T dequeue(){

        T value = data[frontInd];
        for(int i=0; i<data.length; i++){
            if((i+1)<data.length) {
                data[i] = data[i + 1];
                data[i+1] = null;
            }
        }
        return value;
    }

    public int getArraySize(){
        return data.length;
    }

    public boolean isFull(){
        return backInd==data.length;
    }

    public boolean isEmpty(){
        return data.length == 0;
    }

    @Override
    public String toString() {

        String result = "";
        for(int i=0; i<data.length; i++){

            Process p = (Process)data[i];
            if(data[i]!=null) {
                result += "["+p.getName() + ", "+p.getpTime()+"] \n";
            }
        }

        return result;
    }
}
