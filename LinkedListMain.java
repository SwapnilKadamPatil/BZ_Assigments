package Day14_DataStructure;

public class LinkedListMain {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<>();
		list.add(70);
		list.add(30);
		list.add(56);
		list.display();
		System.out.println(list);
		
		list.append(56);
		list.append(30);
		list.append(70);
		list.display();
		
		list.append(56);
		list.append(30);
		list.append(70);
		list.display();
		System.out.println();
		
		list.append(56);
		list.append(30);
		list.append(70);
		list.display();
		System.out.println();
		System.out.println(list.pop());
		list.display();
		
		list.append(56);
		list.append(30);
		list.append(70);
		list.display();
		System.out.println();
		System.out.println(list.popLast());
		list.display();
		
		
	}

}
