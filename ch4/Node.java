package ch4;

public class Node {
	 private Node adj[];
	 public int adjCnt;
	 private String vert;
	 public Solution01.State state;
	 public Node(String vert, int adjLen){
		 this.vert = vert;
		 adjCnt = 0;
		 adj = new Node[adjLen];
		 
	 }
	 
	 public void createAdj(Node s){
		 if(adjCnt < 30){
			 this.adj[adjCnt] = s;
			 adjCnt++;
		 }else {
			System.out.println("it's full");
		 }
	 }
	 
	 public Node[] getAdj(){
		 
		 return adj;
		 
		 
	 }
	 public String getVert(){
		 
		 return vert;
		 
	 }
	
}
