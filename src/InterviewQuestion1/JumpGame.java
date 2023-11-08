package InterviewQuestion1;

 class JumpGame{

		 public boolean canJump(int[] nums) {
/*
		    // Initially the final position is the last index
		    int finalPosition = nums.length - 1;

		    // Start with the second last index
		    for (int idx = nums.length - 2; idx >= 0; idx--) {

		      // If you can reach the final position from this index
		      // update the final position flag
		      if (idx + nums[idx] >= finalPosition) {
		        finalPosition = idx;
		      }
		    }

		    // If we reach the first index, then we can
		    // make the jump possible
		    return finalPosition == 0;
		  }

		} */
			  
	//algorithm is greedy
			 
				        // Initialize a variable 'boundary' to keep track of the farthest index that can be reached.
				        int boundary = 0;

				        // Iterate through the array from left to right.
				        for (int i = 0; i <= boundary; i++) {
				            // Update 'boundary' to be the maximum of its current value and the farthest index
				            // that can be reached from the current position (i).
				            boundary = Math.max(boundary, i + nums[i]);

				            // If 'boundary' becomes greater than or equal to the last index of the array,
				            // it means we can reach the end of the array. In that case, return true.
				            if (boundary >= nums.length - 1)
				                return true;
				        }

				        // If the loop completes without returning true, it means we couldn't reach the end
				        // of the array, so we return false.
				        return false;
				    }
				}



			  
			  
			  
			  
			 