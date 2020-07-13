class TreeTester{
	public static void main(String[] args){
	System.out.println("main method started..");

	System.out.println("Default constructor...");
	Tree tr=new Tree();
	System.out.println(tr);
	System.out.println(tr.treename+"\n"+tr.scientificname+"\n"+tr.height+"\n");


	System.out.println("parametarised constructor...");
	Tree tr1=new Tree("mangotree","mangiferaindica",100);
	System.out.println(tr1);
	System.out.println(tr1.treename+"\n"+tr1.scientificname+"\n"+tr1.height+"\n");

	System.out.println("-----------------");


	tr.Photosynthesis();
	tr.WoodWork();

	System.out.println("-----------------");

	tr1.Photosynthesis();
	tr1.WoodWork();
	
	System.out.println("main method ended..");
	} 
}