package pertemuan3;

public class StrukturList {
	node HEAD; 
	public void addTail(int data)
	{
	    node posNode = null, curNode = null;

	    node newNode = new node(data);
	    if (HEAD == null)
	    {
	        HEAD = newNode;
	    }
	    else
	    {
	        curNode = HEAD;
	        while (curNode != null)
	        {
	            posNode = curNode;
	            curNode = curNode.getNext();
	        }
	        posNode.setNext(newNode);
	    }
	}
	
	public void displayElement() {  
	    node curNode = HEAD;  
	    while (curNode != null) {  
	        System.out.print(curNode.getData() + " ");  
	        curNode = curNode.getNext();  
	    }  
	}  

	public void addHead(int data) {  
	    node newNode = new node(data);  
	    if (HEAD == null)  {  
	        HEAD = newNode;  
	    }  
	    else {  
	        newNode.setNext(HEAD);  
	        HEAD = newNode;  
	    }  
	}  

	
}
