# SKN Java Color Library

<img width="150px" src="https://firebasestorage.googleapis.com/v0/b/skn-ultimate-project-la437.appspot.com/o/GitHub%20Library%2F02-Spring%20Boot-SJC.svg?alt=media&token=7a8000ee-2708-4da8-9561-99f86e9cd8b9" alt="java" />

> Java

[![Maven Central](https://img.shields.io/maven-central/v/best.skn/skn-java-color)](https://central.sonatype.com/artifact/best.skn/skn-java-color) [![Javadoc](https://javadoc.io/badge2/best.skn/skn-java-color/1.4.0/javadoc.svg)](https://javadoc.io/doc/best.skn/skn-java-color/1.4.0) [![Apache License 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

&nbsp;

## **_JavaDocs:_**

### Read the Javadoc for the main API: [Color API](https://javadoc.io/doc/best.skn/skn-java-color/latest/best/skn/utils/color/Color.html)

&nbsp;

## **_Introduction:_**

### This is a simple Java Library for colored text output in console

### I made this library so that I can use it in all of my java projects without writing the same codes over and over again

### The main API Class of this library is `Color` which holds 16 static methods for 8 different colors

&nbsp;

## **_Details:_**

### **`Color` Class:**

- It doesn't need to be instantiated
- It has 16 static methods for 8 different colors
- The colors are:
  - Black
  - Red
  - Green
  - Yellow
  - Blue
  - Purple
  - Cyan
  - White

&nbsp;

## **_Use Case:_**

- Java
- Java Spring Boot

&nbsp;

## **_Requirements:_**

- 💀 Minimum Java Version: `21`

&nbsp;

## **_Usage:_**

### For `Maven`, inside `dependencies` tag of `pom.xml`, copy the following

> ```xml
> <dependency>
>  <groupId>best.skn</groupId>
>  <artifactId>skn-java-color</artifactId>
>  <version>1.4.0</version>
> </dependency>
> ```

### For `Gradle`, inside `dependencies` block of `build.gradle.kts`, copy the following

> ```kotlin
> implementation("best.skn:skn-java-color:1.4.0")
> ```

### Inside your Java Code, import the package like this

> ```java
> import best.skn.utils.color.Color;
> ```

### Use the package like this

> ```java
> public class Cat {
>   public void createSound() {
>     System.out.println(Color.blue("Meow!"));
>   }
> }
> ```

&nbsp;

## **_Dedicated To:_**

- 👩‍🎨`Prodipta Das Logno` & 🧛‍♀️`Atoshi Sarker Prithula`: The two most special ladies of my life. My best wishes will always be with you two. May you two always be happy.
- 💯`My Parents`: The greatest treasures of my life ever.

&nbsp;

## **_License:_**

Copyright (C) 2024 SKN Shukhan

Licensed under the Apache License, Version 2.0
