package Sitsjp;

//Inheritance is a process
//where one object acquires properties from another object

//creta class name car
class car
//class start
{
	//creat new method named start 
	public void start()
	{
		System.out.println("start the car");
	}
	public void stop()
	 {//method start
		System.out.println("stop the car");
     }// method end
}// class end
//creat inhertance class
class BMW extends car
//extends creats inheritance relation withe the class
//inheritance class start
{
	public void Special_feature()
	{
		System.out.println("special features of a BMW");
	}
}// end class
class porsche extends BMW
{
	public void special_porsche()
	{
		System.out.println("special features of Porsche");
	}
}

public class inhertance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW B = new BMW();
// Intiate new object for BMW
    B.start();
    B.stop();
    B.Special_feature();
    System.out.println("------------------------");
    porsche P = new porsche ();
    P.start();
    P.stop();
    P.special_porsche();
    P.special_porsche();















	}

}
