# Exasol Database Fundamentals for Java

<!-- img alt="db-fundamentals-java logo" src="doc/images/db-fundamentals-java_128x128.png" style="float:left; padding:0px 10px 10px 10px;"/ -->

[![Build Status](https://api.travis-ci.com/exasol/db-fundamentals-java.svg?branch=master)](https://travis-ci.org/exasol/db-fundamentals-java)

SonarCloud results:

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)

[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=security_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=sqale_index)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=code_smells)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=coverage)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Adb-fundamentals-java&metric=ncloc)](https://sonarcloud.io/dashboard?id=com.exasol%3Adb-fundamentals-java)

Base objects and ground rules for the Exasol database.

## Features

* Base objects (e.g. Identifiers)

## Table of Contents

### In a Nutshell

```java
final Identifier id = ExasolIdentifier.of("THE_SCHEMA"); // validates on construction
System.out.println("Schema name: " + id + ", quoted: " + id.quote());
```

### Information for Users

* [User Guide](doc/user_guide/user_guide.md)

### Run Time Dependencies

Running the Virtual Schema requires a Java Runtime version 11 or later.

### Test Dependencies

| Dependency                                                                          | Purpose                                                | License                       |
|-------------------------------------------------------------------------------------|--------------------------------------------------------|-------------------------------|
| [Java Hamcrest](http://hamcrest.org/JavaHamcrest/)                                  | Checking for conditions in code via matchers           | BSD License                   |
| [JUnit](https://junit.org/junit5)                                                   | Unit testing framework                                 | Eclipse Public License 1.0    |
| [Mockito](http://site.mockito.org/)                                                 | Mocking framework                                      | MIT License                   |
| [Equals Verifier](https://jqno.nl/equalsverifier/)                                  | Validate contract of `equals()` and `hashCode()`       | Apache License 2.0            |

### Build Dependencies

| Dependency                                                                          | Purpose                                                | License                       |
|-------------------------------------------------------------------------------------|--------------------------------------------------------|-------------------------------|
| [Apache Maven](https://maven.apache.org/)                                           | Build tool                                             | Apache License 2.0            |
| [Maven Compiler Plugin](https://maven.apache.org/plugins/maven-compiler-plugin/)    | Setting required Java version                          | Apache License 2.0            |
| [Maven GPG Plugin](http://maven.apache.org/plugins/maven-gpg-plugin/)               | Code signing                                           | Apache License 2.0            |
| [Maven Failsafe Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)   | Integration testing                                    | Apache License 2.0            |
| [Maven Jacoco Plugin](https://www.eclemma.org/jacoco/trunk/doc/maven.html)          | Code coverage metering                                 | Eclipse Public License 2.0    |
| [Maven Source Plugin](https://maven.apache.org/plugins/maven-source-plugin/)        | Creating a source code JAR                             | Apache License 2.0            |
| [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)   | Unit testing                                           | Apache License 2.0            |
