class Solution {
      public int[] plusOne(int[] digits) {
        // traverse the array from the less to the most significant digit (right to left).
        boolean done = false;
        for (int i = digits.length - 1; i > -1; i--) {
            // if the current digit == 9 put zero at that position.
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            // if the current digit != 9 increment by one and break;
            else {
                digits[i] += 1;
                done = true;
                break;
            }
        }
        
        if (done) {
            return digits;
        }
		
        // in case digits was full of nines (e.g. 9, or 99)
        // return a new array with digits.length + 1 with a leading one (e.g. 100).
		else {
            int[] output = new int[digits.length + 1];
            output[0] = 1;
            return output;
        }
    }
}
