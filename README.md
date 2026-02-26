# ArrayList Assertions with AssertJ

Educational Java project to practice **AssertJ** assertions for collections, maps, exceptions and Optional.

## Objective

- Write expressive and fluent assertions with AssertJ
- Verify ArrayList order, contents, duplicates and absence
- Test Map keys, exception throwing and Optional emptiness

## Exercises Covered

**Exercise 4 – ArrayList Assertions**
- Create an ArrayList with mixed object types
- Assert exact insertion order
- Assert elements exist in any order
- Assert an element appears exactly once
- Assert a non-added element is missing

**Exercise 5 – Map Assertions**
- Create a Map and verify it contains an added key

**Exercise 6 – Exception Assertion**
- Trigger ArrayIndexOutOfBoundsException
- Assert the exception is thrown under the right condition

**Exercise 7 – Optional Assertion**
- Create an empty Optional
- Assert it is empty

## Project Structure
```text
src/
├── main/java/
│   └── Animal.java
│   └── AnimalMap.java
│   └── App.java
│   └── Book.java
│   └── Phone.java
├── test/java/
│   └── ArrayMapTest.java   
│   └── ArrayListTest.java  
└── pom.xml (or build.gradle)          # with AssertJ & JUnit 5
```
## How to Run Tests

```bash
# Maven
mvn test

# Gradle
gradle test
```