package com.javabykiran;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Enabled {


@Test (enabled=false)     //(enabled=false)

public void Testone(){
	
	Assert.assertEquals(105, 105);
		
}

@Test(enabled=false)
public void Testsecond(){
	
	Assert.assertEquals(100, 100);

}

 

@Test(enabled=false)
public void Testthird(){
	
	Assert.assertEquals(100, 100);
	
}



@Test(enabled=false)
public void Testfourth(){
	
	Assert.assertEquals(100, 100);
}	

@Test(enabled=false)
public void Testfive(){
	
	Assert.assertEquals(100, 100);
	
}


@Test(enabled=false)
public void Testsix(){
	
	Assert.assertEquals(1090, 100);
	
}


@Test
public void Testseven(){
	
	Assert.assertEquals(1080, 100);
	
}


@Test
public void Testeight(){
	
	Assert.assertEquals(107, 100);
	
}
@Test
public void Testnine(){
	
	Assert.assertEquals(1004, 100);
	
}

@Test
public void Testten(){
	
	Assert.assertEquals(10, 100);
	
}





}	