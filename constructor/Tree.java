class Tree{
	String treename;
	String scientificname;
	int height;

	Tree ()
	{
	

	} //default constructor
	
	Tree(String tree,String sciname,int hgt) //parametarised constructor
	{
		treename=tree;
		scientificname=sciname;
		height=hgt;

	}
	
	void Photosynthesis()
	{
		System.out.println("converting co2 to o2");
	}
	void WoodWork()
	{
		System.out.println("woods to make some furniture");

	}
}