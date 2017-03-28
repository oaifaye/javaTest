package collection.binary_search_tree;

public class SearchEntity implements Comparable<SearchEntity>{

	SearchEntity(int i){
		this.i = i;
	}
	
	private int i ;
	
	@Override
	public int compareTo(SearchEntity o) {
		return i - o.i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

}
