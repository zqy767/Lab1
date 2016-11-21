package test.com.company; 

import com.company.Union;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

/** 
* Union Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 20, 2016</pre> 
* @version 1.0 
*/ 
public class UnionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: clone() 
* 
*/ 
@Test
public void testClone() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: turn_string_to_list(String string) 
* 
*/ 
@Test
public void testTurn_string_to_list() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: list_to_string() 
* 
*/ 
@Test
public void testList_to_string() throws Exception {
}

/** 
* 
* Method: simply(ArrayList<Var> vars) 
* 
*/ 
@Test
public void testSimply() throws Exception { 
//TODO: Test goes here...


} 

/** 
* 
* Method: derivative(String sym) 
* 
*/ 
@Test
public void testDerivative() throws Exception {
    Union u = new Union();
    u.turn_string_to_list("2x+3*y");
    Assert.assertEquals("0" ,u.derivative("z"));
    u.ans.clear();

    u.turn_string_to_list("x+0*abc");
    Assert.assertEquals("0" ,u.derivative("abc"));
    u.ans.clear();

    u.turn_string_to_list("x+2y");
    Assert.assertEquals("2" ,u.derivative("y"));
    u.ans.clear();

    u.turn_string_to_list("0*(x+2y)^2");
    Assert.assertEquals("0" ,u.derivative("y"));
    u.ans.clear();

    u.turn_string_to_list("(x+2y)^2");
    Assert.assertEquals("4*(x+2y)" ,u.derivative("y"));
    u.ans.clear();
} 


/** 
* 
* Method: n_string(String s, int n) 
* 
*/ 
@Test
public void testN_string() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("n_string", String.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: first_string(String s) 
* 
*/ 
@Test
public void testFirst_string() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("first_string", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: split_morpheme(String string) 
* 
*/ 
@Test
public void testSplit_morpheme() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("split_morpheme", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: equals(Poly p) 
* 
*/ 
@Test
public void testEquals() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("equals", Poly.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: merge_same_item(Poly tmp) 
* 
*/ 
@Test
public void testMerge_same_item() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("merge_same_item", Poly.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: symbol_to_number(Poly p, ArrayList<Var> vars) 
* 
*/ 
@Test
public void testSymbol_to_number() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("symbol_to_number", Poly.class, ArrayList<Var>.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: power_1_ot_not(Poly p, Item it) 
* 
*/ 
@Test
public void testPower_1_ot_not() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("power_1_ot_not", Poly.class, Item.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: derivative_single(Poly p, Item it, String sym) 
* 
*/ 
@Test
public void testDerivative_single() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("derivative_single", Poly.class, Item.class, String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: derivative_to_poly(Poly p, String sym) 
* 
*/ 
@Test
public void testDerivative_to_poly() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Union.getClass().getMethod("derivative_to_poly", Poly.class, String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
