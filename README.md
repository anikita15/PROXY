# PROXY
Java Proxy Implementation
# Java Proxy Pattern Example

This project demonstrates the **Proxy Design Pattern** in Java using a simple example involving a `Person` interface, a `Man` class that implements the interface, and a `ProxyPerson` class that controls access to the real subject (`Man`).

## 📘 About

The **Proxy Pattern** provides a surrogate or placeholder for another object to control access to it. It is useful when you want to add an additional layer of control, such as access control, lazy initialization, logging, etc.

### Components:
- **Person (Interface)**: Defines the operations that can be performed.
- **Man (Real Subject)**: Implements the `Person` interface and provides core functionality.
- **ProxyPerson (Proxy)**: Implements the `Person` interface and adds a layer of control before delegating calls to `Man`.

## 💡 Use Case

This example shows how a proxy can be used to restrict or log access to the real object, `Man`. This is helpful in scenarios like:

- Authorization checks
- Remote method invocation
- Lazy object loading
- Accessing expensive resources conditionally

## 🧾 Structure

.
├── Person.java // Interface
├── Man.java // Real subject


## 🚀 How to Run

1. Clone this repository or copy the code files into your Java project.
2. Compile the files:
   ```bash
   javac *.java

## Output

Person invoked.

