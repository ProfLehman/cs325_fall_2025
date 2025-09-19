// DemoStackQueue.java
// prof. lehman
// fall 2025
//
// sample code for virtual class day
// demonstrates using StackCharArray and QueueCharArray classes
//

class DemoStackQueue {

  public static void main(String[] args) {

      //*** Part 1 - reverse stack
      //

      String word = "Friday";

      StackCharArray st = new StackCharArray();

      // add all leters from word to stack
      int i = 0;
      while (i < word.length())
      {
        st.push( word.charAt(i) );
        i++;
      }   
            
      System.out.println( st );

      //to reverse stack
      // place all items from stack into queue
      // place all items in queue into stack
      QueueCharArray qu = new QueueCharArray();
      
      while (st.empty() == false)
          {
              qu.add( st.top() );
              st.pop();
          }

      while (qu.empty() == false)
          {
              st.push( qu.front() );
              qu.remove();
          }

      System.out.println( st ); //stack now reversed

      //clear stack
      st = new StackCharArray();

      
      //*** Part 2 - reverse queue
      //
    
      // add all leters from word to queue
      int i = 0;
      while (i < word.length())
      {
        qu.add( word.charAt(i) );
        i++;
      }

      System.out.println( qu );

      //to reverse queue
      // place all items from queue into stack
      // place all items from stack back into queue
      while (qu.empty() == false)
          {
              st.push( qu.front() );
              qu.remove();
          }
      
      while (st.empty() == false)
          {
              qu.add( st.top() );
              st.pop();
          }

      System.out.println( qu ); //stack now reversed

      
  }//main  
  
}//class
