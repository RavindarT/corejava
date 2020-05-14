package test;

import java.util.ArrayList;
import java.util.List;

public class Testing {
public static void main(String[] args) {
	

int arr1[] = { 1, 3, 4, 5};
int arr2[] = {2, 4, 6, 8};
List list = new ArrayList();
for(int i = 0; i < arr1.length;i ++) {
	if(!list.contains(arr1[i])) {
	list.add(arr1[i]);
	}
	if(!list.contains(arr2[i])) {
		list.add(arr2[i]);
	}
}
Object[] a =  list.toArray();
System.out.println(list);
}
}
