package gitLab;

public class Practice {
	//meant to count up chocolate bars to a certain number, does not work
	public int makeChocolate(int small, int big, int goal) {
		  int attempt = 0;
		  int bigBar = 5;
		  int smallBar = 1;
		  int bigToUse = 0;
		  int smallToUse = 0;
		  
		  //while (attempt != goal){
		    attempt = 0;
		    bigToUse = 0;
		    smallToUse = 0;
		    while(attempt + 5 < goal - 5){
		      bigToUse++;
		      attempt+=bigBar;
		      if(attempt == goal - 5){
		        bigToUse++;
		        attempt=+5;
		      }
		    }
		    
		    while(attempt + 1 < goal - 1){
		      smallToUse++;
		      attempt+=smallBar;
		      if(attempt == goal - 1){
		        smallToUse++;
		        attempt=+1;
		      }
		    }
		  //}
		  return smallToUse;
		}

}
