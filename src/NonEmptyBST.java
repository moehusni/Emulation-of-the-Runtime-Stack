class NonEmptyBST<C extends Data> extends BST<C>

// The class of nonempty binary search trees containing C objects.

{
	C data; // the C object at the root
	BST<C> left;  // left subtree
	BST<C> right; // right subtree

	NonEmptyBST(C c, BST<C> l, BST<C> r)
	{
		data = c;
		left = l;
		right = r;
	}

	public String toString()
	{
		return "[" + data + ", " + left + ", " + right + "]";
	}
}
