import java.lang.reflect.Array;
import java.util.ArrayList;

public class Node {
	
	public String stationName;
	Node leftChild;
	Node rightchild;
	Node middleChild;
	
	public Node(String stationName, Node firstChild, Node secondChild, Node thirdChild)
	{
		this.stationName = stationName;
		this.leftChild = firstChild;
		this.middleChild = secondChild;
		this.rightchild = thirdChild;
	}
}

public ArrayList<node> getChildren(){
	ArrayList<javax.xml.soap.Node> childNodes = new ArrayList<>();
	if(this.leftChild != null)
	{
		childNodes.add(leftChild);
	}
	
}
