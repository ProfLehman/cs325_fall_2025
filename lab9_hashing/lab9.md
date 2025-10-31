
# CS 325 Data Structures

## Lab #9 – Hashing
**Points:** 25

---

### Purpose

The purpose of this assignment is to gain a basic understanding of **hashing**, **hash functions**, **linear probing**, and **chaining**.
You must use a **spreadsheet** to show your answers.

---

## Part I – Hash Functions (9 points)

Given the sample data list of 14 names and keys, show the **initial hash position** using an **array size of 23** for each of the following hash functions:

A. **Mod hash**  
B. **Mid-squares hash**  
C. **String hash**      

Use the **6-digit student ID** for the mod and mid-square hashes.
For mid-square, use the **middle four digits**.

Use the **name** as the key for the string hash and develop your own hashing function using the **ASCII values**.
Describe your hashing function in **one or two paragraphs** with examples.

> **Note:** Clearly show all calculations and/or code used to assist with your calculations.
> Upload your spreadsheet with all answers.

---

## Part II – Hash Table Insertion (12 points)

Place each of the 14 sample items into a **hash table of size 23** using your hash functions (A, B, & C) and the specified method to resolve collisions:

1. **Separate chaining**
2. **Linear probing**

Show the resulting **memory diagrams**.
Use the insertion order shown (top to bottom of the list).
You will have a total of **six memory diagrams** labeled as follows:

| Label | Hash Function   | Collision Resolution |
| ----- | --------------- | -------------------- |
| 1A    | Mod hash        | Separate chaining    |
| 1B    | Mid-square hash | Separate chaining    |
| 1C    | String hash     | Separate chaining    |
| 2A    | Mod hash        | Linear probing       |
| 2B    | Mid-square hash | Linear probing       |
| 2C    | String hash     | Linear probing       |

---

## Part III – Deletion (4 points)

After the insertions, delete **four entries** for the following diagrams only:

* **1A** (mod hash with chaining)
* **2A** (mod hash with linear probing)

Show the resulting memory diagrams after deletion.
Pick **two entries** that were part of collisions.

---

## Turn-In

Upload your completed **spreadsheet** to the class website.

---

## Implementation Notes

An array of nodes can be used to store the data for both chaining and linear probing:

```java
node hashTable[] = new node[23];
```

* `id` is the **key** for 1A, 1B, 2A, and 2B
* `name` is the **key** for 1C and 2C

---

### Chaining Structure (for 1A, 1B, 1C)

```java
node {
    String name;
    int id;
    node next;
}
```

### Linear Probing Structure (for 2A, 2B, 2C)

Single field used for both key and status:

```java
node {
    String name;
    int id; // 0+ contains key, -1 empty since start, -2 empty since removal
}
```

Alternate approach with a separate status field:

```java
node {
    String name;
    int id;
    int status; // 1 contains key, -1 empty since start, -2 empty since removal
}
```

---

## Sample Data

| Name              | Key    |
| ----------------- | ------ |
| HOSEA             | 377267 |
| JOEL              | 309634 |
| AMOS              | 113985 |
| OBADIAH           | 326638 |
| JONAH             | 437494 |
| MICAH             | 346184 |
| NAHUM             | 378834 |
| HABAKKUK          | 457892 |
| ZEPHANIAH         | 381083 |
| HAGGAI            | 303840 |
| ZECHARIAH         | 388591 |
| MALACHI           | 244456 |
| *Your First Name* | 340462 |
| *Your Last Name*  | 264173 |

---

-- end --

