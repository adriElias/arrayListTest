# ArrayList Assertions with AssertJ

Educational Java project to practice **AssertJ** assertions on an ArrayList containing different object types.

## Objective

- Create an `ArrayList` with mixed object types
- Write AssertJ assertions to verify:
    - Exact insertion order
    - Elements exist (regardless of order)
    - An element appears exactly once
    - A missing element is not present

## Statement Summary

1. Create several objects of different types (e.g. String, Integer, custom class)
2. Add them to an `ArrayList` in a specific order
3. Use AssertJ to:
    - Verify the list matches the exact insertion order
    - Verify all elements are present (any order)
    - Verify one element appears only once
    - Verify a non-added element is absent

## Project Structure
```text
src/
├── test/java/
│   └── ArrayListAssertionsTest.java   # all assertions
└── pom.xml (or build.gradle)          # with AssertJ & JUnit 5
```
## How to Run Tests

```bash
# Maven
mvn test

# Gradle
gradle test
``