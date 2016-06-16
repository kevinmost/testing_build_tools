package com.testing.test_maven;

import spark.Spark;

public class TestMaven {
    public static void main(String[] args) {
        Spark.get("/hello", (req, res) -> "Hello World");
    }
}
