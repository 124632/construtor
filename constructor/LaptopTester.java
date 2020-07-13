class LaptopTester{
	public static void main(String[] args){
		System.out.println("main method started..");

		Laptop lp=new Laptop("lenovo","L840",35000,500);
		System.out.println(lp);
		System.out.println(lp.brand+"\n"+lp.model+"\n"+lp.price+"\n"+lp.hdd);
		lp.SoftwareDevelopment();
		lp.accessInternet();
		
		System.out.println("main method ended..");

	}
}