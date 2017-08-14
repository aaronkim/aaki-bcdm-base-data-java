package bcdm.base.data.value;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by skkim on 6/7/17.
 */

public class UnitTestValue {

	@Test
	public void testValueObject () throws Exception {
		ValueObject valueObject;
		String testString = "test";
		int testInt = 999;

		System.out.println();
		valueObject = new ValueObject("testValueObject");

		valueObject.set(testInt);
		System.out.println("expected : " + testInt + ", actual : " + valueObject.get());
		Assert.assertEquals(testInt, valueObject.get());


		valueObject.set(testString);
		System.out.println("expected : " + testString + ", actual : " + valueObject.get());
		Assert.assertEquals(testString, valueObject.get());
	}

	@Test
	public void testValueString () throws Exception {
		ValueString valueObject;
		String testString = "test";
		System.out.println();

		valueObject = new ValueString("testValueString", ValueString.UNLIMITED_LENGTH, null);

		valueObject.set(testString);
		System.out.println("expected : " + testString + ", actual : " + valueObject.get());
		Assert.assertEquals(testString, valueObject.get());

		System.out.println("expected : " + ValueString.UNLIMITED_LENGTH + ", actual : " + valueObject.MAX_LENGTH());
		assertEquals(ValueString.UNLIMITED_LENGTH, valueObject.MAX_LENGTH());
	}

	@Test
	public void testValueNumbers () throws Exception {
		System.out.println();
	}
}
