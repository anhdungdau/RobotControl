
 class RobotControl
 {
   private Robot r;
   public RobotControl(Robot r)
   {
       this.r = r;
   }
   public void control(int barHeights[], int blockHeights[], int required[], boolean ordered)
   {  
		   int h = 2;         		//Line 11 - 17: Declaring variables for general assignment
		   int w = 1;         		//Variables will be specifically declared based on particular requirements of each part
		   int d = 0; 
		   int sourceHeights;
		   int sourceCol;
		   int MaxbarHeights;
//		   Declare additional variables for part C
		   int targetHeights;
		   int tempHeights;
		   int MaxH;
		   int x;

//--------------------------------------------------------------------------------------------------------------------------
//PART A:
//--------------------------------------------------------------------------------------------------------------------------	
//	sourceHeights = 8;
//	sourceCol = 10;
//	block = 2;
//	for (int i = 0; i <= 3; i++)		//Line 26 & 27: Using for loop to pick 4 blocks
//	{
//		if (sourceHeights == 8)			//Line 28 - 51: Raising the first arm to appropriate position
//		{
//			while (h < 9)	
//			{
//				r.up();							 
//				h++;
//			}
//		}
//		if (sourceHeights == 6 || sourceHeights == 2)
//		{
//			while (h < 7)
//			{
//				r.up();
//				h++;
//			}
//		}
//		else
//		{
//			while (h < 5)
//			{
//				r.up();
//				h++;
//			}
//		}
//		while (w < sourceCol)			//Line 52 - 56: Increase the same width of the second arm in 4 times moving
//		{
//			r.extend();						
//			w++;
//		}
//		if (sourceHeights == 8)			//Line 57 - 78: Adjusting the third arm to pick blocks
//		{
//			r.pick();
//		}
//		if (sourceHeights == 6)			
//		{
//			r.pick();
//		}
//		if (sourceHeights == 4 || sourceHeights == 2)			//use nested if & while to pick the other blocks
//		{
//			while (d < (h - 1 - sourceHeights)) 				// h = 5; sourceHeights = 4; d = 2
//			{													// h = 7; sourceHeights = 2; d = 4
//				r.lower();
//				d++;
//			}
//			r.pick();
//			while (d > 0)
//			{
//				r.raise();
//				d--;
//			}
//		}										
//		if (sourceHeights == 4)		//Line 79 - 94: Ensuring the robot arms do not hit an obstacle or go beyond the limit
//		{	
//			while (h < 7)
//			{
//				r.up();
//				h++;
//			}
//		}
//		if (sourceHeights == 2)
//		{	
//			while (h < 9)
//			{
//				r.up();
//				h++;
//			}
//		}
//		while (w > 1)				//Line 95 - 99: Returning the second arm to the initial position
//		{
//			r.contract();					
//			w--;
//		}
//		if (sourceHeights == 8)				//Line 100 - 121: Using 4 two-way if-else to drop all blocks
//		{
//			while (h > 3)		
//			{
//				r.down();
//				h--;
//			}
//			r.drop();
//		}
//		if (sourceHeights == 6)
//		{
//			while (h > 5)		
//			{
//				r.down();
//				h--;
//			}
//			r.drop();
//		}
//		if (sourceHeights == 4 || sourceHeights == 2)			
//		{
//			r.drop();		
//		}
//		sourceHeights -= 2;					//The height of block must reduce 2 unit (length of a block) after each moving
//	}										//to continue examine the condition of loop
//  }
//}
 
//--------------------------------------------------------------------------------------------------------------------------  
//Part B requires you to access the array barHeights passed as argument as the robot arm must move over the bars
//--------------------------------------------------------------------------------------------------------------------------
//
//	sourceHeights = 8;
//	MaxbarHeights = 0;
//	sourceCol = 10;
//	block = 2;
//	for (int j = 0; j <= 5; j++)				//Use for loop to find the maximum value of bar
//	{
//		if (MaxbarHeights <= barHeights[j])
//		{
//			MaxbarHeights = barHeights[j];
//		}
//	}
//	for (int k = 0; k <= 3; k++)				//Use for loop 4 times to pick 4 blocks		
//	{
//		if (sourceHeights >= MaxbarHeights)		//Line 138-164: Use nested if make sure the first arm increase efficiently
//		{										//just over the highest bar or source
//			if (sourceHeights != 2)
//			{
//				while (h < sourceHeights + 1)
//				{
//					r.up();
//					h++;
//				}	
//			}
//			else if (sourceHeights == 2)
//			{
//				while (h < 8 - sourceHeights + 1)
//				{
//					r.up();
//					h++;
//				}
//			}
//		}
//		else
//		{
//			while (h < MaxbarHeights + 1)
//			{
//				r.up();
//				h++;
//			}
//		}
//		while (w < sourceCol)					//Same length of the second arm in 4 times picking
//		{
//			r.extend();						
//			w++;
//		}
//		while (d < (h - 1 - sourceHeights)) 	//Line 170-180: the third arm will lower & raise the same
//		{										
//			r.lower();
//			d++;
//		}
//		r.pick();
//		while (d > 0)
//		{
//			r.raise();
//			d--;
//		}
//		if (MaxbarHeights == 1 || MaxbarHeights == 2 || MaxbarHeights == 3 || MaxbarHeights == 4)
//		{										//Line 181-253 explain the height of first arm must over the highest
//			if (sourceHeights == 4)				//value of MaxbarHeights or sourceHeights
//			{
//				while (h < 7)
//				{
//					r.up();
//					h++;
//				}
//			}
//			if (sourceHeights == 2)
//			{	
//				while (h < 9)
//				{
//					r.up();
//					h++;
//				}
//			}
//		}
//		if (MaxbarHeights == 5)
//		{
//			if (sourceHeights == 6)
//			{
//				while (h < 8)
//				{
//					r.up();
//					h++;
//				}
//			}
//			if (sourceHeights == 4)
//			{
//				while (h < 8)
//				{
//					r.up();
//					h++;
//				}
//			}
//			if (sourceHeights == 2)
//			{	
//				while (h < 9)
//				{
//					r.up();
//					h++;
//				}
//			}
//		}
//		if (MaxbarHeights == 6)
//		{
//			if (sourceHeights != 8)
//			{
//				while (h < 9)
//				{
//					r.up();
//					h++;
//				}
//			}	
//		}
//		if (MaxbarHeights == 7)
//		{
//			while (h < 10)
//			{
//				r.up();
//				h++;
//			}
//		}
//		if (MaxbarHeights == 8)
//		{
//			while (h < 11)
//			{
//				r.up();
//				h++;
//			}
//		}
//		while (w > 1)						//Contracting the second arm to the initial position w = 1
//		{
//			r.contract();					
//			w--;
//		}
//		if (sourceHeights == 8)				//Lower the first arm to designated height
//		{
//			while (h > 3)			
//			{
//				r.down();
//				h--;
//			}
//			r.drop();
//		}
//		if (sourceHeights == 6)
//		{
//			while (h > 5)		
//			{
//				r.down();
//				h--;
//			}
//			r.drop();
//		}
//		if (sourceHeights == 4)
//		{
//			while (h > 7)		
//			{
//				r.down();
//				h--;
//			}
//			r.drop();
//		}
//		else if (sourceHeights == 2)			
//		{
//			while (h > 9)	
//			{
//				r.down();
//				h--;
//			}
//			r.drop();		
//		}
//		sourceHeights -= 2;					//The sourceHeight must reduce 2 unit after dropping a block to continue loop
//	}										//(length of a block) after each moving
// }
//}
		   
//--------------------------------------------------------------------------------------------------------------------------
//Part C: requires you to access the arrays barHeights and blockHeights 
// 		  as the heights of bars and blocks are allowed to vary through command line arguments
//--------------------------------------------------------------------------------------------------------------------------
//		  
//	    sourceHeights = 0;
//		MaxbarHeights = 0;
//		sourceCol = 10;
//		targetHeights = 0;
//		MaxH = 0;
//		x = 1;	
//		
//	for (int i = 0; i < blockHeights.length; i++)	//for loop to determine the height of the target column
//	{
//		sourceHeights += blockHeights[i];		
//	}
//	for (int j = 0; j <= 5; j++)					//Use for loop to find the maximum value of bar
//	{
//		if (MaxbarHeights <= barHeights[j])
//		{
//			MaxbarHeights = barHeights[j];
//		}
//	}
//	for (int k = 1; k <= blockHeights.length; k++)						
//	{	
//		MaxH = Math.max(sourceHeights, Math.max(targetHeights, MaxbarHeights));
//		while (h < MaxH + 1)
//		{
//			r.up();
//			h++;
//		}
//		while (w < sourceCol)
//		{
//			r.extend();
//			w++;
//		}
//		if (h == sourceHeights + 1)
//		{
//			r.pick();
//		}
//		else
//		{
//			while (d < (MaxH - sourceHeights)) 
//			{										
//				r.lower();
//				d++;
//			}
//			r.pick();
//			while (d > 0)
//			{
//				r.raise();
//				d--;
//			}
//		}
//		if (MaxbarHeights < 5)
//		{
//			while (h < targetHeights + 1 + blockHeights[blockHeights.length - x])
//			{
//				r.up();
//				h++;
//			}
//		}
//		else
//		{
//			if (h <= MaxbarHeights + blockHeights[blockHeights.length - x] && MaxbarHeights >= targetHeights)
//			{
//				while (h < MaxbarHeights + 1 + blockHeights[blockHeights.length - x])
//				{
//					r.up();
//					h++;
//				}
//			}
//			else
//			{
//				while (h < targetHeights + 1 + blockHeights[blockHeights.length - x])
//				{
//					r.up();
//					h++;
//				}
//			}	
//		}
//		while (w > 1)
//		{
//			r.contract();
//			w--;
//		}
//		while (h > targetHeights + blockHeights[blockHeights.length - x] + w)
//		{
//			r.down();
//			h--;
//		}
//		r.drop();
//		
//		sourceHeights -= blockHeights[blockHeights.length - x];
//		targetHeights += blockHeights[blockHeights.length - x];
//		x += 1;
//	}
//  }
//}
 
//--------------------------------------------------------------------------------------------------------------------------
// Part D: The fourth part allows the user to specify the order in which bars must be placed in the target column. 
// 		   This will require you to use the use additional column which can hold temporary values
//-------------------------------------------------------------------------------------------------------------------------- 
		    
		    sourceHeights = 0;
			MaxbarHeights = 0;
			sourceCol = 10;
			tempHeights = 0;
		//	int tempCol = 9;
			MaxH = 0;
		//	x = 1;	
			
for (int i = 0; i < blockHeights.length; i++)	//for loop to determine the height of the target column
{
	sourceHeights += blockHeights[i];		
}
for (int j = 0; j <= 5; j++)					//Use for loop to find the maximum value of bar
{
	if (MaxbarHeights <= barHeights[j])
	{
		MaxbarHeights = barHeights[j];
	}
}
//for (int k = 1; k <= blockHeights.length; k++)						
//{	
	MaxH = Math.max(sourceHeights, Math.max(required.length, MaxbarHeights));
	while (h < MaxH + 1)
	{
		r.up();
		h++;
	}  
	while (w < sourceCol)
	{
		r.extend();
		w++;
	}
	if (blockHeights[blockHeights.length - 1] != required [0])
	{
		if (h == sourceHeights + 1)
		{
			r.pick();
		}
//		else
//			{
//			while (d < (MaxH - sourceHeights)) 
//			{										
//				r.lower();
//				d++;
//			}
//			r.pick();
//			while (d > 0)
//			{
//				r.raise();
//				d--;
//			}
//		w--;
	}
	w--;
	while (d < sourceHeights - blockHeights[blockHeights.length - 1])
	{
		r.lower();
		d++;
	}
	r.drop();
	while (d > 0)
	{
		r.raise();
		d--;
	}
	tempHeights += blockHeights[blockHeights.length - 1];
	
		
		
		   
		   
		   
		   
		   
		   
		   
   }
 }
//-------------------------------------------------------------------------------------------------------------------------- 
// Part E: requires you to write the code to move from source column to target column using
// 		   an additional temporary column but without placing a larger block on top of a smaller block 
//--------------------------------------------------------------------------------------------------------------------------