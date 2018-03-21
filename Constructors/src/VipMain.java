
public class VipMain
{

	public static void main(String[] args)
	{
		VipCustomer vc1 = new VipCustomer();
		
		System.out.println(vc1.get_creditLimit() + "; " + vc1.get_email() + "; " + vc1.get_name());
		
		VipCustomer vc2 = new VipCustomer("patch2", 20000);
		System.out.println(vc2.get_creditLimit() + "; " + vc2.get_email() + "; " + vc2.get_name());
		
		VipCustomer vc3 = new VipCustomer("patch3", 30000, "patch3@patch.com");
		System.out.println(vc3.get_creditLimit() + "; " + vc3.get_email() + "; " + vc3.get_name());
	}

}
