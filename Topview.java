package optimization;
import java.util.*;
import java.io.*;
public class Topview {
	class Node{
		Node left;
		Node right;
		int data;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	class Solution{
		static class Pair{
			Node node;
			int vd;
			Pair(Node node,int vd){
				this.node = node;
				this.vd = vd;
			}
		}
		public static void topview(Node root) {
			if(root == null) {
				return;
			}
			Map<Integer,Integer> map = new TreeMap<>();
			Queue<Pair> q = new LinkedList<Pair>();
			q.add(new Pair(root,0));
			while(!q.isEmpty()) {
				Pair it = q.remove();
				int vd = it.vd;
				Node temp = it.node;
				if(map.get(vd) == null)
					map.put(vd, temp.data);
				if(temp.left!=null) {
					q.add(new Pair(temp.left,vd-1));
				}
				if(temp.right!=null) {
					q.add(new Pair(temp.right,vd+1));
				}
			}
			for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
				System.out.println(entry.getValue());
			}
		}
		public static Node insert(Node root, int data) {
			if(root == null) {
				return new Node(data);
			}else {
				Node cur;
				if(data<=root.data) {
					cur = insert(root.left,data);
					root.left = cur;
				}else {
					cur = insert(root.right,data);
					root.right = cur;
				}
				return root;
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		}
	}

}
