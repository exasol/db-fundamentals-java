# Exasol Database Fundamentals for Java

[![Build Status](https://github.com/exasol/db-fundamentals-java/actions/workflows/ci-build.yml/badge.svg)](https://github.com/exasol/db-fundamentals-java/actions/workflows/ci-build.yml)
[![Maven Central – Exasol Database fundamentals for Java](https://img.shields.io/maven-central/v/com.exasol/db-fundamentals-java)](https://search.maven.org/artifact/com.exasol/db-fundamentals-java)

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
* [Changelog](doc/changes/changelog.md)
* [Dependencies](dependencies.md)