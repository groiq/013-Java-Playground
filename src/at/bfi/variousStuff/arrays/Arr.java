package at.bfi.variousStuff.arrays;

public class Arr {
	
	/**
	 * Prints the contents of an array.
	 * @param input - int[]
	 */
	public static void pprint(int[] input) {
		System.out.print("|");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "|");
		}
		System.out.println();
	}

	/**
	 * clones an array.
	 * @param input - an int[]
	 * @return copy - an int[], the copy of input
	 */
	public static int[] deepCopy(int[] input) {
		int[] copy = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			copy[i] = input[i];
		}
		
		return copy;
	}
	
	/**
	 * first attempt at sorting. This method tracks the new indices of elements in an extra array.
	 * Uses a lot of memory. (Creates two additional arrays with the length of input.)
	 * @param input - int[]
	 * @return result - int[], sorted version of input
	 */
	public static int[] sort01(int[] input) {
		int[] newIndices = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] >= input[j]) {
					newIndices[i] += 1;
				} else {
					newIndices[j] += 1;
				}
			}
		}
//		pprint(input);
//		pprint(newIndices);
		int[] result = new int[input.length];
		for (int i = 0; i < newIndices.length; i++) {
			int newIndex = newIndices[i];
			result[newIndex] = input[i];
		}
		
		return result;
	}
	
	
	/**
	 * Sort an array using the selectionSort algorithm.
	 * @param input - int[]
	 * @return input - int[], sorted version of input
	 */
	public static int[] selectionSort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
//				System.out.println("i: " + i + " : " + input[i] + ", j: " + j + " : " + input[j]);
				if (input[i] > input[j]) {
					input = swap(input,i,j);
				}
			}
		}
		return input;
	}
	
	/**
	 * Swaps two entries in an int[]. Returns the modified array.
	 * @param arr - int[]
	 * @param i1 - index of the first entry
	 * @param i2 - index of the second entry
	 * @return
	 */
	public static int[] swap(int[] arr, int i1, int i2) {
		arr[i1] += arr[i2];
		arr[i2] = arr[i1] - arr[i2];
		arr[i1] -= arr[i2];
		return arr;
	}
	
	/**
	 * Sorts an array by tracking the contents in a linked list.
	 * @param input - an int[]
	 * @return the sorted copy of input
	 */
	public static int[] sortWithLinkedList(int[] input) {
		IntNode firstNode = null;
		IntNode currNode;
		for (int i : input) {
			// fun: can you do that simpler, e.g. with a do-while-loop instead of the while??
			currNode = new IntNode(i);
			if (firstNode == null) {
				firstNode = currNode;
			} else {
				IntNode prevNode = firstNode;
				IntNode nextNode = prevNode.getNextNode();
				while (nextNode != null && nextNode.getValue() < currNode.getValue()) {
					prevNode = prevNode.getNextNode();
					nextNode = nextNode.getNextNode();
				}
				currNode.setNextNode(nextNode);
				prevNode.setNextNode(currNode);
			}
		}
		currNode = firstNode;
		for (int i = 0; i < input.length; i++) {
			input[i] = currNode.getValue();
			currNode = currNode.getNextNode();
		}
		return input;
	}

	/**
	 * Reverses an array.
	 * @param input - an int[]
	 * @return an int[] - input reversed
	 */
	public static int[] reverse(int[] input) {
		int i = 0;
		int j = input.length - 1;
		while (j > i) {
			input = swap(input, i, j);
			i++;
			j--;
		}
		return input;
	}
}



 class IntNode {
	private final int value;
	private IntNode nextNode;
	public IntNode(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public IntNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(IntNode nextNode) {
		this.nextNode = nextNode;
	}
}