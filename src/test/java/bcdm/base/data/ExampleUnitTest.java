package bcdm.base.data;

import org.junit.Assert;
import org.junit.Test;

import bcdm.base.data.value.ValueString;

//import static junit.framework.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
	public ExampleUnitTest() {
	}

	@Test
	public void addition_isCorrect() throws Exception {
		Assert.assertEquals(4, 2 + 2);
	}

	@Test
	public void data_create() throws Exception {

		Assert.assertEquals(true, true);
	}

	@Test
	public void testValueString () throws Exception {
		ValueString valueObject;
		String testString = "test";
		System.out.println("");

		valueObject = new ValueString("testValueString", ValueString.UNLIMITED_LENGTH, null);

		valueObject.set(testString);
		System.out.println("expected : " + testString + ", actual : " + valueObject.get());
		Assert.assertEquals(testString, valueObject.get());

		System.out.println("expected : " + ValueString.UNLIMITED_LENGTH + ", actual : " + valueObject.MAX_LENGTH());
		Assert.assertEquals(ValueString.UNLIMITED_LENGTH, valueObject.MAX_LENGTH());
	}
}