package com.testing.test_gradle;

import spark.Spark;

public class TestGradle {
    public static void main(String[] args) {
        Spark.get("/hello", (req, res) -> "Hello World");
    }
}
