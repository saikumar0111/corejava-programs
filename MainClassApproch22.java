/*Balloen pre_condition:
*gas type =helium
*balloen colour white (or) gold
*height is 5cm
*height is 7cm
*height is 12cm
*/

class Balloen
{
	public static final String gas="helium";
	public  final int height;
	public  final String colour;
	public Balloen(int height,String colour)
	{
		this.height=height;
		this.colour=colour;
	}
	public void balloenDetails()
	{
		System.out.println(" balloen gas is :"+gas+" height of balloen is :"+height+"  colour of balloen is :"+colour);
		
	}


}

class MainClassApproch22 
{
	public static void main(String[] args) 
	{
		Balloen b1=new Balloen(40,"Gold");
		Balloen b2=new Balloen(30,"BLACk");
		System.out.println("=====================================================================================");
        System.out.println("                                 BALLOEN                                             ");
		System.out.println("=====================================================================================");


		
		b1.balloenDetails();
		b2.balloenDetails();

		
		
		
		



		

		
	

		


	}
}
