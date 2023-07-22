import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
             //Complete the code
            Stack<Character> ch=new Stack<>();
            boolean flag=true;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='['){
                    ch.push(input.charAt(i));
                }
                else{
                    if(input.charAt(i)==')' && !ch.isEmpty() && ch.peek()=='(') {
                        ch.pop();
                    }
                    else if(input.charAt(i)=='}' && !ch.isEmpty() && ch.peek()=='{'){
                        ch.pop();
                    }
                    else if(input.charAt(i)==']' && !ch.isEmpty() && ch.peek()=='[') {
                        ch.pop();
                    }
                    else {
                        flag=false;
                    }
                }
            }
           
            if(input.length()==0)
            {
                System.out.println("true");
            }
            else if(flag==true && ch.size()==0){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
		}
		
	}
}



