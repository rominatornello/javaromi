package examples;

import com.sun.istack.internal.NotNull;

public class Triplet {

 @NotNull
 Integer int1;
 @NotNull
 Integer int2;
 @NotNull
 Integer int3;

 
 public Triplet(Integer int1, Integer int2, Integer int3) {
	super();
       this.int1 = int1;
       this.int2 = int2;
       this.int3 = int3;

	}
 	
 public boolean isSucesion(){
	 return this.int2-this.int1 == this.int3-this.int2;
 }



}

