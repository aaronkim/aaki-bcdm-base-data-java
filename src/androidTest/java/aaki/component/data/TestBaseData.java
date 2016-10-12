package aaki.component.data;

import aaki.component.data.type.Key;
import aaki.component.data.type.Value;

/**
 * Created by skkim on 10/11/16.
 */
public class TestBaseData {

	void testDataType() {
//		TypeObject<Integer> typeObject = new TypeObject<>(1);
//		typeObject.get();
//
//		TypeString typeString = new TypeString("");
//		typeString.getData();

	}

	void testData() {
		Data data1 = new Data(new Key("test"), new Value<Integer>(1));
		Data data2 = new Data(new Key("test2"), new Value<Integer>(1));

	}
}
