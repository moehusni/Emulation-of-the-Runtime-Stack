public abstract class MainBST {
	public static void main(String argv[]) {
		// argv[0]: output file

		Output.setOutput(argv[0]);

		// contructing BST<PC>.
		BST<PC> pcs = new EmptyBST<PC>();
		
		Smartphone smartPhone1 = new Smartphone("s001");
		Laptop laptop1 = new Laptop("l001");
		Desktop desktop1 = new Desktop("d001");
		
		Smartphone smartPhone2 = new Smartphone("s002");
		Laptop laptop2 = new Laptop("l002");
		Desktop desktop2 = new Desktop("d002");
		
		Smartphone smartPhone3 = new Smartphone("s003");
		Laptop laptop3 = new Laptop("l003");
		Desktop desktop3 = new Desktop("d003");
		
		Smartphone smartPhone4 = new Smartphone("s004");
		Laptop laptop4 = new Laptop("l004");
		Desktop desktop4 = new Desktop("d004");
		
		 pcs = insert(smartPhone1, pcs);
		 pcs = insert(laptop1, pcs);
		 pcs = insert(desktop1, pcs);
		
		 pcs = insert(smartPhone2, pcs);
		 pcs = insert(laptop2, pcs);
		 pcs = insert(desktop2, pcs);
		
		 pcs = insert(smartPhone3, pcs);
		 pcs = insert(laptop3, pcs);
		 pcs = insert(desktop3, pcs);
		
		 pcs = insert(smartPhone4, pcs);
		 pcs = insert(laptop4, pcs);
		 pcs = insert(desktop4, pcs);

		 search("s004", pcs);
		 search("l004", pcs);
		 search("d004", pcs);
		
		 pcs = delete("s001", pcs);
		 pcs = delete("l001", pcs);
		 pcs = delete("d001", pcs);

		Output.closeOutput();
	}

	private static BST<PC> delete(String ID, BST<PC> pcs)
	
	// helping function Not a part of Runtime Stack.
	
	{
		
		ARdelete<PC> newARdelete = new ARdelete<PC>();
		newARdelete.target = pcs;
		newARdelete.ID = ID;
		RuntimeStack.push(newARdelete);
		newARdelete.delete();
		RuntimeStack.pop();
		return newARdelete.returnVal;
	}

	private static void search(String string, BST<PC> pcs) 
	
	// helping function Not a part of Runtime Stack.
	
	{
		ARsearch<PC> newARsearch = new ARsearch<PC>();
		newARsearch.target = pcs;
		newARsearch.ID = string;
		RuntimeStack.push(newARsearch);
		newARsearch.search();
		RuntimeStack.pop();
	}

	private static BST<PC> insert(PC pc, BST<PC> pcs) 
	
	// helpping function Not a part of Runtime Stack.
	
	{
		ARinsert<PC> newARinsert = new ARinsert<PC>();
		newARinsert.target = pcs;
		newARinsert.c = pc;
		RuntimeStack.push(newARinsert);
		newARinsert.insert();
		RuntimeStack.pop();
		return newARinsert.returnVal;
	}
}
