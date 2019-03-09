package Sitsjp;
// Creat class name grandpa
   class grandpa 
   {//Class start
	 public void house ()
	 {
		 System.out.println("Take care grand pa house");
	 }
	 public void car()
	 {
		 System.out.println("Take care grandpa car");
	 }  
	   
 }// class end
class parents extends grandpa 
{// class start
	public void mony ()	
	{
		System.out.print("mony gift from grandpa");
	}

}// class end
class me extends parents
{
public void gold ()	
    {
	System.out.print("gold gift from parent");
    }

	
	
}




public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 parents P = new parents();
 // Inhert new gift
    P.house();
    P.car();
    P.mony();
    System.out.println("----------------");
    me M = new me();
    M.house();
    M.car();
    M.mony();		
    M.gold();		
	}

}
