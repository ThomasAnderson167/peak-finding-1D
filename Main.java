//Class for testing 1D peak-finding algorithms
class Main {
	public static void main(String args[]) {
		int testArray[] = {1, 3, 4, 3, 5, 1};
		int peakIndex = -1;

		System.out.print("Tested array: ");
		for(int i = 0; i < testArray.length; i++)
			System.out.print(testArray[i] + " ");

		peakIndex = PeakFinder.findPeakStrfrwrd(testArray);
		System.out.println("\nPeak of the array using greedy algorithm is " + 
							(peakIndex >= 0 ? testArray[peakIndex] : "absent") + ".");

		peakIndex = PeakFinder.findPeakDividing(testArray);
		System.out.println("Peak of the array using divide & conquer algorithm is " + 
							(peakIndex >= 0 ? testArray[peakIndex] : "absent") + ".");
	}
}