package bcdm.base.data.test;

import bcdm.base.data.type.DataType;
import bcdm.base.data.type.ValueBoolean;
import bcdm.base.data.type.ValueDouble;
import bcdm.base.data.type.ValueImplement;
import bcdm.base.data.type.ValueInteger;
import bcdm.base.data.type.ValueLong;
import bcdm.base.data.type.ValueString;

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

		logData(new ValueInteger(name, 777), lodId++);

		name = "data2";
		logData(new ValueInteger(name, (short)777), lodId++);

		name = "data3";
		logData(new ValueLong(new ValueInteger(name, 777)), lodId++);

		name = "data4";
		logData(new ValueString(name), lodId++);


	}

	private static void testNullData() {
		int lodId = 1;
		String name = "data1";

		logData(new ValueBoolean(name, null), lodId++);

		logData(new ValueInteger(name, (Integer) null), lodId++);
		logData(new ValueInteger(name, (Short) null), lodId++);


		logData(new ValueLong(name, (Long) null), lodId++);
		logData(new ValueLong(name, (Integer) null), lodId++);
		logData(new ValueLong(name, (Short) null), lodId++);

		logData(new ValueDouble(name, (Double)null), lodId++);
		logData(new ValueDouble(name, (Float) null), lodId++);

		logData(new ValueString(name, null), lodId++);
	}

	private static void logData(DataType _value, int id) {
		if(_value == null) return;
		System.out.println();
		System.out.println("TEST(" + id + ")::getName() = " + _value.getName());
		System.out.println("TEST(" + id + ")::getUUID() = " + _value.getUUID());
		System.out.println("TEST(" + id + ")::getDataType() = " + _value.getDataType());
		System.out.println("TEST(" + id + ")::getData() = " + _value.getData());
	}

	private static void logData(ValueImplement _value, int id) {
		System.out.println();
		System.out.println("TEST(" + id + ")::getName() = " + _value.getName());
		System.out.println("TEST(" + id + ")::getDataType() = " + _value.getDataType());
		System.out.println("TEST(" + id + ")::getData() = " + _value.getData());
	}
}
