class Commandargs{
    public static void main(String args[])
	{
	   if(args.length<=0)
	   {
	      System.out.println("Error:Enter at least 1 parameter.");
	   }
	   
	   else{
	      for(int i=0;i<args.length;i++)
		  {
		     System.out.println("Hello : "+args[i]);
		  }
	   }
	   
	}
}