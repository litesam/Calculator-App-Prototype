package com.lite.android.calculatorapp.database;

public class CalculatorDbSchema {
    public static final class CalculatorTable {
        public static final String NAME = "calculations";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String LEFT_VALUE  = "left_value";
            public static final String RIGHT_VALUE  = "right_value";
            public static final String RESULT = "result";
        }
    }
}
