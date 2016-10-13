package aaki.component.data;

import aaki.component.data.type.Name;
import aaki.component.data.type.Value;

/**
 * Created by skkim on 10/13/16.
 */
public class TestMain {
	public static void main(String[ ] args) {
		System.out.println();
		System.out.println("===================== Start =====================");

		testNewData();

		System.out.println("=====================  End  ====================");
	}

	private static void testNewData() {
		int lodId = 1;
		Data data1 = new Data(new Name("data1"), new Value());

		logData(data1, lodId++);

		data1.getValue().setData(1);
		logData(data1, lodId++);

		data1.getValue().setData("test1");
		logData(data1, lodId++);

		Data data2 = new Data(new Name("data2"), new Value(999999999));
		data1.setValue(data2.getValue());
		logData(data1, lodId++);


		Data data3 = new Data(new Name("data3"), new Value(Short.MIN_VALUE));
		data1.getValue().setData(data3.getValue().getData());
		logData(data1, lodId++);


		logData(data2, lodId++);

		logData(data3, lodId++);


		Data data4 = new Data(new Name("data4"), new Value(Long.MAX_VALUE));
		logData(data4, lodId++);


		Data data5 = new Data("data5", true);
		logData(data5, lodId++);

		Data data6 = new Data("data6", Integer.valueOf(12345));
		logData(data6, lodId++);

		Data data7 = new Data("data7", "Value....");
		logData(data7, lodId++);

		Data data8 = new Data("data8", Byte.valueOf((byte) 0x20));
		logData(data8, lodId++);

		Data data9 = new Data("data9", data5);
		logData(data9, lodId++);

	}

	private static void logData(Data _data, int id) {
		System.out.println();
		System.out.println("TEST" + id + "::getName() = " + _data.getName());
		System.out.println("TEST" + id + "::getDataType() = " + _data.getValue().getDataType());
		System.out.println("TEST" + id + "::getData() = " + _data.getValue().getData());
	}
}
