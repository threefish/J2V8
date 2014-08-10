package com.eclipsesource.v8.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ V8ObjectTest.class, V8Tests.class, V8ArrayTests.class, V8JSFunctionCallTest.class })
public class AllTests {

}