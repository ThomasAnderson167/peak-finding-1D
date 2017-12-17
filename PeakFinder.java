//Class, which contains greedy and divide & conquer algorithms
//for finding A peak in 1D array
class PeakFinder {
	//Greedy algorithm
	public static int findPeakStrfrwrd(int targetArray[]) {
		if(targetArray[0] >= targetArray[1]) return 0;

		if(targetArray[targetArray.length - 2] <= targetArray[targetArray.length - 1]) return (targetArray.length - 1);

		for(int i = 1; i < targetArray.length - 1; i++)
			if(targetArray[i] >= targetArray[i - 1] && targetArray[i] >= targetArray[i + 1]) return i;

		return -1;
	}

	//Divide & conquer algorithm
	//Not realized yet
	public static int findPeakDividing(int targetArray[]) {
		return -1;
	}
}