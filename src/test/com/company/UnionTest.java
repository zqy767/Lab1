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
//TODO: Test goes here...
    Union u = new Union();
    u.turn_string_to_list("a+b");
    Assert.assertEquals("1*a+1*b" ,u.list_to_string());
    u.ans.clear();

    u.turn_string_to_list("a^2+ab^2");
    Assert.assertEquals("1*a^2+1*ab^2" ,u.list_to_string());
    u.ans.clear();

    u.turn_string_to_list("3ac^2+2*ab^2");
    Assert.assertEquals("3*a*c^2+2*ab^2" ,u.list_to_string());
    u.ans.clear();

    u.turn_string_to_list("(2x+y)^2");
    Assert.assertEquals("1*(2x+y)^2" ,u.list_to_string());
    u.ans.clear();

    try {
        u.turn_string_to_list("(2+xy))");
    }
        catch (Exception e){}
    Assert.assertEquals("0" ,u.list_to_string());
    u.ans.clear();
    try {
    u.turn_string_to_list("(2+3^x)");
    }
    catch (Exception e){}
    Assert.assertEquals("0" ,u.list_to_string());
    u.ans.clear();
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
//TODO: Test goes here... 
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
