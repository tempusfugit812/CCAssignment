package ch4;

public class Graph {

	private Node verts[];
	public int cnt;
	public Graph(){
		verts = new Node[6];
		cnt = 0;
		
		
		
	}
	
	public void addNode(Node s){
		
		if(cnt < 30){
			verts[cnt] = s;
			cnt++;
		}else{
			System.out.println("it's full");
		}
		
	}
	
	public Node[] getNodes(){
		return verts;
	}

}
