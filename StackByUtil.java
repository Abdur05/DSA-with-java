import java.util.*;
class StackByUtil
{
public static void main(String args[])
{
Stack<Integer> st=new Stack<Integer>();
boolean result = st.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
st.push(7);  
st.push(13);  
st.push(9);  
st.push(12);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + st);  
result = st.empty();  
System.out.println("Is the stack empty? " + result);  
System.out.println("Popped element"+st.pop());
//Element in top position
System.out.println("Peeked element"+st.peek());

System.out.println("Size of element"+st.size());

Iterator iterator = st.iterator();  
while(iterator.hasNext())  
{  
Object values = iterator.next();  
System.out.println(values);   
}     

}
}