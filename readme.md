# 🧪 Basic HTTP Server in Java

A simple, lightweight HTTP server implemented from scratch in Java.  
This project is an educational tool designed to demystify how web servers operate by manually handling socket connections, parsing HTTP requests, and sending back valid HTTP responses — all without external frameworks.

---

## 📖 Table of Contents

- Features
- Project Structure
- Installation
- Running the Server
- Requirements
- Purpose
- Examples
- Reference
- License

---

## 🚀 Features

- Accepts incoming TCP socket connections
- Parses HTTP request lines and headers manually
- Sends back valid HTTP responses
- Uses only core Java networking APIs (`java.net.*`)
- Designed to be easily extended (routing, methods, static files, etc.)

---

## 📁 Project Structure

```text
src/
└── main/
    └── java/
        └── com/
            └── myprojects/
                └── httpserver/
                    └── Http.java   # Main server entry point
```
Additional classes can be added here as the server grows (routing, response handling, etc.)

---

## 💾 Installation
Ensure you have Java 8+ and Maven 3+ installed.

Clone the repository:
```bash
git clone https://github.com/your-username/basic-http-server-java.git
cd basic-http-server-java
```
Build the project:
```bash
mvn clean compile
```

## ▶️ Running the Server
Start the server using Maven:
```bash
mvn exec:java -Dexec.mainClass=com.myprojects.httpserver.Http
```

If successful, you should see:
```csharp
My server is getting started...
```

## 🛠 Requirements
- Java 8 or higher
- Maven 3 or higher

## 🎯 Purpose
This project serves as a learning tool to understand the fundamental mechanics of how HTTP servers operate under the hood.

By manually:
- Handling raw socket connections
- Parsing protocol data
- Generating responses

…you gain deep insight into how servers process and respond to web traffic without relying on frameworks.

## 💡 Examples
Ideas for extending the server:
- Add basic routing (/hello → “Hello, world!”)
- Support multiple HTTP methods (GET, POST, etc.)
- Serve static HTML files
- Log HTTP requests
- Add multithreading for handling multiple clients

## 📚 Reference
This project was inspired by the concepts presented in this educational resource:

### 🎥 YouTube Playlist – Building a Java HTTP Server from Scratch
https://www.youtube.com/playlist?list=PLAuGQNR28pW56GigraPdiI0oKwcs8gglW

## 📜 License
This project is licensed under the MIT License.
Feel free to use, modify, and distribute it as you wish.