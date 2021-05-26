import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

class One {

	public static void main(String[] args) {
		int first = 4;
		int second = 5;

		int temp = 0;

		// using third variable
		temp = first;
		first = second;
		second = temp;
		
		System.out.println("First case");
		System.out.println("first: " + first);
		System.out.println("second: " + second);
		
		System.out.println();

		// without using third variable
		first = first * second;
		second = first / second;
		first = first / second;

		System.out.println("Second case");
		System.out.println("first: " + first);
		System.out.println("second: " + second);

	}

}