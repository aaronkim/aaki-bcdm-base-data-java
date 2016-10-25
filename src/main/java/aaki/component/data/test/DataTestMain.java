package aaki.component.data.test;

import aaki.component.data.type.Value;

/**
 * Created by skkim on 10/13/16.
 */
public class DataTestMain {
	public static void main(String[ ] args) {
		System.out.println();
		System.out.println("===================== Data Test Start =====================");

		System.out.println("--------------------- testNewData() Start ---------------------");
		testNewData();
		System.out.println("---------------------  testNewData() End  ---------------------");
		System.out.println();
		System.out.println("--------------------- testNullData() Start ---------------------");
		testNullData();
		System.out.println("---------------------  testNullData() End  ---------------------");

		System.out.println("=====================  Data Test End  ====================");
	}

	private static void testValue() {

	}

	private static void testNewData() {
		int lodId = 1;
		String name = "data1";
		Value data1 = new Value(name, (Integer) null);

		logData(data1, lodId++);

		data1.setData(1);
		logData(data1, lodId++);

		data1.setData("test1");
		logData(data1, lodId++);

		name = "data2";
		Value data2 = new Value(name,  999999999);

		data1.setValue(data2);
		logData(data1, lodId++);

		name = "data3";
		Value data3 = new Value("data3", Short.MIN_VALUE);
		data1.setData(data3.getData());
		logData(data1, lodId++);


		logData(data2, lodId++);

		logData(data3, lodId++);


		Value data4 = new Value("data4", Long.MAX_VALUE);
		logData(data4, lodId++);


		Value data5 =  new Value("data5", true);
		logData(data5, lodId++);


		Value data6 = new Value("data6",Integer.valueOf(12345));
		logData(data6, lodId++);

		Value data7 = new Value("data7", "Value....");
		logData(data7, lodId++);

		name = "data8";
		Value data8 = new Value(Byte.class, name, (byte) 0x77);
		logData(data8, lodId++);

		name = "data9";
		Value data9 = new Value(Value.class, name, data8);
		logData(data9, lodId++);

	}

	private static void testNullData() {
		int lodId = 1;

		Integer integer = null;
		String name = "data1";
		Value data1 = new Value(name, integer);

		logData(data1, lodId++);

		data1.setData((float)1);
		logData(data1, lodId++);

		data1.setData("test1");
		logData(data1, lodId++);

		name = "data2";
		Value data2 = new Value(Integer.class, name);
		logData(data2, lodId++);

		name = "data2";
		data1.setValue(data2);
		logData(data1, lodId++);



		Value data3 = new Value("data3", new String());
		logData(data3, lodId++);

		data1.setData(data3.getData());
		logData(data1, lodId++);

		logData(data2, lodId++);

		data3.setData(333);
		logData(data3, lodId++);

		Value data4 = new Value(new String(), Long.MAX_VALUE);
		logData(data4, lodId++);


		Boolean _boolean = null;
		Value data5 = new Value("data5", _boolean);
		logData(data5, lodId++);

		Value data6 = new Value("data6", (Boolean) null);
		logData(data6, lodId++);

		Value data7 = new Value(String.class, "data7", null);
		logData(data7, lodId++);
	}

//	private static void logData(Data _data, int id) {
//		System.out.println();
//		System.out.println("TEST(" + id + ")::getName() = " + _data.getName());
//		System.out.println("TEST(" + id + ")::getDataType() = " + _data.getValue().getDataType());
//		System.out.println("TEST(" + id + ")::getData() = " + _data.getValue().getData());
//	}

	private static void logData(Value _value, int id) {
		System.out.println();
		System.out.println("TEST(" + id + ")::getName() = " + _value.getName());
		System.out.println("TEST(" + id + ")::getDataType() = " + _value.getDataType());
		System.out.println("TEST(" + id + ")::getData() = " + _value.getData());
	}
}
