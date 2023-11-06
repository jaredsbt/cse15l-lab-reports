# Lab Report 3

## Part 1 - Bugs

1) 
` static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      // int tempFront = arr[i];
      // arr[i] = arr[arr.length - i - 1];
      // arr[arr.length - i - 1] = tempFront;
      arr[i] = arr[arr.length - i - 1];
    }
  }
  @Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 , 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1, 2, 3 }, input1);
	}`
Output: `testReverseInPlace(ArrayTests)
arrays first differed at element [2]; expected:<3> but was:<1>`
2) `@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}`
3) ![Output](images/OutputLab3.png)
4) Before: `static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }`
After: `  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int tempFront = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = tempFront;
    }
  }`
