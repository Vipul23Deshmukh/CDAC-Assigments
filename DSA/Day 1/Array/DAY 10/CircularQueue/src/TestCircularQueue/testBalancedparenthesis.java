package TestCircularQueue;

import CircularQueue.Myatackgeneric;

public class testBalancedparenthesis {

	public static boolean checkparenthesis(String str1) {
		
		Myatackgeneric<Character> st=new Myatackgeneric<>();
		
		for(int i=0;i<str1.length();i++)
		{
			Character ch=str1.charAt(i);
			
			if(ch=='('  || ch=='[' || ch=='{')
			{
				st.push(ch);
			}
			
			else
			{
				if(st.isempty())
				{
					return false;
				}
				else
				{
				Character ch2=st.pop();
				
				switch(ch)
				{
				case ')'->{ if(ch2!='(')
				{
					return false;
				}}
				case ']'-> {if(ch2!='[')
				{
					return false;
				}}
				
				case '}'->{if(ch2!='{')
				{
					return false;
				}}
				
				}
			}
		}
		}
		return st.isempty();
	}
	public static void main(String[] args) {
		
		String str1="{{()[]{[]}}}";
		
		boolean status=checkparenthesis(str1);
		
		if(status)
		{
			System.out.println(" balanced paranthesis");
		}
		else
		{
			System.out.println(" not balanced parenthesis");
		}

	}

	

}
