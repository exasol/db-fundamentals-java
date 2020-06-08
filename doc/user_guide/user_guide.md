# Exasol Database Fundamentals

This project contains a library that offers support for the most basic building blocks of the Exasol database, like [identifiers](https://intranet.srv.exasol.com/display/TOOLTIPS/Travis+CI+Invoices) and [keywords](). It also implements rules that the Exasol database follows &mdash; for example quoting. 

## Introduction

Each database product has a set of defining traits, some of which stem from the SQL standard, whereas others are database-specific. 

Identifiers for example are a case where sources apply. The Standard defines general limitations on identifiers, e.g. that an unquoted identifier cannot contain spaces. Additionally, Exasol adds rules what characters can an cannot be used in identifiers.

The main purpose of this library is to make sure that Java clients accessing Exasol don't need to individually implement the base objects and ground rules, but instead can rely on a ready-made API that makes sure, those things are handled correctly.

## Features

### Ensuring Identifier Validity

One of the most often used base object in any database is the identifier. Identifiers are names of database objects like schemas, tables, users and so on.

Since client code often contains variable identifiers, validity checking is important. To achieve that, replace all instances in your code where you handle object names as strings with identifier objects.

When you create an identifier, the factory methods automatically assert the validity of the name.

```java
final Identifier identifier = ExasolIdentifier.of("THE_TABLE");
```

If the name is valid, the factory method `of(String)` returns the corresponding identifier object. If not, it throws an assertion error.

`Identifier` implementations are immutable and final.

When consequently applying this procedure, you also eliminate the vector for SQL injection via identifiers.

In case you want to check if an existing string is a valid identifier without creating an identifier object, use the following method:

```java
final boolean valid = ExasolIdentifier.validate("ANOTHTER_TABLE");
```

### Identifiers as Strings

The `toString()` method is overloaded to provide the name of the identifier as a `String`. Note that at this point the identifier is already guaranteed to be valid.

To keep it that way, don't use any string manipulation on top of identifiers.

An even safer option is to get the quoted identifier as a string.

```java
final String quotedIdentifier = identifier.quote();
```