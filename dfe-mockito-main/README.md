- Complete the unit tests for the Calculator class in the file "CalculatorUnitTestMockito.java"
- Ensure when you run "Coverage as -> Junit Test" you aren't getting line coverage in your Adder, Subtractor, Multiplier & Divider dependencies.

-------------------

- Write a test suite, using Junit & Mockito, for all 4 methods in the "Menu.java" class in the "personexercise" package.
- Ensure you don't have any coverage of the PersonCreator dependency (it should be mocked!)
- Coverage of Person.java is expected, and allowed due to it being a POJO (Plain Old Java Object)

----------------------------
Stretch goal: 
- Using the calcscanner package, unit test the CalcMenu.java class
- Write tests that cover different paths through the menu() method.
- HINT: Mock the input dependency and control its output with Mocktio.when()
- HINT#2: You can mock multiple calls to the same method like so: Mockito.when( method-call ).thenReturn( value1, value2... etc);