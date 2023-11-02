# Java "Hello World" Multi-Language MVC Example

This repository contains a Java program using the Model-View-Controller (MVC) pattern that prompts the user for a language code and then prints out the greeting "Hello, World!" in the chosen language to the console.

## Table of Contents

- [Getting Started](#getting-started)
- [Usage](#usage)
- [Structure](#structure)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Make sure you have the Java Development Kit (JDK) installed on your machine.

### Installation

1. Clone the repository:

```bash
git clone https://github.com/yourusername/example.java.helloworld.git
```

### Navigate to the project directory:

```bash
cd example.java.helloworld
```

### Navigate to the project directory:

```bash
cd example.java.helloworld
```

### Compile the Java files:

```bash
javac Main.java controller/*.java model/*.java view/*.java
```

### Usage

Run the program:

```bash
java Main
```

Enter the desired language code when prompted (e.g., 'en' for English, 'fa' for Persian, 'fr' for French, 'es' for Spanish). You should see the greeting in the chosen language.

### Structure

The project adopts the Model-View-Controller (MVC) design pattern and has the following directory structure:

```
example.java.helloworld/
|-- Controller/
|   `-- GreetingController.java
|-- Model/
|   `-- LanguageCodes.java
|-- View/
|   `-- GreetingView.java
|-- Main.java
|-- .gitignore
`-- MANIFEST.txt
`-- README.md

```
