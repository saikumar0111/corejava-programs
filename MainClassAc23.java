
/*Ac pre-Condition:
*Ac brand name can be lg(or)samsung(or)bluestar
*ac type can be split (or)centerlised(or)casettle
*ac temp can be from 160 degree cellus to 31 degree cellus
*/

class  Ac
{
		
    public   String brandName;
	 public   String AcType;
	 public  int Actemp;
	
	
	
	
	
	
	public  Ac(String brandName,String AcType,int Actemp)
	{
		this.brandName=brandName;
		this.AcType=AcType;
		this.Actemp=Actemp;


		
	}
	
	public void AcDeatils()
	{
		System.out.println("ac deatils BrandName is "+brandName+" Ac type is"+AcType+" Ac temp is"+Actemp);
	}
	public void Caltemp()
	{
		final int a=(9/5*Actemp)+32;
	
		System.out.println("convert temp to paranite is: "+a);
	
	}
	
	
	

	
	
}
class MainClassAc23
{

	public static void main(String[] args) 
	{
		
        Ac a1 =new Ac("lg","centralised",16);
		Ac a2 =new Ac("SamSung","castte",25);
		Ac a3 =new Ac("bluestar","split",31);
		
	    a1.AcDeatils();
		a2.AcDeatils();
		a3.AcDeatils();
		 a1.Caltemp();
		 a2.Caltemp();
		 a3.Caltemp();
		
		

		
		

		
		

		

	}

}









