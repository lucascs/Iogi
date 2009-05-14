package iogi.conversion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import iogi.conversion.DoubleConverter;
import iogi.conversion.IntegerConverter;
import iogi.conversion.TypeConverter;

import org.junit.Test;

public class TypeConvertersTests {
	@Test
	public void doubleConverterForPrimitive() throws Exception {
		TypeConverter<Double> converter = new DoubleConverter(); 
		assertTrue(converter.isAbleToConvertTo(double.class));
		assertEquals(Double.valueOf(2.0), converter.convert("2.0", double.class));
	}
	
	@Test
	public void doubleConverterForObject() throws Exception {
		TypeConverter<Double> converter = new DoubleConverter(); 
		assertTrue(converter.isAbleToConvertTo(Double.class));
		assertEquals(new Double(2.0), converter.convert("2.0", Double.class));
	}
	
	@Test
	public void integerConverter() throws Exception {
		TypeConverter<Integer> converter = new IntegerConverter(); 
		assertTrue(converter.isAbleToConvertTo(Integer.class));
		assertEquals(Integer.valueOf(2), converter.convert("2", Integer.class));
	}
	
	
}
