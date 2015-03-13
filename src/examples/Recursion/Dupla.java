package examples.Recursion;

import com.sun.istack.internal.NotNull;

public class Dupla {
  @NotNull
 Integer int1;
 @NotNull
 Integer int2;



 public Dupla(Integer int1, Integer int2) {
	super();
       this.int1 = int1;
       this.int2 = int2;

	}

    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    public Integer getInt2() {
        return int2;
    }

    public void setInt2(Integer int2) {
        this.int2 = int2;
    }

}

