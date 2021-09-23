public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName()+" has ended.");  
    }

// Create main() method and appropriate statements in it

	public static void main(String[] args){
      Question62 m1 = new Question62();
      Thread m2 = new Thread(m1);
      
      System.out.println("Welcome to Java Week 6 New Question.");
      m2.setName("Main Thread");
      
      m2.start();
      //n2.start();
    } 
}
