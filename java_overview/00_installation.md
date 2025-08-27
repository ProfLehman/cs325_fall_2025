# Installing Java (Windows & Mac)

Java is required for this course.  
Follow the instructions below to install Java on your computer.

---

## 💻 Windows Installation Options

### 1. Manual Download
- Visit a vendor’s site:
  - [Eclipse Temurin](https://adoptium.net/)
  - [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
  - [Amazon Corretto](https://aws.amazon.com/corretto/)
  - [Microsoft Build of OpenJDK](https://learn.microsoft.com/en-us/java/openjdk/)
- Download the `.msi` installer.
- Installs into:  
  `C:\Program Files\Java\`

---

### 2. Package Manager (**Recommended**)
- Windows 11 includes **winget**, a built-in package manager.
- Install Java with one command and update later
  ```powershell
  winget install EclipseAdoptium.Temurin.21.JDK
  
  winget upgrade EclipseAdoptium.Temurin.21.JDK
  ```

---

### 3. Visual Studio Code Auto-Install

* VS Code can install Java when you open a `.java` file.
* Quick and easy, but less control over version and location.

---

## 🍏 Mac Installation Options

### 1. Manual Download

* Download a `.pkg` installer from:

  * [Eclipse Temurin](https://adoptium.net/)
  * [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
  * [Amazon Corretto](https://aws.amazon.com/corretto/)
  * [Microsoft Build of OpenJDK](https://learn.microsoft.com/en-us/java/openjdk/)
* Installs into:
  `/Library/Java/JavaVirtualMachines/`

---

### 2. Homebrew (**Recommended**)

* Install [Homebrew](https://brew.sh/) if not already installed.
* Then run:

  ```bash
  brew install openjdk@21
  ```
* Adds Java to your system and symlinks it for use in Terminal.

---

### 3. SDKMAN! (Optional Advanced Tool)

* Useful for managing multiple JDK versions.
* Install SDKMAN!:

  ```bash
  curl -s "https://get.sdkman.io" | bash
  ```
* Then install Java:

  ```bash
  sdk install java 21-tem
  ```

---

## ✅ Course Recommendation

* **Windows:** Use **winget** to install **Eclipse Temurin JDK 21**
* **Mac:** Use **Homebrew** to install **OpenJDK (Temurin) 21**
* Both are free, reliable, and easy to update.

---

## 🔎 Verify Your Installation

Open a terminal (PowerShell on Windows or Terminal on Mac) and run:

```bash
java -version

javac -version
```

You should see output similar to:

```
openjdk version "21.0.x"  OpenJDK Runtime Environment Temurin-21...
```

---


