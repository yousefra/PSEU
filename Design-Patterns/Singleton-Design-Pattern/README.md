# Singleton Design Pattern

This is a simple example of implement Singleton design pattern in Java

I used Lazy Instantiation type, which creates a singleton object when getInstance() method first called, but this method is not thread safe. In larger programs I would make it thread safe by making the getInstance() method synchronized, or by using Eager Instantiation, which creates the singleton object when the class loaded.
