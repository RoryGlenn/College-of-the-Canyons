package project_04;

public class Test {

    public static void main(String[] args) {

        Queue<Double> queueList = new Queue<>();
        queueList.enqueue(60.0);
        queueList.enqueue(12.0);
        queueList.enqueue(16.4);
        queueList.enqueue(26.5);

        Queue<String> queueListP = new Queue<>();

        queueListP.enqueue("Yes");
        queueListP.enqueue("No");
        queueListP.enqueue("Maybe");
        
        System.out.println(queueListP.dequeue());
        
        
        
        

    }

}
