

class PrintTable{

public static void PrintTable(int n){

	for (int i=1;i<=10;i++){
	
	System.out.println(n+"*"+i+"="+(n*i));
	}


}
public static void main(String[] args){

if(args.length<=0){

  System.out.println("Error enter one parameter");
  
}


else{
	PrintTable(Integer.parseInt(args[0]));

}
}

}