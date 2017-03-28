package collection.binary_search_tree;


/**
 * 二叉树查找
 * @author Administrator
 *
 */
public class BinarySearchTree<T extends Comparable<? super T>> {
	
	private static class BinaryNode<T>{
		private T value;
		private BinaryNode<T> left;
		private BinaryNode<T> right;
		BinaryNode(T t ,BinaryNode<T> left,BinaryNode<T> right){
			this.value = t;
			this.left = left;
			this.right = right;
		}
	}
	
	private BinaryNode<T> root = null;
	
	public void insert(T t){
		insert(t, root);
	}
	
	private void insert(T t,BinaryNode<T> oldB){
		if(root == null){
			root = new BinaryNode<T>(t,null,null);
		}else{
			//老节点比这个数大，继续拿老节点左边的数跟这个数比
			if(oldB.value.compareTo(t) > 0){
				//老节点左边没数，把这个数放在他左边
				if(oldB.left == null){
					BinaryNode<T> newB = new BinaryNode<T>(t,null,null);
					oldB.left = newB;
				}else{
					insert(t,oldB.left);
				}
			}
			//老节点比这个数小，继续拿老节点又边的数跟这个数比
			else if(oldB.value.compareTo(t) < 0){
				//老节点右边没数，把这个数放在他右边
				if(oldB.right == null){
					BinaryNode<T> newB = new BinaryNode<T>(t,null,null);
					oldB.right = newB;
				}else{
					insert(t,oldB.right);
				}
			}
		}
	}
	
	public boolean contains(T t){
		return contains(t,root);
		
	}
	
	private boolean contains(T t,BinaryNode<T> oldB){
		if(oldB == null){
			return false;
		}
		if(oldB.value.compareTo(t) == 0){
			return true;
		}else if(oldB.value.compareTo(t) > 0){
			return contains(t, oldB.left);
		}else{
			return contains(t, oldB.right);
		}
		
	}
	
	public static void main(String[] args) {
		BinarySearchTree<SearchEntity> binarySearchTree = new BinarySearchTree<SearchEntity>();
		for (int i = 0; i < 100; i++) {
			SearchEntity s = new SearchEntity(i);
			binarySearchTree.insert(s);
		}
		
		SearchEntity s = new SearchEntity(5000);
		System.out.println(binarySearchTree.contains(s));
	}
	
}
