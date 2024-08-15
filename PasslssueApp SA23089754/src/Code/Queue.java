/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Queue {
    
    private int maxSize;
    private GamePass queueArray[];
    private int front;
    private int rear;
    private int nItems;

    
    public Queue(int s) {
        maxSize = s;
        queueArray = new GamePass[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    //----------------------------------------------
    
//    public Queue(int s){
//    
//    }
    
    public boolean isEmpty(){
        if(nItems == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull(){
        return nItems == maxSize;
        
    }
    
    public void enqueue(GamePass gp){
        
        if(isFull()){
            System.out.println("It is full");
        }
        else{
            if(rear == maxSize -1){
                rear = -1;
            }
            
            queueArray[++rear] = gp;
            nItems++;
        }
    }
    
    public GamePass dequeue(){
        
        if(isEmpty()){
            System.out.println("It is empty");
            return null;
        }
        else{
            if(front == maxSize){
                front = 0;
            }
            
            nItems--;
            return queueArray[front ++];
        }
    }
    
    public GamePass peek(){
        
        if(isEmpty()){
            System.out.println("It is empty");
            return null;
        }
        else{
            return queueArray[front];
        }
    }
    
}
