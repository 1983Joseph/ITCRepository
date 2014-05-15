package insertion_sort;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestSort {
	int[] a={3,6,7,1,2,10,5};
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	   public void test_returncount() {


	      System.out.println("Test if pricePerMonth returns Euro...") ;
	    //  InsertionSort S = new InsertionSort() ;
	      assertTrue(InsertionSort.insertion_sort(a).length==7);
	      
	      // assertTrue((S.insertion_sort(a)).equals("1")) ;
	   }
	@Test

	   public void test_returnArray() {

  
int[] a1={1,2,3,5,6,7,10};

	      System.out.println("Test if pricePerMonth returns Euro...") ;
	    	      Assert.assertThat(InsertionSort.insertion_sort(a), (IsEqual.equalTo(a1)));
	      // assertTrue((S.insertion_sort(a)).equals("1")) ;
	   }
}
